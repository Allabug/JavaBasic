package aggregation.ex2;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Car car = new Car("Ford Mustang");
        String nameCar = car.getModelCar();
        System.out.println("Car model: " + nameCar);

        System.out.println("Let's try to start the car");
        car.runCar();

        Engine engine = new Engine("V8", 6.0);
        System.out.println("Install the engine.");
        car.setEngine(engine);
        System.out.println("Let's try to start the car");
        car.runCar();

        Wheel wheel1 = new Wheel(16);
        Wheel wheel2 = new Wheel(16);
        Wheel wheel3 = new Wheel(16);
        Wheel wheel4 = new Wheel(16);
        System.out.println("Install wheels.");
        car.setWheels(wheel1, wheel2, wheel3, wheel4);
        System.out.println("Let's try to start the car");
        car.runCar();
        System.out.println("Refuel the car.\n");
        car.refuel();
        car.runCar();

        System.out.println("Current wheels:");
        ArrayList<Wheel> currentWheels = car.getWheels();
        for (Wheel w : currentWheels) {
            System.out.println(w);
        }

        System.out.println("Replace the wheels");
        Wheel newWheel1 = new Wheel(17);
        car.changeWheel(0, newWheel1);
        car.changeWheel(1, newWheel1);
        car.changeWheel(2, newWheel1);
        car.changeWheel(3, newWheel1);

        for (Wheel w : currentWheels) {
            System.out.println(w);
        }
    }
}
