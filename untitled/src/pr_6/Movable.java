package pr_6;

interface Movable {
    public void moveUp();
    public void moveDown();
    public void moveLeft();
    public void moveRight();
}

class MovableCircle implements Movable {
    private int radius;
    private MovablePoint center;
    public MovableCircle(int x, int y, int xSpeed, int ySpeed, int radius) {
        center = new MovablePoint(x, y, xSpeed, ySpeed);
        this.radius = radius;
    }
    @Override public String toString() {
        return "Circle{x:"+center.x+"; y:"+center.y+"; radius:"+radius+"}";
    }
    public void moveUp() {
        center.y+=center.ySpeed;
        System.out.println("Движение круга вверх");
    }
    public void moveDown() {
        center.y-=center.ySpeed;
        System.out.println("Движение круга вниз");
    }
    public void moveLeft() {
        center.x-=center.xSpeed;
        System.out.println("Движение круга влево");
    }
    public void moveRight() {
        center.x+=center.xSpeed;
        System.out.println("Движение круга вправо");
    }
}

class MovablePoint implements Movable {
    protected int x;
    protected int y;
    protected int xSpeed;
    protected int ySpeed;
    public MovablePoint(int x, int y, int xSpeed, int ySpeed) {
        this.x = x;
        this.y = y;
        this.xSpeed = xSpeed;
        this.ySpeed = ySpeed;
    }
    @Override public String toString() {
        return "Point{x:"+x+"; y:"+y+"; xSpeed:"+xSpeed+"; ySpeed:"+ySpeed+"}";
    }
    public void moveUp() {
        y+=ySpeed;
        System.out.println("Движение точки вних");
    }
    public void moveDown() {
        y-=ySpeed;
        System.out.println("Движение точки вних");
    }
    public void moveLeft() {
        x+=xSpeed;
        System.out.println("Движение точки влево");
    }
    public void moveRight() {
        x+=xSpeed;
        System.out.println("Движение точки вправо");
    }
}

class test {
    public static void main(String[] args) {
        MovableCircle circle = new MovableCircle(5,5,2,2,3);
        System.out.println(circle.toString());
        circle.moveUp();
        circle.moveRight();
        System.out.println(circle.toString());
        circle.moveDown();
        circle.moveDown();
        circle.moveLeft();
        System.out.println(circle.toString());
    }
}







