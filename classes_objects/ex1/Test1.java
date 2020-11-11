package simpleClasses.ex1;

public class Test1 {
    private int a;
    private int b;

    public void printed() {
        System.out.println("Variable a = " + this.a);
        System.out.println("Variable b = " + this.b);
    }

    public void setA(int x) {
        this.a = x;
    }

    public void setB(int y) {
        this.b = y;
    }

    public void printSumNumbers() {
        int sum = this.a + this.b;
        System.out.println("Sum variable a and variable b = " + sum);
    }

    public void printMaxNumber() {
        if (this.a > this.b) {
            System.out.println("Max number a = " + this.a);
        } else if(this.b > this.a){
            System.out.println("Max number b = " + this.b);
        } else {
            System.out.println( this.a + " equals " + this.b);
        }
    }
}
