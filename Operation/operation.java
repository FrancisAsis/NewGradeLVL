package Operation;

public class operation {
    public static void main(String[] args) {
        // addition operation
        int addend1 = 10, 
            addend2 = 5, sum;

        sum = addend1 + addend2;
        System.out.println("Sum of " + addend1 + " and " + addend2 + " is: " + sum);

        // subtraction operation
        int minuend = 10, 
            subtrahend = 5, difference;

        difference = minuend - subtrahend;
        System.out.println("Difference of " + minuend + " and " + subtrahend + " is: " + difference);

        // multiplication operation
        int multiplicand = 10, 
            multiplier = 5, product;

        product = multiplicand * multiplier;
        System.out.println("Product of " + multiplicand + " and " + multiplier + " is: " + product);

        // division operation
        int dividend = 10, 
            divisor = 5, quotient;

        quotient = dividend / divisor;
        System.out.println("Quotient of " + dividend + " and " + divisor + " is: " + quotient);

        // modulus operation
        int number = 10, 
            divisor2 = 3, remainder;

        remainder = number % divisor2;
        System.out.println("Remainder of " + number + " divided by " + divisor2 + " is: " + remainder);

        // reminder operation
        int number2 = 10, 
            divisor3 = 8, remainder2;   

        remainder2 = number2 % divisor3;
        System.out.println("Remainder of " + number2 + " divided by " + divisor3 + " is: " + remainder2);

    }
}