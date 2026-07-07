package Operation;

public class Increment {
    public static void main(String[] args) {
        System.out.println("Incremeant an Integers");

        int x = 5; 
        System.out.print("initial value of x: " + ++x);
        System.out.println(x);
        System.out.println(x++); 
        System.out.println(x);

        // decrement Intigers
        System.out.println("decrement of an Integers");

        int m = 5;
        System.out.println(m);
        System.out.println(m--);
        System.out.println(m);

        // Cobine operation 
        int q = 10;
        int e = 5;
        System.out.println("Combined Operation "+ (q + e ));
        System.out.println(++q + e);// 11 + 5
        System.out.println(q + ++e);// 11 + 6
        System.out.println(q++ + e++);// 11 + 6
        System.out.println(q + e);// 12 + 7
        System.out.println(--q + e);// 11 + 7
        System.out.println(q + e--);// 11 + 7
        System.out.println(--q + ++e);// 10 + 8
        System.out.println(--e + q);// 7 + 10
        System.out.println(q + ++e);// 10 + 7

        
        System.out.println(q + e);
        System.out.println(q + ++e);
        System.out.println(q/e);
        System.out.println(q * e);



        // x 3 y 11
        // 3 12 
        // 12 / 3 = 4 
        // 3 12 = 
        // 5 12 
        //  3  
        // 


    }
}