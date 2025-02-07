import java.util.Scanner;
import java.util.Random;

public class Hangman_Game {
    public static void main(String[] args) {
        String[] words = { "ismet inonu", "ismail hakki", "muhsin batur", "ilker basbug", "kenan evren", "cemal madanoglu ", "talat aydemir" };
        Random random = new Random();
        String chosenWord = words[random.nextInt(words.length)];
        char[] guessedWord = new char[chosenWord.length()];
        for (int i = 0; i < guessedWord.length; i++) {
            guessedWord[i] = '_';
        }

        int attemptsLeft = 6;
        Scanner scanner = new Scanner(System.in);

        while (attemptsLeft > 0 && new String(guessedWord).contains("_")) {
            System.out.println("Word: " + new String(guessedWord));
            System.out.println("Attempts left: " + attemptsLeft);
            System.out.print("Enter a letter: ");
            char guess = scanner.next().toLowerCase().charAt(0);

            boolean correctGuess = false;
            for (int i = 0; i < chosenWord.length(); i++) {
                if (chosenWord.charAt(i) == guess && guessedWord[i] == '_') {
                    guessedWord[i] = guess;
                    correctGuess = true;
                }
            }

            if (!correctGuess) {
                attemptsLeft--;
                System.out.println("Wrong guess!");
            }
            System.out.println();
        }

        if (new String(guessedWord).equals(chosenWord)) {
            System.out.println("Congratulations! You've guessed the word: " + chosenWord);
        } else {
            System.out.println("Game over! The correct word was: " + chosenWord);
        }
        scanner.close();
    }

}
