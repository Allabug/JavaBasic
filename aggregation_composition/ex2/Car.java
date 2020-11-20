package aggregation.ex2;

import java.util.ArrayList;
import java.util.Collections;

public class Car {
    private String modelCar;
    private Wheel w1;
    private Wheel w2;
    private Wheel w3;
    private Wheel w4;
    private ArrayList<Wheel> wheels = new ArrayList<>();
    private Engine engine;
    private boolean fuel;

    public Car(String modelCar, Engine engine, Wheel w1, Wheel w2, Wheel w3, Wheel w4) {
        this.modelCar = modelCar;
        this.engine = engine;
        this.w1 = w1;
        this.w2 = w2;
        this.w3 = w3;
        this.w4 = w4;
        this.wheels = new ArrayList<>(4);
        Collections.addAll(wheels, w1, w2, w3, w4);
        this.fuel = false;
    }

    public void setWheels(Wheel wheel1, Wheel wheel2, Wheel wheel3, Wheel wheel4) {
        wheels.set(0, wheel1);
        wheels.set(1, wheel2);
        wheels.set(2, wheel3);
        wheels.set(3, wheel4);
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public void refuel() {
        this.fuel = true;
    }

    public void changeWheel(int indexWheel, Wheel newWheel) {
        this.wheels.set(indexWheel, newWheel);
    }

    public Engine getEngine() {
        return engine;
    }

    public String getModelCar() {
        return modelCar;
    }

    public ArrayList<Wheel> getWheels() {
        return wheels;
    }

    public void runCar() {
        if (engine == null) {
            System.out.println("The car will not start. The car has no engine!\n");
        } else if (wheels == null) {
            System.out.println("The car will not run no wheels!\n");
        } else if (fuel == false) {
            System.out.println("The car will not go no gasoline!\n");
        } else {
            System.out.println("The car can go!\n");
        }
    }
}
