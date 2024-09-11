package pr_4;

import pr_4.Shape;

class Circle extends Shape {
    protected double radius;
    public Circle() { };
    public Circle(double radius) {
        this.radius = radius;
    }
    public Circle(double radius, String color, boolean filled) {
        this.radius = radius;
        this.color = color;
        this.filled = filled;
    }
    public double getRadius() {
        return this.radius;
    }
    public void setRadius(double radius) {
        this.radius = radius;
    }
    public double getArea() {
        return Math.PI * radius * radius;
    }
    public double getPerimetr() {
        return 2 * Math.PI * radius;
    }
    public String toString() {
        return "Circle {radius: " + radius + "; color: " + color+ "; filled: " + filled+ "}";
    }
}
