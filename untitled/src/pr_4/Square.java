package pr_4;

import pr_4.Rectangle;

class Square extends Rectangle {
    private double side;
    public Square() {};
    public Square(double side) {
        super.setWidth(side);
        super.setLength(side);
        this.side = side;
    }
    public Square(double side, String color, boolean filled) {
        super.setWidth(side);
        super.setLength(side);
        this.side = side;
        this.color = color;
        this.filled = filled;
    }
    public double getSide() {
        return side;
    }
    public void setSide(double side) {
        this.side = side;
    }

    @Override public void setWidth(double side) {
        super.setWidth(side);
    }
    @Override public void setLength(double side) {
        super.setLength(side);
    }
    @Override public String toString() {
        return "Square {side: "+side+"; color: "+color+"; filled: "+filled+"}";
    }
}
