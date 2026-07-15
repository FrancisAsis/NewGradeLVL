package Operation;

public class Comparison {
    public static void main(String[] args) {
        int a = 10;        int b = 5;

        // System.out.println((++a * 2) > (b + 15));    
        // System.out.println((a - 5) <= (b++ * 2));     
        // System.out.println((--a % 5) == (++b % 4)); 
        // System.out.println((a++ + b) != (a * 2));    
        // System.out.println((++a - 4) >= (--b + 2));   



        System.out.println(((++a * 2) > (b + 15)) && ((a + b) % 2 == 0));
        System.out.println(((a - 5) <= (b++ * 2)) || ((a * b) > 50));
        System.out.println(((--a % 5) == (++b % 4)) && ((a - b) < 5));
        System.out.println(((a++ + b) != (a * 2)) || ((a + b) >= 20));
        System.out.println(((++a - 4) >= (--b + 2)) && ((a / 2) > b));
        
        }
    
}
