package pr_14;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class task4 {
    public static void main(String[] args) {
        String text = "(1-8)-9/4";

        String pattern = "\\b\\d+[^+]\\b";

        Pattern regex = Pattern.compile(pattern);
        Matcher matcher = regex.matcher(text);

        if (matcher.find()) {
            System.out.println("В тексте есть цифры, за которыми не стоит знак \"+\"");
        }
        else {
            System.out.println("В тексте нет цифр, за которыми не стоит знак \"+\"");
        }
    }
}
