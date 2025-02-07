
import java.util.Scanner;

public class Length_Converter {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Length Converter:");
        System.out.println("1. Meters to Feet");
        System.out.println("2. Feet to Meters");
        System.out.print("Choose an option: ");
        int option = scanner.nextInt();

        switch (option) {
            case 1:
                System.out.print("Enter length in meters: ");
                double meters = scanner.nextDouble();
                double feet = meters * 3.28084;
                System.out.println(meters + " meters is " + feet + " feet.");
                break;
            case 2:
                System.out.print("Enter length in feet: ");
                feet = scanner.nextDouble();
                meters = feet / 3.28084;
                System.out.println(feet + " feet is " + meters + " meters.");
                break;
            default:
                System.out.println("Invalid option!");
        }
        scanner.close();
    }









}
