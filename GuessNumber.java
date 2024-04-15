import java.util.*;
public class GuessNumber {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        Random random=new Random();


        int lowerbound = 1;
        int upperbound = 100;
        int TargetNumber = random.nextInt(upperbound - lowerbound+1) + lowerbound;
        int PlayerGuess;

        System.out.println("The Number Guessing Game Start");
        System.out.println("Guess a number between " +lowerbound+ " and " +upperbound);

        do 
        {
            System.out.println("Enter your Guessing Number :");
            PlayerGuess = sc.nextInt();

            if (PlayerGuess < TargetNumber)
            {
                System.out.println("The Guessing number is too Low! Try Again.");

            }
            else if (PlayerGuess > TargetNumber)
            {
                System.out.println("The Guessing number is too High! Try Again.");
            }
            else
            {
                System.out.println("Hurrah! You Guessed the TargetNumber.");

            }
        }
            while (PlayerGuess != TargetNumber);   
    }
    
}