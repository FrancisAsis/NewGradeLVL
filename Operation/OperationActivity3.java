package Operation;

public class OperationActivity3 {
    public static void main(String[] args) {
int x = 20;
int y = 9;

System.out.println(++x * --y + x--);   // 21 * 8 + 21 = 189
System.out.println(++x + y-- * 2);     // 21 + 8 * 2 = 37
System.out.println(x++ % ++y + --x);   // 21 % 8 + 21 = 26
System.out.println(--x * ++y - y--);   // 20 * 9 - 9 = 171
    }
    
}
