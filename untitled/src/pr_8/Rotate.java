package pr_8;
import java.util.Scanner;
public class Rotate {
    public static int recursion(int n, int i) {
        if (n > 0)
            return recursion( n/10, i*10 + n%10 );
        else return i;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите число, не содержащее нулей ");
        int n = sc.nextInt();
        System.out.println(recursion(n, 0));
    }
}
//n = 500 000 256  i = 0
//n = 50 000 025 i = 6
//n = 5 000 002 i = 65
//n = 500 000 i = 652
//n = 50 000 i = 6 520
//...
//n = 0 i = 652 000 005