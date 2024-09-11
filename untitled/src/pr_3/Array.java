package pr_3;
import java.util.Scanner;
import java.util.Random;
public class Array {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        Random rand = new Random();
        System.out.print("Введите размер массива ");
        int n = sc.nextInt();
        Double[] mas = new Double[n];
        for(int i = 0; i < n; i++)
            mas[i] = rand.nextDouble(100);
        System.out.println("Исходный массив ");
        output(mas);
        System.out.println();
        sort(mas);
        System.out.println("Отсортированный массив ");
        output(mas);
        for(int i = 0; i < n; i++)
            mas[i] = Math.random();
        System.out.println();
        System.out.println("Исходный массив ");
        output(mas);
        System.out.println();
        sort(mas);
        System.out.println("Отсортированный массив ");
        output(mas);

    }
    public static void output(Double[] mas){
        for(int i = 0; i < mas.length; i++){
            System.out.print(mas[i] + " ");
        }
    }
    public static void sort(Double[] mas){
        for(int i = 0; i < mas.length; i++){
            for(int j = 0; j < mas.length-1; j++){
                if(mas[j] > mas[j+1]){
                    Double tmp = mas[j+1];
                    mas[j+1] = mas[j];
                    mas[j] = tmp;
                }
            }
        }
    }

}
