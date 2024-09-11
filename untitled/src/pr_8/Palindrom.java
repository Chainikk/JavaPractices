package pr_8;
import java.util.Scanner;
public class Palindrom {
    public static String recursion(String s) {
        // Базовый случай
        if (s.length() == 1) {
            return "YES";
        }
        else {
            if (s.substring(0, 1).equals(s.substring(s.length() - 1))) {
                if (s.length() == 2) {
                    return "YES";
                }
                return recursion(s.substring(1, s.length() - 1));
            }
            else {
                return "NO";
            }
        }
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите слово");
        String word = sc.nextLine();
        System.out.println(recursion(word));
    }
}
