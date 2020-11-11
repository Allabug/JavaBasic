package simpleClasses.ex5;

public class DecimalCounter {
    int counter;
    int minValue;
    int maxValue;

    DecimalCounter() {
        this.counter = 5;
        this.minValue = 0;
        this.maxValue = 10;
    }

    DecimalCounter(int minValue, int maxValue, int counter) {
        this.counter = counter;
        this.minValue = minValue;
        this.maxValue = maxValue;
    }

    public void increaseCounter() {
        counter++;
        if (counter > maxValue) {
            System.out.println("Out Of bounds");
            counter = maxValue;
        }
    }

    public void decreaseCounter() {
        counter--;
        if (counter < minValue) {
            System.out.println("Out of bounds");
            counter = minValue;
        }
    }

    public int getCurrentValueOfCounter() {
        return counter;
    }

}
