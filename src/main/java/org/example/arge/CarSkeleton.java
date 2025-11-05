package org.example.arge;

public class CarSkeleton {
    private String name;
    private String description;

    public CarSkeleton() {
    }

    public CarSkeleton(String name, String description) {
        this.name = name;
        this.description = description;
    }

    public String getName() {
        return name;
    }

    public String getDescription() {
        return description;
    }

    public void startEngine() {
        System.out.println(getClass().getSimpleName() + " -> startEngine()");
        System.out.println("The car's engine is starting...");
    }

    public void drive() {
        System.out.println(getClass().getSimpleName() + " -> drive()");
        runEngine();
        System.out.println("The car is now driving.");
    }

    protected void runEngine() {
        System.out.println(getClass().getSimpleName() + " -> runEngine()");
        System.out.println("Running generic car engine...");
    }
}
