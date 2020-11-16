package aggregation.ex2;

public class Engine {
    private String type;
    private double capacity;

    public Engine(String type, double capacity) {
        this.type = type;
        this.capacity = capacity;
    }

    public String toString() {
        return "Engine type: " + type + "; " + "Engine capacity: " + capacity;
    }

}
