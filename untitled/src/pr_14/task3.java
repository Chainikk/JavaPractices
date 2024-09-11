package pr_14;
import java.util.regex.Matcher;
import java.util.regex.Pattern;
public class task3 {
    public static void main(String[] args) {
        String text = "Цены: 25.98 USD, 100 USD, 10.50 EU";

        String usdPattern = "\\d+(\\.\\d+)? USD";
        String rubPattern = "\\d+(\\.\\d+)? RUB";
        String euPattern = "\\d+(\\.\\d+)? EU";

        Pattern patternUSD = Pattern.compile(usdPattern);
        Pattern patternRUB = Pattern.compile(rubPattern);
        Pattern patternEU = Pattern.compile(euPattern);

        Matcher matcherUSD = patternUSD.matcher(text);
        Matcher matcherRUB = patternRUB.matcher(text);
        Matcher matcherEU = patternEU.matcher(text);

        System.out.println("Цены в USD:");
        while (matcherUSD.find()) {
            System.out.println(matcherUSD.group());
        }

        System.out.println("Цены в RUB:");
        while (matcherRUB.find()) {
            System.out.println(matcherRUB.group());
        }

        System.out.println("Цены в EU:");
        while (matcherEU.find()) {
            System.out.println(matcherEU.group());
        }
    }
}
