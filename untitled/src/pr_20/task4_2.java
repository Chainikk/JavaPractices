package pr_20;

class Calculator {
    public static <T extends Number> T sum(T a, T b) {
        if (a instanceof Integer) {
            return (T) Integer.valueOf(a.intValue() + b.intValue());
        } else if (a instanceof Double) {
            return (T) Double.valueOf(a.doubleValue() + b.doubleValue());
        } else {
            throw new IllegalArgumentException("Unsupported number type");
        }
    }

    public static <T extends Number> T multiply(T a, T b) {
        if (a instanceof Integer) {
            return (T) Integer.valueOf(a.intValue() * b.intValue());
        } else if (a instanceof Double) {
            return (T) Double.valueOf(a.doubleValue() * b.doubleValue());
        } else {
            throw new IllegalArgumentException("Unsupported number type");
        }
    }

    public static <T extends Number> T divide(T a, T b) {
        if (a instanceof Integer) {
            return (T) Integer.valueOf(a.intValue() / b.intValue());
        } else if (a instanceof Double) {
            return (T) Double.valueOf(a.doubleValue() / b.doubleValue());
        } else {
            throw new IllegalArgumentException("Unsupported number type");
        }
    }

    public static <T extends Number> T subtraction(T a, T b) {
        if (a instanceof Integer) {
            return (T) Integer.valueOf(a.intValue() - b.intValue());
        } else if (a instanceof Double) {
            return (T) Double.valueOf(a.doubleValue() - b.doubleValue());
        } else {
            throw new IllegalArgumentException("Unsupported number type");
        }
    }

    public static void main(String[] args) {
        int a = 5;
        int b = 3;
        System.out.println("Sum: " + Calculator.sum(a, b));
        System.out.println("Multiply: " + Calculator.multiply(a, b));
        System.out.println("Divide: " + Calculator.divide(a, b));
        System.out.println("Subtraction: " + Calculator.subtraction(a, b));

        double x = 2.5;
        double y = 1.3;
        System.out.println("Sum: " + Calculator.sum(x, y));
        System.out.println("Multiply: " + Calculator.multiply(x, y));
        System.out.println("Divide: " + Calculator.divide(x, y));
        System.out.println("Subtraction: " + Calculator.subtraction(x, y));
    }
}
