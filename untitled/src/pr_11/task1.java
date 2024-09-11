package pr_11;
import java.text.ParsePosition;
import java.text.SimpleDateFormat;
import java.text.ParsePosition;
import java.util.*;

class TaskDeadline {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String developerSurname = "Иванов";
        System.out.println("Введите дату получения задания в формате dd.MM.yyyy: ");
        String userInput = sc.nextLine();
        Date userDate = null;
        SimpleDateFormat dateFormat = new SimpleDateFormat("dd.MM.yyyy");
        userDate = dateFormat.parse(userInput, new ParsePosition(0));
        Date taskDeadline = new Date(System.currentTimeMillis()); // текущая дата и время

        System.out.println("Фамилия разработчика: " + developerSurname);
        System.out.println("Дата и время получения задания: " + userDate);
        System.out.println("Дата и время сдачи задания: " + taskDeadline);
    }
}
