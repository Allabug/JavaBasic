package simpleClasses.ex7;

import methods.Point1;

class Side {

    private Point p1;
    private Point p2;

    public Side() {

    }

    public Side(Point p1, Point p2) {
        this.p1 = p1;
        this.p2 = p2;
    }
    public Side getSideAb(){
        Side sideAb = new Side(new Point().getPointA(), new Point().getPointB());
        return sideAb;
    }

    public Side getSideBc(){
        Side sideBc = new Side(new Point().getPointB(), new Point().getPointC());
        return sideBc;
    }

    public Side getSideAc(){
        Side sideAc = new Side(new Point().getPointA(), new Point().getPointC());
        return sideAc;
    }

    public Point getP1() {
        return p1;
    }

    public Point getP2() {
        return p2;
    }

    public double getSideLength() {
        double lengthSide = Math.sqrt(Math.pow((p2.getX() - p1.getX()), 2) + Math.pow((p2.getY() - p1.getY()), 2));
        return lengthSide;
    }
}
