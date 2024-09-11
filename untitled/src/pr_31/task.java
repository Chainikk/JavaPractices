package pr_31;



class task {
    public static void main(String[] args) {
        int number1 = 5;
        int number2 = 0;
        int number3 = 42;
        int number4 = 16;
        int number5 = 7;
        int number6 = 91;

        boolean result1 = isEvenNumber(number1);
        boolean result2 = isEvenNumber(number2);
        boolean result3 = isEvenNumber(number3);
        boolean result4 = isEvenNumber(number4);
        System.out.println("Результаты проверки чисел на четность");
        System.out.println(number1 + ": " + result1);
        System.out.println(number2 + ": " + result2);
        System.out.println(number3 + ": " + result3);
        System.out.println(number4 + ": " + result4);

        System.out.println("Результаты проверки чисел на принадлежность к простым");
        System.out.println(number4 + ": " + isSimpleNumber(number4, 2));
        System.out.println(number5 + ": " + isSimpleNumber(number5, 2));
        System.out.println(number6 + ": " + isSimpleNumber(number6, 2));
    }

    public static boolean isEvenNumber(int number) {
        return number % 2 == 0;
    }
    public static boolean isSimpleNumber(int n, int i) {
        if (n < 2) {
            return false;
        }
        else if (n == 2) {
            return true;
        }
        else if (n % i == 0) {
            return false;
        }
        else if (i < n / 2) {
            return isSimpleNumber(n, i + 1);
        }
        else {
            return true;
        }
    }
}
