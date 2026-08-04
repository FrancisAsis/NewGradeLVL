package ForLoop;

import java.util.Scanner;

public class FoodOrder {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String answer;
        int order = 1;

        String order1 = "";
        String order2 = "";
        String order3 = "";

        do {
            System.out.println("\nOrder #" + order);
            System.out.println("1. Burger");
            System.out.println("2. Fries");
            System.out.println("3. Chicken");
            System.out.print("Choose your order: ");

            int choice = input.nextInt();
            String food = "";

            if (choice == 1) {
                food = "Burger";
                System.out.println("You ordered a Burger.");
            } else if (choice == 2) {
                food = "Fries";
                System.out.println("You ordered Fries.");
            } else if (choice == 3) {
                food = "Chicken";
                System.out.println("You ordered Chicken.");
            } else {
                food = "Invalid";
                System.out.println("Invalid choice.");
            }

            // Save the order
            if (order == 1) {
                order1 = food;
            } else if (order == 2) {
                order2 = food;
            } else if (order == 3) {
                order3 = food;
            }

            System.out.print("Do you want to order again? (yes/no): ");
            answer = input.next();

            order++;

        } while (answer.equalsIgnoreCase("yes") && order <= 3);

        // Show all orders
        System.out.println("\n===== YOUR ORDERS =====");
        if (!order1.equals("")) {
            System.out.println("Order 1: " + order1);
        }
        if (!order2.equals("")) {
            System.out.println("Order 2: " + order2);
        }
        if (!order3.equals("")) {
            System.out.println("Order 3: " + order3);
        }

        System.out.println("\nThank you for ordering!");
        input.close();
    }
}