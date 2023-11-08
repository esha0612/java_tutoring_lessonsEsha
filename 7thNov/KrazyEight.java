// Rules of the game:
// 1. Deck of 52 cards (13 each symbol)
// 2. Numbers and symbols(/family)
// 3. If player has a card in the same suite, they can put down the card and move on.
// 4. If player has a card of the name number (regardless of family), they can put down the card and repeat their turn.
// 5. First move belongs to the computer.
// 6. Player and computer both start with 5 cards each.
// 7. A random 8 is the wildcard.
// 8. Everything else constitutes the draw pile.
// 9. If player is unable to put a card down, they must draw a card from the draw pile.
// 10. Whichever player empties their hand first is declared the victor.

class State {
    // Tracks the state of all the variables required.
    // By order of the supreme leader, arrays are not allowed.

    // State variables.
    // The draw pile.
    String drawPile;
    // The discard pile.
    String discardPile;
    // The player's hand.
    String playerHand;
    // The computer's hand.
    String computerHand;
    // Turn tracker.
    boolean playerTurn;

    // Constructor.

    // Default constructor.
    public State() {
        this.drawPile = "";
        this.discardPile = "";
        this.playerHand = "";
        this.computerHand = "";
        this.init();
    }

    // Utility functions

    // Initializes the state of the game.
    public void init() {
        // Initialize the deck to contain all the cards in the manner specified, separated by commas.
        for (int i = 1; i <= 13; i++) {
            for (int j = 0; j < 4; j++) {
                if (i == 1) {
                    this.drawPile += "A";
                } else if (i == 11) {
                    this.drawPile += "J";
                } else if (i == 12) {
                    this.drawPile += "Q";
                } else if (i == 13) {
                    this.drawPile += "K";
                } else {
                    this.drawPile += Integer.toString(i);
                }
                if (j == 0) {
                    this.drawPile += "S";
                } else if (j == 1) {
                    this.drawPile += "H";
                } else if (j == 2) {
                    this.drawPile += "C";
                } else if (j == 3) {
                    this.drawPile += "D";
                }
                this.drawPile += ",";
            }
        }
        
        // Choose 5 cards for the player and 5 cards for the computer.
        for (int i = 0; i < 5; i++) {
            this.playerHand += drawCard() + ",";
            this.computerHand += drawCard() + ",";
        }
        
        // Choose a random card from the draw pile and put it in the discard pile to start the game.
        String card = drawCard();
        this.discardPile += card + ",";
    }

    // Checks if the string passed to it represents a valid card (must have a number/AJQK and a symbol).
    public boolean isValidCard(String card) {
        // Check if the card is of length 2 or 3.
        if (card.length() != 2 && card.length() != 3) {
            return false;
        }
        // First character must be a number>0 or A/J/Q/K.
        if (card.charAt(0) < '1' || card.charAt(0) > '9') {
            if (card.charAt(0) != 'A' && card.charAt(0) != 'J' && card.charAt(0) != 'Q' && card.charAt(0) != 'K') {
                return false;
            }
            // If the first character is 1, the second character must be 0.
            if (card.charAt(0) == '1' && card.charAt(1) != '0') {
                return false;
            }
        }
        // Second character must be a valid symbol (S/H/C/D) or 0.
        if (card.charAt(1) != 'S' && card.charAt(1) != 'H' && card.charAt(1) != 'C' && card.charAt(1) != 'D'
                && card.charAt(1) != '0') {
            return false;
        }
        // If the card is of length 3, the third character must be a valid symbol (S/H/C/D).
        if (card.length() == 3) {
            if (card.charAt(2) != 'S' && card.charAt(2) != 'H' && card.charAt(2) != 'C' && card.charAt(2) != 'D') {
                return false;
            }
        }
        return true;
    }

