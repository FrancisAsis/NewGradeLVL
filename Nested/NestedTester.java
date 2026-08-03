package Nested;

import java.util.Scanner;

public class NestedTester
 {
    public static void main(String[] args) {
    Scanner input = new Scanner(System.in);

    int weight;

    while (true) {
        System.out.print("Enter your weight (kg): ");

        if (input.hasNextInt()) {
            weight = input.nextInt();
            break; // Exit the loop when a valid number is entered
        } else {
            System.out.println("Invalid input! Numbers only.");
            input.next(); // Remove the invalid input (like "abc")
        }
    }

        if (weight >= 40) {
            if (weight <= 60) {
                System.out.println("Your weight is Normal.");
            } else {
                System.out.println("You are Overweight.");
            }
        } else {
            System.out.println("You are Underweight.");
        }

        System.out.println("Choose an option:");
        System.out.println("1 - Weight Tips");
        System.out.println("2 - Exercise Tips");
        System.out.println("3 - Healthy Foods");
        System.out.print("Enter your choice: ");

        int choice = input.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Maintain a balanced diet and drink plenty of water.");
                break;

            case 2:
                System.out.println("Exercise for at least 30 minutes every day.");
                break;

            case 3:
                System.out.println("Eat fruits, vegetables, and protein-rich foods.");
                break;

            default:
                System.out.println("Invalid choice.");
        }

        input.close();
    }
}
