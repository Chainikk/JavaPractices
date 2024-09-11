package pr_13;
import java.util.Scanner;

public class task1 {
    public static void main(String[] args){
        String line = "I like Java!!!";
        stringOperations(line);
    }
    public static void stringOperations(String line){
        //Пункт 2
        System.out.println("Пункт 2");
        System.out.println(line.charAt(line.length() - 1));
        //Пункт 3
        System.out.println("Пункт 3");
        System.out.println(line.endsWith("!!!"));
        //Пункт 4
        System.out.println("Пункт 4");
        System.out.println(line.startsWith("I like"));
        //Пункт 5
        System.out.println("Пункт 5");
        System.out.println(line.contains("Java"));
        //Пункт 6
        System.out.println("Пункт 6");
        System.out.println(line.indexOf("Java"));
        //Пункт 7
        System.out.println("Пункт 7");
        System.out.println(line.replace('a', 'o'));
        //Пункт 8
        System.out.println("Пункт 8");
        System.out.println(line.toUpperCase());
        //Пункт 9
        System.out.println("Пункт 9");
        System.out.println(line.toLowerCase());
        //Пункт 10
        System.out.println("Пункт 10");
        String newline = line.substring(7, 11);
        System.out.println(newline);
    }

}
