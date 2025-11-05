package org.example;

import org.example.arge.CarSkeleton;
import org.example.arge.ElectricCar;
import org.example.arge.GasPoweredCar;
import org.example.arge.HybridCar;
import org.example.company.Car;
import org.example.company.Ford;
import org.example.company.Holden;
import org.example.company.Mitsubishi;

public class Main {
    public static void main(String[] args) {
        Car car1 = new Mitsubishi(6, "Lancer");
        Car car2 = new Ford(8, "Mustang");
        Car car3 = new Holden(4, "Commodore");

        System.out.println(car1.startEngine());
        System.out.println(car2.accelerate());
        System.out.println(car3.brake());

        System.out.println(car1.equals(new Mitsubishi(6, "Lancer"))); // true

        CarSkeleton gasCar = new GasPoweredCar("Mustang GT", "High-performance petrol car", 12.5, 8);
        CarSkeleton electricCar = new ElectricCar("Tesla Model 3", "Efficient electric sedan", 500, 85);
        CarSkeleton hybridCar = new HybridCar("Toyota Prius", "Eco-friendly hybrid", 25.0, 40, 4);

        testCarBehavior(gasCar);
        testCarBehavior(electricCar);
        testCarBehavior(hybridCar);
    }

    private static void testCarBehavior(CarSkeleton car) {
        System.out.println("\n--- Testing " + car.getClass().getSimpleName() + " ---");
        car.startEngine();
        car.drive();
    }
}
