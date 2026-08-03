package Nested;

import java.util.Scanner;

public class Nestedfalse {
    public static void main(String[] args) {
        
    
    Scanner input = new Scanner(System.in);  
    System.out.println("This is my nested if statement program.");
    System.out.println("Enter a number: ");

    int num = input.nextInt();
    System.out.println("The number you enter is: " + num);

    if (num % 2 == 0) {
        System.out.println("The number is even.");
        if (num % 4 == 0) {
            System.out.println("The number is also divisible by 4.");
        } else {
            System.out.println("The number is not divisible by 4.");
        }
    } else {
        System.out.println("The number is odd.");
    }   if (num % 3 == 0) {
            System.out.println("The number is also divisible by 3.");
        } else {
            System.out.println("The number is odd not divisible by 3.");
        }


        input.close();

    }

}
    

