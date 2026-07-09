package Operation;

public class OperationActivity2 {
    public static void main(String[] args) {
int x = 18;
int y = 7;

System.out.println(++x * y-- + --x);   // 19 * 7 + 18 = 151
System.out.println(x++ % ++y + x);     // 18 % 7 + 19 = 23
System.out.println(--x * ++y - y--);   // 18 * 8 - 8 = 136
System.out.println(x++ + --y * 4);     // 18 + 7 * 4 = 46 
    }
    
}
