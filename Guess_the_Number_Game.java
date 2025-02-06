
import java.util.Random;
import java.util.Scanner;


public class Guess_the_Number_Game {

    public static void main(String[] args) {
        Random random = new Random();
        int numberToGuess = random.nextInt(100) + 1; // Random number between 1 and 100
        int numberOfTries = 0;
        Scanner scanner = new Scanner(System.in);
        int guess = 0;

        System.out.println("Guess a number between 1 and 100:");

        while (guess != numberToGuess) {
            guess = scanner.nextInt();
            numberOfTries++;

            if (guess < numberToGuess) {
                System.out.println("Too low, try again:");
            } else if (guess > numberToGuess) {
                System.out.println("Too high, try again:");
            } else {
                System.out.println("Correct! You guessed the number in " + numberOfTries + " tries.");
            }
        }
        scanner.close();
    }

}
