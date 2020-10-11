package task2.ex3;

public class PointsOnLine {

    public String dotsEquation(int x1, int y1, int x2, int y2, int x3, int y3){
        if((x3 - x1)*(y2-y1) == (x2-x1)*(y3 - y1)){
            return "Точки лежат на одной прямой";
        } else {
            return "Точки не лежат на одной прямой";
        }
    }

    public static void main(String[] args) {
        PointsOnLine point = new PointsOnLine();
        System.out.println(point.dotsEquation(1,2, 2, 3, 3, 4));
    }
}
