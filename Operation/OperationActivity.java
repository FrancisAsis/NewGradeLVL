package Operation;

public class OperationActivity {

    public static void main(String[] args) {
        int x = 18;
        int y = 7;
            
        System.out.println(++x * y++);   // Multiplication
        System.out.println(x++ + ++y);   // Addition
        System.out.println(++x / y++);   // Division
        System.out.println(x++ - ++y);   // Subtraction
    }
}
