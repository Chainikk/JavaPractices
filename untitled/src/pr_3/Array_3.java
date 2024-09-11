package pr_3;
import java.util.Random;
public class Array_3 {
    public static void main(String[] args){
        int[] mas = new int[4];
        for(int i = 0;i < 4; i++){
            mas[i] = (int)((Math.random() * 90) + 10);
            System.out.print(mas[i] + " ");
        }
        System.out.println();
        if(check(mas))
            System.out.print("Последовательность является строго возрастающей");
        else
            System.out.print("Последовательность не является строго возрастающей");
    }
    public static Boolean check(int[] mas){
        for(int i = 0; i < mas.length-1;i++){
            if(mas[i] >= mas[i+1])
                return false;
        }
        return true;
    }
}