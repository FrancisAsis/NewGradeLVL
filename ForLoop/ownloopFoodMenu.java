package ForLoop;

import java.util.Scanner;

public class ownloopFoodMenu {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int addOn = 1;
        String answer;
        String allOrders = "";

        System.out.println("===== Customer 1 =====");

        // MAIN ORDER
        int choice = 0;

        while (choice < 1 || choice > 3) {
            System.out.println("1. Chicken With Rice");
            System.out.println("2. Spaghetti");
            System.out.println("3. Patty Chicken With Rice");
            System.out.print("Choose your MAIN order (1-3): ");
            choice = input.nextInt();

            if (choice < 1 || choice > 3) {
                System.out.println("Invalid choice. Try again.");
            } else {
                System.out.println("Great choice!");
            }
        }

        switch (choice) {
            case 1:
                System.out.println("You ordered Chicken With Rice.");
                allOrders += "Main Order: Chicken With Rice\n";
                break;

            case 2:
                System.out.println("You ordered Spaghetti.");
                allOrders += "Main Order: Spaghetti\n";
                break;

            case 3:
                System.out.println("You ordered Patty Chicken With Rice.");
                allOrders += "Main Order: Patty Chicken With Rice\n";
                break;
        }

        // Ask if customer wants add-ons
        System.out.print("Do you want an add-on? (yes/no): ");
        answer = input.next();

        // ADD-ONS
        do {

            if (answer.equalsIgnoreCase("yes")) {

                System.out.println("\nAdd-On " + addOn);
                choice = 0;

                while (choice < 1 || choice > 3) {

                    // Show different add-ons depending on the main order
                    switch (allOrders.substring(0, allOrders.indexOf("\n"))) {

                        case "Main Order: Chicken With Rice":
                        System.out.println("1. Extra Rice");
                        System.out.println("2. Gravy");
                        System.out.println("3. Coke");
                        break;

                        case "Main Order: Spaghetti":
                        System.out.println("1. Garlic Bread");
                        System.out.println("2. Coke");
                        System.out.println("3. Extra Cheese");
                        break;

                        case "Main Order: Patty Chicken With Rice":
                        System.out.println("1. Fries");
                        System.out.println("2. Extra Patty");
                        System.out.println("3. Iced Tea");
                        break;  
                    }   

                    System.out.print("Choose your add-on (1-3): ");
                    choice = input.nextInt();

                    if (choice < 1 || choice > 3) {
                        System.out.println("Invalid choice. Try again.");
                    }
                }

                // Save the correct add-on
                switch (allOrders.substring(0, allOrders.indexOf("\n"))) {

                    case "Main Order: Chicken With Rice":
                        if (choice == 1)
                            allOrders += "Add-On " + addOn + ": Extra Rice\n";
                        else if (choice == 2)
                            allOrders += "Add-On " + addOn + ": Gravy\n";
                        else
                            allOrders += "Add-On " + addOn + ": Coke\n";
                        break;

                    case "Main Order: Spaghetti":
                        if (choice == 1)
                            allOrders += "Add-On " + addOn + ": Garlic Bread\n";
                        else if (choice == 2)
                            allOrders += "Add-On " + addOn + ": Coke\n";
                        else
                            allOrders += "Add-On " + addOn + ": Extra Cheese\n";
                        break;

                    case "Main Order: Patty Chicken With Rice":
                        if (choice == 1)
                            allOrders += "Add-On " + addOn + ": Fries\n";
                        else if (choice == 2)
                            allOrders += "Add-On " + addOn + ": Extra Patty\n";
                        else
                            allOrders += "Add-On " + addOn + ": Iced Tea\n";
                        break;
                }

                addOn++;

                System.out.print("Do you want another add-on? (yes/no): ");
                answer = input.next();
            }

        } while (answer.equalsIgnoreCase("yes"));

        System.out.println("\n===== ORDER SUMMARY =====");
        System.out.print(allOrders);

        System.out.println("Thank you for ordering!");

        input.close();
    }
}