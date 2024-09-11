package pr_7;

import java.lang.Math;

interface MathCalculable {
    int pow(int a, int b);
    double abs_complex(int a, int b);
    double PI();
}
class MathFunc implements MathCalculable {
    public int pow(int a, int b) {
        int res = 1;
        for (int i=0;i<b;i++)
            res *= a;
        return res;
    }
    public double abs_complex(int a, int b) {
        return Math.sqrt(a*a+b*b);
    }
    public double PI(){
        return Math.PI;
    }
}


class Task4 {
    public static void main(String[] args) {
        MathCalculable math = new MathFunc();
        System.out.println(math.pow(2,10));
        System.out.println(math.abs_complex(2,3));
        System.out.println(math.PI());
    }
}

