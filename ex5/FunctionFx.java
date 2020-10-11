package task2.ex5;
import java.math.*;
public class FunctionFx {
    public double myfunction (int x){
        if(x <= 3) {
            return (Math.pow(x, 2) - 3*x + 9);
        } else {
            return (1 / (Math.pow(x, 3)) + 6);
        }
    }

    public static void main(String[] args) {
        FunctionFx f = new FunctionFx();
        System.out.println(f.myfunction(26));
    }

}
