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

import java.io.IOException;
import java.util.Scanner;

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
    // The skip counter for player (max 3).
    int playerSkipCounter = 0;
    // The skip counter for computer (max 3).
    int computerSkipCounter = 0;

    // Constructor.

    // Default constructor.
    State() {
        // Initialize the state variables.
        drawPile = "";
        discardPile = "";
        playerHand = "";
        computerHand = "";
        playerTurn = false;
        init();
    }

    // Initialize the game state.
    public void init() {
        // Encode the deck as follows:
        // Each entry is a card.
        // The first character is the number of the card (A, 2, 3, 4, 5, 6, 7, 8, 9, T, J, Q, K).
        // The second character is the family of the card (S, H, D, C).
        // A comma separates each card.
        // Here, the deck is not shuffled, instead, we choose cards from the deck at random.

        // The deck.
        for (int i = 0; i < 4; i++) {
            // For each family.
            for (int j = 1; j <= 13; j++) {
                if (j == 1) {
                    // Ace.
                    drawPile += "A";
                } else if (j == 10) {
                    // Ten.
                    drawPile += "T";
                } else if (j == 11) {
                    // Jack.
                    drawPile += "J";
                } else if (j == 12) {
                    // Queen.
                    drawPile += "Q";
                } else if (j == 13) {
                    // King.
                    drawPile += "K";
                } else {
                    // Number.
                    drawPile += j;
                }
                // Add the family.
                if (i == 0) {
                    // Spades.
                    drawPile += "S";
                } else if (i == 1) {
                    // Hearts.
                    drawPile += "H";
                } else if (i == 2) {
                    // Diamonds.
                    drawPile += "D";
                } else if (i == 3) {
                    // Clubs.
                    drawPile += "C";
                }
                // Add a comma.
                drawPile += ",";
            }
        }

        // Equip the player hand with 5 cards.
        for (int i = 0; i < 5; i++) {
            // Draw a card.
            String card = drawCard();
            // Add the card to the player's hand.
            playerHand += card;
        }

        // Equip the computer hand with 5 cards.
        for (int i = 0; i < 5; i++) {
            // Draw a card.
            String card = drawCard();
            // Add the card to the computer's hand.
            computerHand += card;
        }

        // Top card of the drawPile is added to the discardPile.
        discardPile += drawCard();

        // The first turn is given to the computer.
        playerTurn = false;
    }

    // Utility functions.

    // Check if a String represents a valid card.
    public boolean isValidCard(String card) {
        // The card must be of length 3 (number, family, comma).
        if (card.length() != 3) {
            System.out.println("Invalid " + card + " length: " + card.length());
            return false;
        }
        // The first character must be a valid number.
        if (card.charAt(0) != 'A' && card.charAt(0) != '2' && card.charAt(0) != '3' && card.charAt(0) != '4'
                && card.charAt(0) != '5' && card.charAt(0) != '6' && card.charAt(0) != '7' && card.charAt(0) != '8'
                && card.charAt(0) != '9' && card.charAt(0) != 'T' && card.charAt(0) != 'J' && card.charAt(0) != 'Q'
                && card.charAt(0) != 'K') {
                    System.out.println("Invalid card number.");
                    return false;
        }
        // The second character must be a valid family.
        if (card.charAt(1) != 'S' && card.charAt(1) != 'H' && card.charAt(1) != 'D' && card.charAt(1) != 'C') {
            System.out.println("Invalid card family.");
            return false;
        }
        // The third character must be a comma.
        if (card.charAt(2) != ',') {
            System.out.println("Invalid card connector.");
            return false;
        }
        // If all the above conditions are satisfied, the card is valid.
        return true;
    }

    // Display a card in a readable format.
    public String displayCard(String card) {
        String result = "";

        // If the number is 2-9, keep as is. Turn T into 10, J into Jack, Q into Queen, K into King, A into Ace.
        if (card.charAt(0) == 'T') {
            result += "10";
        } else if (card.charAt(0) == 'J') {
            result += "Jack";
        } else if (card.charAt(0) == 'Q') {
            result += "Queen";
        } else if (card.charAt(0) == 'K') {
            result += "King";
        } else if (card.charAt(0) == 'A') {
            result += "Ace";
        } else {
            result += card.charAt(0);
        }
        // Add a connector.
        result += " of ";
        // Turn S into Spades, H into Hearts, D into Diamonds, C into Clubs.
        if (card.charAt(1) == 'S') {
            result += "Spades";
        } else if (card.charAt(1) == 'H') {
            result += "Hearts";
        } else if (card.charAt(1) == 'D') {
            result += "Diamonds";
        } else if (card.charAt(1) == 'C') {
            result += "Clubs";
        }
        // Return the result.
        return result;
    }

    // Display the player's hand in a readable format.
    public void displayPlayerHand() {
        // The player's hand.
        String hand = "";
        // For each card in the player's hand.
        for (int i = 0; i < playerHand.length(); i += 3) {
            // Add the card to the player's hand.
            hand += displayCard(playerHand.substring(i, i + 3));
            // Add a comma except for the last card.
            if (i != playerHand.length() - 3) {
                hand += ", ";
            }
        }
        // Display the player's hand.
        System.out.println(hand);
    }

    // Return the top card of the discard pile.
    public String returnTopPlayedCard() {
        return discardPile.substring(discardPile.length() - 3);
    }

    // Draw a card from the draw pile.
    public String drawCard() {
        // draw a random card from the draw pile.
        // The card should have a valid format: number, family, comma.
        // Since this is 3 characters, we can randomly choose an index which is a multiple of 3 within the bounds.
        // The card is then the substring from the index to index + 3.
        // The card is then removed from the draw pile.
        // This is repeated until a valid card is found.

        // The card.
        String card = "";
        boolean isValidCard = false;

        while (!isValidCard) {
            // If the deck is empty, the discard pile becomes the draw pile, and the discard pile is reset.
            if (drawPile.equals("")) {
                // The discard pile becomes the draw pile.
                drawPile = discardPile;
                // The discard pile is reset.
                discardPile = "";
                // If the draw pile is still empty, the game is a draw.
                if (drawPile.equals("")) {
                    // The game is a draw.
                    System.out.println("The game is a draw!");
                    System.exit(0);
                }
            }

            // The index.
            int index = (int) (Math.random() * (drawPile.length() / 3)) * 3;
            // The card.
            card = drawPile.substring(index, index + 3);
            // Remove the card from the draw pile.
            drawPile = drawPile.substring(0, index) + drawPile.substring(index + 3);

            // Check if the card is valid.
            if (isValidCard(card)) {
                // The card is valid.
                isValidCard = true;
            }
        }
        // Return the card.
        return card;
    }

    // Check if the card entered by the palyer can be played.
    public boolean checkPlayerCardValidity(String card) {
        // First, check if the card is in the proper format.
        if (!isValidCard(card)) {
            // The card is not in the proper format.
            return false;
        }
        // Next, check if the card is in the player's hand.
        if (!playerHand.contains(card)) {
            // The card is not in the player's hand.
            return false;
        }
        // Next, check if the card can be played according to the rules.
        // For this, we need the top card of the discard pile.
        String topCard = returnTopPlayedCard();
        // If the card is of the same number, it can be played and the player's turn continues.
        if (card.charAt(0) == topCard.charAt(0)) {
            // The card can be played.
            return true;
        }
        // If the card is of the same family, it can be played and the player's turn ends.
        if (card.charAt(1) == topCard.charAt(1)) {
            // The card can be played.
            // The turn flips.
            playerTurn = !playerTurn;
            return true;
        }
        // If the player enters an 8, it can be played and the player's turn ends.
        if (card.charAt(0) == '8') {
            // The card can be played.
            // The turn flips.
            playerTurn = !playerTurn;
            return true;
        }
        // If none of the above conditions are satisfied, the card cannot be played.
        return false;
    }

    // Check if the player has any valid cards to play.
    public boolean checkPlayerPlayable() {
        // For each card in the player's hand.
        for (int i = 0; i < playerHand.length(); i += 3) {
            // The card.
            String card = playerHand.substring(i, i + 3);
            // Check if the card is valid.
            if (isValidCard(card)) {
                // Get the top card of the discard pile.
                String topCard = returnTopPlayedCard();
                // If the card is of the same number, same family, or an 8, it can be played.
                if (card.charAt(0) == topCard.charAt(0) || card.charAt(1) == topCard.charAt(1)
                        || card.charAt(0) == '8') {
                    // The card can be played.
                    return true;
                        }
            }
        }
        // If none of the cards are valid, the player cannot play.
        return false;
    }

    // Get the first available valid card to play from the computer's hand.
    public String getValidComputerCard() {
        // For each card in the computer's hand.
        for (int i = 0; i < computerHand.length(); i += 3) {
            // The card.
            String card = computerHand.substring(i, i + 3);
            // Check if the card is valid.
            if (checkPlayerCardValidity(card)) {
                // The card is valid.
                return card;
            }
        }
        // If none of the cards are valid, the computer cannot play.
        return "";
    }

    // Game Loops.

    // The player's turn.
    public void PlayerTurn(Scanner sc) {
        // Display the player's hand.
        System.out.println("Your hand: ");
        displayPlayerHand();

        // Display the top card of the discard pile.
        System.out.println("Top card of the discard pile:\n" + displayCard(returnTopPlayedCard()));

        // Check if the player has any valid cards to play. If not, draw a card and skip the turn automatically.
        if (!checkPlayerPlayable()) {
            // The player has no valid cards to play.
            System.out.println("You have no valid cards to play. You must draw a card.\n");
            // Draw a card from the draw pile.
            String drawnCard = drawCard();
            // Add the card to the player's hand.
            playerHand += drawnCard;
            // Display the card.
            System.out.println("You drew:\n" + displayCard(drawnCard) + "\n");
            // The player skip counter is incremented.
            playerSkipCounter++;
            // If the player skip counter is 3, the player's turn ends.
            if (playerSkipCounter == 3) {
                // The player's turn ends.
                playerTurn = !playerTurn;
            }
            return;
        }

        // Ask the player to enter a card.
        System.out.println("Enter a card to play (Enter None to skip):");
        // The card.
        String card = sc.nextLine() + ",";

        // If the player enters None, skip the turn.
        if (card.equals("None")) {
            // The player skips the turn.
            System.out.println("You skipped your turn.\n");
            // Draw a card from the draw pile.
            String drawnCard = drawCard();
            // Add the card to the player's hand.
            playerHand += drawnCard;
            // Display the card.
            System.out.println("You drew:\n" + displayCard(drawnCard) + "\n");
            // The player skip counter is incremented.
            playerSkipCounter++;
            // If the player skip counter is 3, the player's turn ends.
            if (playerSkipCounter == 3) {
                // The player's turn ends.
                playerTurn = !playerTurn;
                // The player skip counter is reset.
                playerSkipCounter = 0;
            }
            return;
        }
        // If user enters 10 instead of T, replace it with T.
        if (card.charAt(0) == '1' && card.charAt(1) == '0') {
            card = "T" + card.substring(2);
        }

        // Check if the card is valid.
        if (!checkPlayerCardValidity(card) && !card.equals("None")) {
            // The card is not valid.
            System.out.println("Invalid card. Please try again.\n");
            // Repeat the player's turn.
            PlayerTurn(sc);
        } else {
            // The card is valid.
            // Remove the card from the player's hand.
            playerHand = playerHand.substring(0, playerHand.indexOf(card)) + playerHand.substring(playerHand.indexOf(card) + 3);
            // Add the card to the discard pile.
            discardPile += card;
            // Display the card.
            System.out.println("You played:\n" + displayCard(card) + "\n");

            // The player skip counter is reset.
            playerSkipCounter = 0;
        }
    }

    // The computer's turn.
    public void ComputerTurn() {
        // Print the top card of the discard pile.
        System.out.println("Top card of the discard pile:\n" + displayCard(returnTopPlayedCard()));

        // Check if the computer has any valid cards to play. If not, draw a card and skip the turn automatically.
        String card = getValidComputerCard();

        if (card.equals("")) {
            // The computer has no valid cards to play.
            System.out.println("The computer has no valid cards to play. It must draw a card.\n");
            // Draw a card from the draw pile.
            String drawnCard = drawCard();
            // Add the card to the computer's hand.
            computerHand += drawnCard;
            // Display the card.
            System.out.println("The computer drew:\n" + displayCard(drawnCard) + "\n");
            // The computer skip counter is incremented.
            computerSkipCounter++;
            // If the computer skip counter is 3, the computer's turn ends.
            if (computerSkipCounter == 3) {
                // The computer's turn ends.
                playerTurn = !playerTurn;
                // The computer skip counter is reset.
                computerSkipCounter = 0;
            }
            return;
        }

        // The card is valid.
        // Remove the card from the computer's hand.
        computerHand = computerHand.substring(0, computerHand.indexOf(card)) + computerHand.substring(computerHand.indexOf(card) + 3);
        // Add the card to the discard pile.
        discardPile += card;
        // Display the card.
        System.out.println("The computer played:\n" + displayCard(card) + "\n");

        // The computer skip counter is reset.
        computerSkipCounter = 0;
    }

    // The game loop.
    public void GameLoop (Scanner sc) {
        // The game loop.
        while (true) {
            // If the player's turn is true, it is the player's turn.
            if (playerTurn) {
                // The player's turn.
                PlayerTurn(sc);
            } else {
                // The computer's turn.
                ComputerTurn();
            }

            // Check if the player has won.
            if (playerHand.equals("")) {
                // The player has won.
                System.out.println("You won!");
                return;
            }
            // Check if the computer has won.
            if (computerHand.equals("")) {
                // The computer has won.
                System.out.println("The computer won!");
                return;
            }
        }
    }
}


// The main class.
public class KrazyEight {
    // The main function.
    public static void main (String[] args) throws Exception {
        // The scanner.
        Scanner sc = new Scanner(System.in);

        // The game state.
        State state = new State();

        // The game loop.
        state.GameLoop(sc);

        // Close the scanner.
        sc.close();
    }
}