    // Choose a random card from the deck, remove it from the deck and return it.
    public String drawCard() {
        // If the draw pile is empty, check if the discard pile is empty.
        if (this.drawPile.length() == 0) {
            // If the discard pile is empty, return null.
            if (this.discardPile.length() == 0) {
                return null;
            }
            // If the discard pile is not empty, shuffle the discard pile into the draw pile.
            this.drawPile = this.discardPile;
            this.discardPile = "";
        }
        // Choose a random card from the deck.
        int randomIndex = (int) (Math.random() * this.drawPile.length());
        // Get the card.
        String card = this.drawPile.substring(randomIndex, randomIndex + 2);
        // If the first character is 1, get the third character as well.
        if (card.charAt(0) == '1') {
            card += this.drawPile.charAt(randomIndex + 2);
        }
        // Check if the card is valid. If not, draw another card.
        if (!isValidCard(card)) {
            return drawCard();
        }
        // Remove the card from the deck if it is valid. If the card is of length 3, remove 3 characters. Also remove the comma.
        this.drawPile = this.drawPile.substring(0, randomIndex) + this.drawPile.substring(randomIndex + card.length() + 1);
        // Return the card.
        return card;
    }

    // Returns the card at the top of the discard pile.
    public String getTopCard() {
        // If the discard pile is empty, return null.
        if (this.discardPile.length() == 0) {
            return null;
        }
        // Return the card at the top of the discard pile. If the first character is 1, return the third character as well.
        String card = this.discardPile.substring(this.discardPile.length() - 3);
        if (card.charAt(0) == '1') {
            card += this.discardPile.charAt(this.discardPile.length() - 1);
        }
        return card;
    }

    // Check if the player holds a card that can be put down. If so, return the card, remove it from the player's hand and put it in the discard pile.
    // The criteria is that the player must hold either a card of the same family or a card of the same number, or an 8.
    public int canPlay() {
        // Return -1 if the player cannot play.
        // Return 0 if the player can play a card of the same number.
        // Return 1 if the player can play a card of the same family.
        // Return 2 if the player can play an 8.

        // Get the top card of the discard pile.
        String topCard = getTopCard();

        // If the top card is null, return false.
        if (topCard == null) {
            return -1;
        }

        // Check if the player has a card of the same number.
        // This order is important because if the player has a card of the same number, they can repeat their turn.
        for (int i = 0; i < this.playerHand.length(); i += 1) {
            String card = this.playerHand.substring(i, i + 2);
            if (card.charAt(0) == '1') {
                card += this.playerHand.charAt(i + 2);
            }
            if (card.charAt(0) == topCard.charAt(0)) {
                // Remove the card from the player's hand.
                this.playerHand = this.playerHand.substring(0, i) + this.playerHand.substring(i + card.length() + 1);
                // Put the card in the discard pile.
                this.discardPile += card + ",";
                return 0;
            }
        }

        // Check if the player has a card of the same family.
        for (int i = 0; i < this.playerHand.length(); i += 1) {
            String card = this.playerHand.substring(i, i + 2);
            if (card.charAt(0) == '1') {
                card += this.playerHand.charAt(i + 2);
            }
            if (card.charAt(1) == topCard.charAt(1)) {
                // Remove the card from the player's hand.
                this.playerHand = this.playerHand.substring(0, i) + this.playerHand.substring(i + card.length() + 1);
                // Put the card in the discard pile.
                this.discardPile += card + ",";
                return 1;
            }
        }

        // Check if the player has an 8.
        for (int i = 0; i < this.playerHand.length(); i += 1) {
            String card = this.playerHand.substring(i, i + 2);
            if (card.charAt(0) == '1') {
                card += this.playerHand.charAt(i + 2);
            }
            if (card.charAt(0) == '8') {
                // Remove the card from the player's hand.
                this.playerHand = this.playerHand.substring(0, i) + this.playerHand.substring(i + card.length() + 1);
                // Put the card in the discard pile.
                this.discardPile += card + ",";
                return 2;
            }
        }

        // If the player has no cards that can be played, return -1.
        return -1;
    }

