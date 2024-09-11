package pr_11;

import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

class CompareDates {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите дату в формате dd.MM.yyyy: ");
        String userInput = scanner.nextLine();

        Date currentDate = new Date();
        Date userDate = null;

        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");

        userDate = dateFormat.parse(userInput, new ParsePosition(0));

        if (userDate == null) {
            System.out.println("Неверный формат даты. Попробуйте еще раз.");
            return;
        }

        if (currentDate.before(userDate)) {
            System.out.println("Текущая дата меньше введенной.");
        } else if (currentDate.after(userDate)) {
            System.out.println("Текущая дата больше введенной.");
        } else {
            System.out.println("Текущая дата равна введенной.");
        }
    }
}
