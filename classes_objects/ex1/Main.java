package simpleClasses.ex1;

public class Main {
    public static void main(String[] args) {
        int a = 6;
        int b = 24;
        Test1 test = new Test1();
        test.setA(a);
        test.setB(b);
        test.printed();
        test.printSumNumbers();
        test.printMaxNumber();
    }
}
