package Operation;

public class OperationActivity {

    public static void main(String[] args) {
        int x = 10;
        int y = 12;

        System.out.println(x + y); // 10 + 12
        System.out.println(x++ + ++y);// 10 + 13
        System.out.println(++x + y++);//12 + 13 
        System.out.println(x++ + ++y);//12 + 15
        System.out.println(x + y);// 13 + 15
        System.out.println(x++ * y++); // 13
        System.out.println(x + y);
        
    }
}
