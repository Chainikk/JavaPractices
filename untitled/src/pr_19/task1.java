package pr_19;

import java.util.Scanner;

class ex_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите ФИО: ");
        String fullName = scanner.nextLine();

        System.out.print("Введите номер ИНН: ");
        String inn = scanner.nextLine();

        try {
            validateINN(inn);
            System.out.println("Заказ оформлен успешно!");
        } catch (InvalidINNException e) {
            System.out.println("Ошибка: " + e.getMessage());
        }
    }

    public static void validateINN(String inn) throws InvalidINNException {
        // Проверка действительности номера ИНН
        // В данном примере просто проверяем, что ИНН состоит из 10 цифр
        if (inn.length() != 10 || !inn.matches("\\d+")) {
            throw new InvalidINNException("Недействительный номер ИНН");
        }
    }
}

class InvalidINNException extends Exception {
    public InvalidINNException(String message) {
        super(message);
    }
}

