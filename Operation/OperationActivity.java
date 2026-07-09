package Operation;

public class OperationActivity {

    public static void main(String[] args) {
int x = 15;
int y = 10;

System.out.println(++x * y-- + --x);   // 16 * 10 + 15 = 175
System.out.println(x++ % ++y + x);     // 15 % 10 + 16 = 21
System.out.println(--x * ++y - y--);   // 15 * 11 - 11 = 154
System.out.println(x++ + --y * 3);     // 15 + 10 * 3 = 45 


        
        
    }
}
