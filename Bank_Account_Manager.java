import java.util.Scanner;

public class Bank_Account_Manager {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double balance = 0.0;

        while (true) {
            System.out.println("\nBank Account Manager:");
            System.out.println("1. Deposit");
            System.out.println("2. Withdraw");
            System.out.println("3. Check Balance");
            System.out.println("4. Exit");
            System.out.print("Select an option: ");
            int choice = scanner.nextInt();

            switch (choice) {
                case 1:
                    System.out.print("Enter deposit amount: ");
                    double deposit = scanner.nextDouble();
                    if (deposit > 0) {
                        balance += deposit;
                        System.out.println("Deposit successful. New balance: $" + balance);
                    } else {
                        System.out.println("Invalid deposit amount.");
                    }
                    break;
                case 2:
                    System.out.print("Enter withdrawal amount: ");
                    double withdrawal = scanner.nextDouble();
                    if (withdrawal > 0 && withdrawal <= balance) {
                        balance -= withdrawal;
                        System.out.println("Withdrawal successful. New balance: $" + balance);
                    } else {
                        System.out.println("Invalid withdrawal amount.");
                    }
                    break;
                case 3:
                    System.out.println("Current balance: $" + balance);
                    break;
                case 4:
                    System.out.println("Thank you for using the Bank Account Manager.");
                    scanner.close();
                    return;
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }







}
