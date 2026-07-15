package ScannerInput;

import java.util.Scanner;


// public class InputScanner {
//     public static void main(String[] args) {
//         // Step 2: Create the scanner
//         Scanner scanner = new Scanner(System.in);

//         // Step 3: Use the scanner
//         System.out.print("Enter your name: ");
//         String name = scanner.nextLine(); // Reads a line of text

//         System.out.print("Enter your age: ");
//         int age = scanner.nextInt(); // Reads an integer

//         // Output the results
//         System.out.println("Hello, " + name + "! You are " + age + " years old.");

//         // Good practice: Close th e scanner when you're done
//         scanner.close();
//     }
// }


// public class InputScanner {
//     public static void main(String[] args) {

//         Scanner scan = new Scanner(System.in);

//         System.out.print("Enter your name: ");
//         String name = scan.nextLine();
        
//         System.out.print("Enter your age: ");
//         int age = scan.nextInt();

//         System.out.println("Hello, " + name + "! You are " + age + " years old.");

//         scan.close();


//     }
// }



public class InputScanner {
        public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);
            String name = "";
            int age = 0;

            while(true) {
                System.out.print("Enter your name: ");
                name = scanner.nextLine();

                if (name.matches("[a-zA-Z]+")) {
                    break; // Valid name, exit the loop
                } else {
                    System.out.println("Invalid input. Please enter a valid name (letters only).");
                }

            }

             while(true) {
                System.out.print("Enter your age (Number only): ");
                if (scanner.hasNextInt()) {
                    age = scanner.nextInt();
                    
                    if (age >= 0) {
                        break; // Valid age, exit the loop
                    } else {
                        System.out.println("Invalid input. Please enter a Valid number.");
                    }

                } else {
                    System.out.println("Invalid input. Please enter a valid age (numbers only).");
                    scanner.next(); // Clear the invalid input
                }
            }

            System.out.println("Hello, " + name + "! You are " + age + " years old.");
            scanner.close();
        }
    }