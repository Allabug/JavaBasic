package simpleClasses.ex7;

class Point {
    private double x;
    private double y;

    public Point(){

    }

    public Point(double x, double y) {
        this.x = x;
        this.y = y;
    }

    public Point getPointA() {
        Point pointA = new Point(2, 2);
        return pointA;
    }

    public Point getPointB() {
        Point pointB = new Point(4, 8);
        return pointB;
    }

    public Point getPointC() {
        Point pointC= new Point(9, 2);
        return pointC;
    }

    public double getX() {
        return x;
    }

    public double getY() {
        return y;
    }
}
