package pr_7;

interface Movable {
    void moveUp();
    void moveDown();
    void moveLeft();
    void moveRight();
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
    static public boolean SpeedTest(MovablePoint p1, MovablePoint p2) {
        if (p1.xSpeed == p2.xSpeed & p1.ySpeed == p2.ySpeed)
            return true;
        else return false;
    }
}

class Task3 {
    public static void main(String[] args) {
        MovablePoint p1 = new MovablePoint(0,0,1,1);
        MovablePoint p2 = new MovablePoint(0,0,1,1);
        System.out.println(MovablePoint.SpeedTest(p1,p2));
    }
}



