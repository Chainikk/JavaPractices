package pr_14;
import java.util.Scanner;
import java.util.regex.Pattern;
import java.util.regex.Matcher;
public class task2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String input = sc.nextLine();
        //String input = "abcdefghijklmnopqrstuv18340";
        String regex = "abcdefghijklmnopqrstuv18340";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        if (matcher.matches()) {
            System.out.println("Строка является строкой 'abcdefghijklmnopqrstuv18340'");
        } else {
            System.out.println("Строка не является строкой 'abcdefghijklmnopqrstuv18340'");
        }
    }
}
