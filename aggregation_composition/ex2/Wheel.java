package aggregation.ex2;

public class Wheel {

    private int diameter;
    private int width;

    public Wheel(int diameter) {
        this.diameter = diameter;
            }

    public void setDiameter(int diameter) {
        this.diameter = diameter;
    }

    public int getDiameter() {
        return diameter;
    }

    public String toString(){
        return "Wheel diameter: " + diameter;
    }
}
