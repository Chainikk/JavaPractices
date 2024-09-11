package pr_14;

import java.util.regex.Pattern;
import java.util.regex.Matcher;

public class task5 {
    public static void main(String[] args) {
        String input = "09.08/2000";
        String regex = "^(0[1-9]|1\\d|2[0-8])/(0[1-9]|1[0-2])/((19|20)\\d\\d)$";

        Pattern pattern = Pattern.compile(regex);
        Matcher matcher = pattern.matcher(input);

        if (matcher.matches()) {
            System.out.println("Строка является датой в формате dd/mm/yyyy");
        } else {
            System.out.println("Строка не является датой в формате dd/mm/yyyy");
        }
    }
}
