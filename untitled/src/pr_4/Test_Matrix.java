package pr_4;

import pr_4.Matrix;

import java.util.Scanner;

import static java.lang.System.exit;

public class Test_Matrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите размеры матрицы: ");
        int n = sc.nextInt();
        int m = sc.nextInt();
        Matrix matrix = new Matrix(n,m);
        System.out.println("Список операций:");
        System.out.println("1. Напечатать исходную матрицу");
        System.out.println("2. Сложить ее с другой матрицей");
        System.out.println("3. Умножить ее на число");
        System.out.println("4. Завершить программу");
        int a;
        double x;
        while(true){
            System.out.print("Введите номер операции: ");
            a = sc.nextInt();
            switch (a) {
                case 1:
                    matrix.outputMatrix();
                    break;
                case 2:
                    Matrix matr2 = new Matrix(n,m);
                    matrix.Sum(matr2);
                    break;
                case 3:
                    System.out.print("Введите число: ");
                    x = sc.nextDouble();
                    matrix.Number_Multiply(x);
                    break;
                case 4:
                    exit(1);
            }
        }
    }
}