    // Check if the computer holds a card that can be put down. If so, return the card, remove it from the computer's hand and put it in the discard pile.
    // The criteria is that the computer must hold either a card of the same family or a card of the same number, or an 8.
    public int computerPlay() {
        // Return -1 if the computer cannot play.
        // Return 0 if the computer can play a card of the same number.
        // Return 1 if the computer can play a card of the same family.
        // Return 2 if the computer can play an 8.

        // Get the top card of the discard pile.
        String topCard = getTopCard();

        // If the top card is null, return false.
        if (topCard == null) {
            return -1;
        }

        // Check if the computer has a card of the same number.
        // This order is important because if the computer has a card of the same number, they can repeat their turn.
        for (int i = 0; i < this.computerHand.length(); i += 1) {
            String card = this.computerHand.substring(i, i + 2);
            if (card.charAt(0) == '1') {
                card += this.computerHand.charAt(i + 2);
            }
            if (card.charAt(0) == topCard.charAt(0)) {
                // Remove the card from the computer's hand.
                this.computerHand = this.computerHand.substring(0, i) + this.computerHand.substring(i + card.length() + 1);
                // Put the card in the discard pile.
                this.discardPile += card + ",";
                return 0;
            }
        }

        // Check if the computer has a card of the same family.
        for (int i = 0; i < this.computerHand.length(); i += 1) {
            String card = this.computerHand.substring(i, i + 2);
            if (card.charAt(0) == '1') {
                card += this.computerHand.charAt(i + 2);
            }
            if (card.charAt(1) == topCard.charAt(1)) {
                // Remove the card from the computer's hand.
                this.computerHand = this.computerHand.substring(0, i) + this.computerHand.substring(i + card.length() + 1);
                // Put the card in the discard pile.
                this.discardPile += card + ",";
                return 1;
            }
        }

        // Check if the computer has an 8.
        for (int i = 0; i < this.computerHand.length(); i += 1) {
            String card = this.computerHand.substring(i, i + 2);
            if (card.charAt(0) == '1') {
                card += this.computerHand.charAt(i + 2);
            }
            if (card.charAt(0) == '8') {
                // Remove the card from the computer's hand.
                this.computerHand = this.computerHand.substring(0, i) + this.computerHand.substring(i + card.length() + 1);
                // Put the card in the discard pile.
                this.discardPile += card + ",";
                return 2;
            }
        }

        // If the computer has no cards that can be played, return -1.
        return -1;
    }

    // The main state transition function.
    // @return: true if the game is over, false otherwise.
    public boolean StateManager() {
        // If either the player's hand or the computer's hand is empty, return true.
        if (this.playerHand.length() == 0 || this.computerHand.length() == 0) {
            return true;
        }
        // If it is the player's turn, check if the player can play a card.
        if (this.playerTurn) {
            // If the player can play a card, return false.
            int canPlay = canPlay();
            // If canPlay is 1 or 2, the next turn is the computer's.
            if (canPlay == 1 || canPlay == 2) {
                this.playerTurn = false;
            }
            // If canPlay is 0, the next turn is the player's.
            if (canPlay == 0) {
                this.playerTurn = true;
            }
            // If canPlay is -1, the player must draw a card.
            if (canPlay == -1) {
                // Draw a card.
                String card = drawCard();
                // If the card is null, return true.
                if (card == null) {
                    return true;
                }
                // If the card is not null, add it to the player's hand.
                this.playerHand += card + ",";
                // The next turn is the computer's.
                this.playerTurn = false;
            }
        }
        // If it is the computer's turn, check if the computer can play a card.
        if (!this.playerTurn) {
            // If the computer can play a card, return false.
            int canPlay = computerPlay();
            // If canPlay is 1 or 2, the next turn is the player's.
            if (canPlay == 1 || canPlay == 2) {
                this.playerTurn = true;
            }
            // If canPlay is 0, the next turn is the computer's.
            if (canPlay == 0) {
                this.playerTurn = false;
            }
            // If canPlay is -1, the computer must draw a card.
            if (canPlay == -1) {
                // Draw a card.
                String card = drawCard();
                // If the card is null, return true.
                if (card == null) {
                    return true;
                }
                // If the card is not null, add it to the computer's hand.
                this.computerHand += card + ",";
                // The next turn is the player's.
                this.playerTurn = true;
            }
        }
        // If the game is not over, return false.
        return false;
    }

    // Main game loop.
    public void gameLoop() {
        // While the game is not over, keep playing.
        while (!StateManager()) {
            // Do nothing.
        }
        // If the game is over, print the winner.
        if (this.playerHand.length() == 0) {
            System.out.println("Player wins!");
        } else {
            System.out.println("Computer wins!");
        }
    }
}

public class KrazyEight {  
    // Main method
    public static void main(String[] args) {
        // Create a new state.
        State state = new State();
        // Print the deck.
        System.out.println(state.drawPile);
        // Print the player's hand.
        System.out.println(state.playerHand);
        // Print the computer's hand.
        System.out.println(state.computerHand);
        // Print the discard pile.
        System.out.println(state.discardPile);
        // Print the top card of the discard pile.
        System.out.println(state.getTopCard());
        // Play the game.
        state.gameLoop();
    }
}