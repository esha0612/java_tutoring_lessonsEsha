import java.lang.Math;

public class MCQ7 {
    public static void main(String args[])   
    {  
        String computerMove;  
        switch ((int)(3 * Math.random()))
        {  
            case 0:  
                computerMove = "Rock";  
                break;
            case 1:  
                computerMove = "Scissors";  
                break;  
            case 2:  
                computerMove = "Paper";  
                break;
        }
        System.out.println("Computer's move is " + computerMove);
    }
}

// The output will be:
// 1. Computer's move is Rock
// 2. Computer's move is Scissors
// 3. Computer's move is Paper
// 4. Compilation fails -> Correct answer
// 5. None of the above