package pr_3;

import java.util.Scanner;

public class Array_4 {
    public static void main(String[] args){
        int count = 0;
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите натуральное число больше 0: ");
        int n = sc.nextInt();
        while(n <= 0){
            System.out.print("Введите натуральное число больше 0: ");
            n = sc.nextInt();
        }
        int[] mas = new int[n];
        for(int i = 0; i < n; i++){
            mas[i] = (int)(Math.random() * (n+1));
        }
        System.out.println("Исходный массив");
        output(mas);
        System.out.println();
        System.out.println("Количество четных элементов - " + counter(mas));
        if(counter(mas) > 0){
            int[] new_mas = new int [counter(mas)];
            int index = 0;
            for(int i = 0; i < n; i++){
                if(mas[i] % 2 == 0){
                    new_mas[index] = mas[i];
                    index+=1;
                }
            }
            System.out.println("Новый массив");
            output(new_mas);
        }
        else{
            System.out.print("Массив не содержит четных элементов");
        }

    }
    public static void output(int[] mas){
        for(int i = 0; i < mas.length; i++){
            System.out.print(mas[i] + " ");
        }
    }
    public static int counter(int[] mas){
        int count = 0;
        for(int i = 0; i < mas.length; i++){
            if(mas[i]%2 == 0)
                count+=1;
        }
        return count;
    }
}
