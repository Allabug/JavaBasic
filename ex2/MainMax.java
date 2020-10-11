package task2.ex2;

public class MainMax {
    public static void main(String[] args) {
        MaxFromMin min = new MaxFromMin();
        System.out.println(min.checkMax(min.checkMinAorB(5, 200), min.checkMinAorB(10, 20) ));

    }
}
