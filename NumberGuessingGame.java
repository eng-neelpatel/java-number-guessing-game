import java.util.Scanner;
import java.util.Random;

/**
 * Number Guessing Game
 * A simple command-line game where the player tries to guess a random number.
 * 
 * @author Neel Patel
 * @version 1.0
 */
public class NumberGuessingGame {
    
    private static final int MIN_NUMBER = 1;
    private static final int MAX_NUMBER = 100;
    private static final int MAX_ATTEMPTS = 10;
    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        boolean playAgain = true;
        int totalGamesWon = 0;
        int totalGamesPlayed = 0;
        
        System.out.println("====================================");
        System.out.println("   WELCOME TO NUMBER GUESSING GAME");
        System.out.println("====================================");
        
        while (playAgain) {
            int secretNumber = random.nextInt(MAX_NUMBER - MIN_NUMBER + 1) + MIN_NUMBER;
            int attempts = 0;
            boolean hasWon = false;
            
            System.out.println("\nI'm thinking of a number between " + MIN_NUMBER + " and " + MAX_NUMBER);
            System.out.println("You have " + MAX_ATTEMPTS + " attempts to guess it!\n");
            
            while (attempts < MAX_ATTEMPTS && !hasWon) {
                System.out.print("Attempt " + (attempts + 1) + "/" + MAX_ATTEMPTS + " - Enter your guess: ");
                
                try {
                    int guess = scanner.nextInt();
                    attempts++;
                    
                    if (guess < MIN_NUMBER || guess > MAX_NUMBER) {
                        System.out.println("Please enter a number between " + MIN_NUMBER + " and " + MAX_NUMBER);
                    } else if (guess < secretNumber) {
                        System.out.println("Too LOW! Try a higher number.");
                    } else if (guess > secretNumber) {
                        System.out.println("Too HIGH! Try a lower number.");
                    } else {
                        hasWon = true;
                        totalGamesWon++;
                        System.out.println("\n*** CONGRATULATIONS! ***");
                        System.out.println("You guessed the number " + secretNumber + " in " + attempts + " attempts!");
                    }
                } catch (Exception e) {
                    System.out.println("Invalid input! Please enter a valid number.");
                    scanner.nextLine();
                }
            }
            
            if (!hasWon) {
                System.out.println("\nGame Over! The secret number was: " + secretNumber);
            }
            
            totalGamesPlayed++;
            
            System.out.println("\n--- STATS ---");
            System.out.println("Games Played: " + totalGamesPlayed);
            System.out.println("Games Won: " + totalGamesWon);
            System.out.println("Win Rate: " + (totalGamesWon * 100 / totalGamesPlayed) + "%");
            
            System.out.print("\nPlay again? (yes/no): ");
            scanner.nextLine();
            String response = scanner.nextLine().toLowerCase();
            playAgain = response.equals("yes") || response.equals("y");
        }
        
        System.out.println("\nThanks for playing! Goodbye!");
        scanner.close();
    }
}
