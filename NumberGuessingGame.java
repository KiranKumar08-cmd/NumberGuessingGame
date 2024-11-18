import java.util.Random;
import java.util.Scanner;

public class NumberguessingGame 
{
    public static void main(String[] args) 
    {
        
        Random random = new Random();
        int targetNumber = random.nextInt(100) + 1; 
        
        
        Scanner scanner = new Scanner(System.in);
        int userGuess = 0; 
        int attempts = 0; 
        
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I'm thinking of a number between 1 and 100. Can you guess what it is?");
        
        
        while (userGuess != targetNumber) {
            System.out.print("Enter your guess: ");
            userGuess = scanner.nextInt(); 
            attempts++; 
            
            if (userGuess > targetNumber) {
                System.out.println("Too high! Try again.");
            } else if (userGuess < targetNumber) {
                System.out.println("Too low! Try again.");
            } else {
                System.out.println("Congratulations! You guessed the correct number in " + attempts + " attempts.");
            }
        }

        scanner.close();
    }
}