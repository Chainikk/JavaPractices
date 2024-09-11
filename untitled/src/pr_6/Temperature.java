package pr_6;

import java.util.Scanner;

interface Convertable {
    double convert(double n);
}
class Kelvin implements Convertable {
    public double convert(double n) {
        return n + 273.15;
    }
}
class Farengate implements Convertable {
    public double convert(double n) {
        return n*9/5 + 32;
    }
}

class Task11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Введите температуру в Цельсия: ");
        double n = sc.nextDouble();
        Kelvin k = new Kelvin();
        Farengate f = new Farengate();
        System.out.println(n+"°С = "+k.convert(n)+"°K");
        System.out.println(n+"°С = "+f.convert(n)+"°F");
    }
}


