package pr_8;
import java.util.Scanner;
public class isSimple {
    public static boolean recursion(int n, int i) {
        // i- дополнительный параметр. При вызове должен быть равен 2
        // Базовый случай
        if (n < 2) {
            return false;
        } // Базовый случай
        else if (n == 2) {
            return true;
        } // Базовый случай
        else if (n % i == 0) {
            return false;
        } // Шаг рекурсии / рекурсивное условие
        else if (i < n / 2) {
            return recursion(n, i + 1);
        }
        else {
            return true;
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите число");
        int n = sc.nextInt();
        if(recursion(n, 2))
            System.out.println("Число является простым");
        else
            System.out.println("Число не является простым");
    }
}
