package task2.ex1;

public class MyMainTriangle {
    public static void main(String[] args) {

        Utils utils = new Utils();

        MyTriangle tr = new MyTriangle(20,90);
        System.out.println(utils.checkAngles(tr));
        System.out.println(utils.checkRightAngle(tr));

    }
}
