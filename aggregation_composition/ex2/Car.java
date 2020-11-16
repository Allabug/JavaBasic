package aggregation.ex2;

import java.util.ArrayList;
import java.util.Collections;

public class Car {
    private String modelCar;
    private Engine engine;
    private ArrayList<Wheel> wheels;
    private boolean fuel;

    public Car(String modelCar) {
        this.modelCar = modelCar;
    }

    public Car(String modelCar, Engine engine) {
        this.modelCar = modelCar;
        this.engine = engine;
        this.wheels = new ArrayList<Wheel>(4);
        this.fuel = false;
    }

    public void setWheels(Wheel w1, Wheel w2, Wheel w3, Wheel w4) {
        ArrayList<Wheel> wheels = new ArrayList<>();
        Collections.addAll(wheels, w1, w2, w3, w4);
        this.wheels = wheels;
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
        if(engine == null) {
            System.out.println("The car will not start. The car has no engine!\n");
        } else if ( wheels == null) {
            System.out.println("The car will not run no wheels!\n");
        } else if(fuel == false) {
            System.out.println("The car will not go no gasoline!\n");
        } else {
            System.out.println("The car can go!\n");
        }
    }
}
