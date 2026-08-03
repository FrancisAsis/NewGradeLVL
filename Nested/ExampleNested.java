package Nested;

import java.util.Scanner;

public class ExampleNested {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("=== Body Weight Checker ===");
        System.out.print("Enter your weight (kg): ");
        int weight = input.nextInt();

if (weight >= 40) {
    System.out.println("Keep maintaining a healthy weight.");

    if (weight <= 60) {
          System.out.println("Your weight is Normal.");
     } else {
            System.out.println("You are Overweight.");
        }

    } else {
        System.out.println("You are Underweight.");
    }
        input.close();
    }
}