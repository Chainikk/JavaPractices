package pr_11;

import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;

class task4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Введите год:");
        int year = scanner.nextInt();

        System.out.println("Введите месяц (от 1 до 12):");
        int month = scanner.nextInt() - 1; // Месяцы в Calendar начинаются с 0

        System.out.println("Введите число:");
        int day = scanner.nextInt();

        System.out.println("Введите часы:");
        int hours = scanner.nextInt();

        System.out.println("Введите минуты:");
        int minutes = scanner.nextInt();

        // Создание объекта Date
        Date date = new Date(year - 1900, month, day, hours, minutes);

        // Создание объекта Calendar
        Calendar calendar = Calendar.getInstance();
        calendar.set(year, month, day, hours, minutes);

        System.out.println("Объект Date: " + date);
        System.out.println("Объект Calendar: " + calendar.getTime());
    }
}

