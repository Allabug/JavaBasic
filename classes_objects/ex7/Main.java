package simpleClasses.ex7;

public class Main {
    public static void main(String[] args) {
        Triangle obj = new Triangle();
        Triangle triangle = obj.createTriangle();

        double perimeter = triangle.getPerimeterTriangle();
        System.out.println("Perimeter of a triangle = " + perimeter);

        double area = triangle.getAreaTriangle();
        System.out.println("Area of a triangle = " + area);

        Point medianPoint = triangle.getMedianIntersectionPoint();
        System.out.println("Median intersection point " + "(" + medianPoint.getX() + ":"+ medianPoint.getY()+ ")");
    }
}
