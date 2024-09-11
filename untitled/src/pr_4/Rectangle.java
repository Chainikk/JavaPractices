package pr_4;

import pr_4.Shape;

class Rectangle extends Shape {
    private double width;
    private double length;
    public Rectangle() {};
    public Rectangle(double width, double length) {
        this.width = width;
        this.length = length;
    }
    public Rectangle(double width, double length, String color, boolean filled) {
        this.width = width;
        this.length = length;
        this.color = color;
        this.filled = filled;
    }
    public double getWidth() {
        return this.width;
    }
    public double getLength() {
        return this.length;
    }
    public void setWidth(double width) {
        this.width = width;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getArea() {
        return this.width * this.length;
    }
    public double getPerimetr() {
        return (this.length + this.width) * 2;
    }
    public String toString() {
        return "Rectangle {width: " + width + "; length: " + length + "; color: " + color + "; filled: " + filled + "}";
    }
}
