package pr_18;

import java.util.Scanner;
class Exception2 {
    public void exceptionDemo() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите целое число ");
        try {
            String intString = sc.next();
            int i = Integer.parseInt(intString);
            System.out.println("Результат деления " + 2 / i);
        }
        catch (NumberFormatException e) {
            System.out.println("Неверный формат данных");//не является целым числом
        }
        catch (ArithmeticException e) {
            System.out.println("Попытка деления на 0");//если ввести ноль, будет ошибка
        }
        catch (Exception e) {
            System.out.println("Ошииииииибка");//любая другая ошибка
        }
        finally {
            System.out.println("Конец");
        }
    }
    public static void main(String[] args) {
        Exception2 exception2 = new Exception2();
        exception2.exceptionDemo();
    }
}

