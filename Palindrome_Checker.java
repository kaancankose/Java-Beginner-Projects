import java.util.Scanner;

public class Palindrome_Checker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a word or phrase:");
        String input = scanner.nextLine();

        // Remove non-alphanumeric characters and convert to lower case
        String cleanedInput = input.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        String reversed = new StringBuilder(cleanedInput).reverse().toString();

        if (cleanedInput.equals(reversed)) {
            System.out.println("It's a palindrome!");
        } else {
            System.out.println("It's not a palindrome.");
        }
        scanner.close();
    }
}
