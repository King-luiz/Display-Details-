// Import the Scanner class to enable user input
import java.util.Scanner;

public class Details {
    public static void main(String[] args) {
        // Createing a Scanner object to read input from the user
        Scanner scanner = new Scanner(System.in);

        // Prompt the user to enter their name
        System.out.println("Enter your name:");
        //Reads the full name
        String name = scanner.nextLine();

        // Prompt the user to enter their age
        System.out.println("Enter your age:");
        // Validate input for age 
        int age = scanner.nextInt();

        // Prompt the user to enter their salary
        System.out.println("Enter your salary:");
        // Validate input for salary
        double salary = scanner.nextDouble();

        // Display the entered details
        System.out.println("Your name is " + name + "\nYour age is " + age + "\nYour salary is " + salary);

        // Close the scanner to prevent resource leaks
        scanner.close();
    }
}
