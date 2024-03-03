import java.util.Scanner;

public class Subtraction {
    // Static variable to store the result
    static double result;

    // Method to perform subtraction
    static void subtract() {
        // Create a Scanner object to read user input
        Scanner scanner = new Scanner(System.in);

        // Ask user to enter the first number
        System.out.print("Enter the first number: ");
        double number1 = scanner.nextDouble();

        // Ask user to enter the second number
        System.out.print("Enter the second number: ");
        double number2 = scanner.nextDouble();

        // Perform subtraction
        result = number1 - number2;

        // Close the scanner
        scanner.close();
    }

    public static void main(String[] args) {
        // Call the subtract method to perform subtraction
        subtract();

        // Displaying result
        System.out.println("Result of subtraction: " + result);
    }
}
