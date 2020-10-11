package task2.ex1;

public class Utils {

    public String checkAngles(MyTriangle triangle) {
        if (triangle.ang3 < 0 || triangle.ang2 < 0 || triangle.ang1 < 0 || triangle.angSum != 180) {
            return "трегольник несуществует";
        } else {
            return "трегольник существует";
        }

    }

    public String checkRightAngle(MyTriangle triangle2) {
        if (triangle2.ang1 == 90 || triangle2.ang2 == 90 || triangle2.ang3 == 90) {
            return "треугольник прямоугольный";
        } else {
            return "";
        }
    }
}