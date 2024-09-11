package pr_3;

import java.util.Scanner;
public class Shell {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите значение переменной n ");
        double n = sc.nextInt();
        System.out.println("Задание 1");
        Double a = Double.valueOf(n);
        System.out.println("Значение объекта a " + a);
        System.out.println("Задание 2");
        String str = "1000000";
        Double c = Double.parseDouble(str);
        System.out.println("Значение объекта c " + c);
        System.out.println("Задание 3");
        double d = (double)(a);
        float f = a.floatValue();
        long l = a.longValue();
        int i = (int)(d);
        short s = (short)(d);
        byte b = (byte)(d);
        char ch = (char)(d);
        System.out.println("Из Double в double: " + d);
        System.out.println("Из Double в float: " + f);
        System.out.println("Из Double в long: " + l);
        System.out.println("Из Double в int: " + i);
        System.out.println("Из Double в short: " + s);
        System.out.println("Из Double в byte: " + b);
        System.out.println("Из Double в char: " + ch);
        System.out.println("Задание 4");
        System.out.println("Значение объекта a " + a);
        System.out.println("Задание 5");
        String k = Double.toString(3.14);
        System.out.println("Преобразование литерала к строке " + k);
    }
}
