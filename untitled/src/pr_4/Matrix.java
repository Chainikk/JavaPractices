package pr_4;

import java.util.Scanner;
public class Matrix {
    private double[][] matr;
    private int n;
    private int m;
    public Matrix(int n, int m) {
        Scanner sc = new Scanner(System.in);
        this.n = n;
        this.m = m;
        this.matr = new double[n][m];
        System.out.print("Введите " + m*n + " элементов матрицы через пробел: ");
        for (int i=0;i<n;i++) {
            for (int j=0;j<m;j++) {
                this.matr[i][j] = sc.nextDouble();
            }
        }
    }
    public Matrix() {
        this.matr = new double[0][0];
    }

    public int getN() {
        return n;
    }

    public int getM() {
        return m;
    }

    public void setMatr(double[][] matr) {
        this.matr = matr;
    }

    public void setN(int n) {
        this.n = n;
    }

    public void setM(int m) {
        this.m = m;
    }

    public void outputMatrix() {
        for (int i=0;i<this.n;i++) {
            for (int j=0;j<this.m;j++) {
                System.out.print(this.matr[i][j]+" ");
            }
            System.out.print("\n");
        }
    }

    public void Sum(Matrix matr2) {
        Matrix res = new Matrix();
        double[][] res_m = new double[this.n][this.m];
        for (int i=0;i<this.n;i++) {
            for (int j=0;j<this.m;j++) {
                res_m[i][j] = this.matr[i][j] + matr2.matr[i][j];
            }
        }
        res.setN(this.n);
        res.setM(this.m);
        res.setMatr(res_m);
        res.outputMatrix();
    }
    public void Number_Multiply(double x) {
        Matrix res = new Matrix();
        res.setN(this.n);
        res.setM(this.m);
        double[][] res_m = new double[this.n][this.m];
        for (int i=0;i<this.n;i++) {
            for (int j=0;j<this.m;j++)
                res_m[i][j] = this.matr[i][j] * x;
        }
        res.setMatr(res_m);
        res.outputMatrix();
    }
}
