package simpleClasses.ex7;

public class Triangle {
    public Side getSideAb() {
        return sideAb;
    }

    public Side getSideBc() {
        return sideBc;
    }

    public Side getSideAc() {
        return sideAc;
    }

    private Side sideAb;
    private Side sideBc;
    private Side sideAc;
    private double perimeter;
    private double area;

    public Triangle(){
    }

    public Triangle(Side sideAb, Side sideBc, Side sideAc) {
        this.sideAb = sideAb;
        this.sideBc = sideBc;
        this.sideAc = sideAc;
    }

    public Triangle createTriangle() {
        Triangle triangle = new Triangle(new Side().getSideAb(), new Side().getSideBc(), new Side().getSideAc());
        return triangle;
    }


    public double getPerimeterTriangle() {
        perimeter = sideAb.getSideLength() + sideBc.getSideLength() + sideAc.getSideLength();
        return perimeter;
    }

    public double getAreaTriangle() {
        double p = getPerimeterTriangle() / 2;
        double lengthAb = sideAb.getSideLength();
        double lengthBc = sideBc.getSideLength();
        double lengthAc = sideAc.getSideLength();
        area = Math.sqrt(p * (p - lengthAb) * (p - lengthBc) * (p - lengthAc));
        return area;
    }

    public Point getMedianIntersectionPoint() {
        double pointX = ( sideAb.getP1().getX() + sideAb.getP2().getX() + sideBc.getP2().getX()) / 3;
        double pointY = (sideAb.getP1().getY() + sideBc.getP1().getY() + sideBc.getP2().getY()) / 3;
        return new Point(pointX, pointY);
    }
}
