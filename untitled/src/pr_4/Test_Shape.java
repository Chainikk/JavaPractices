package pr_4;

import pr_4.Circle;
import pr_4.Rectangle;

public class Test_Shape {
    public static void main(String[] args) {
        Circle circle = new Circle(14444, "синий", true);
        System.out.println(circle);
        Rectangle rectangle = new Rectangle(10000, 10, "черный", true);
        System.out.println(rectangle);
        Square square = new Square(98, "белый", false);
        System.out.print(square + " площадь: " + square.getArea() + "; периметр: "+square.getPerimetr());
    }
}
