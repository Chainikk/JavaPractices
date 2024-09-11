package pr_14;
import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import static java.lang.System.exit;

public class task1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Введите строку:");
        String input = scanner.nextLine();
        while (true) {
            System.out.println("Выберите операцию:");
            System.out.println("1. Разбить строку на слова");
            System.out.println("2. Найти все числа в строке");
            System.out.println("3. Заменить все гласные буквы на '*'");
            System.out.println("4. Выйти");

            int choice = scanner.nextInt();
            scanner.nextLine(); // Считываем символ новой строки после считывания числа

            switch (choice) {
                case 1:
                    String[] words = input.split("\\s+");
                    System.out.println("Разбитые слова:");
                    for (String word : words) {
                        System.out.println(word);
                    }
                    break;
                case 2:
                    String numbersPattern = "\\d+";
                    Pattern pattern = Pattern.compile(numbersPattern);
                    Matcher matcher = pattern.matcher(input);

                    System.out.println("Найденные числа:");
                    while (matcher.find()) {
                        System.out.println(matcher.group());
                    }
                    break;
                case 3:
                    String vowelsPattern = "[aeiouAEIOU]";
                    String replacedString = input.replaceAll(vowelsPattern, "*");
                    System.out.println("Строка с замененными гласными буквами:");
                    System.out.println(replacedString);
                    break;
                case 4:
                    System.out.println("Выход из программы");
                    exit(1);
                default:
                    System.out.println("Неверный выбор. Попробуйте снова.");
                    break;
            }
        }
    }
}

