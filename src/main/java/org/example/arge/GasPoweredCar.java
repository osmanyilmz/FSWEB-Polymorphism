package org.example.arge;

public class GasPoweredCar extends CarSkeleton {

    private double avgKmPerLitre;
    private int cylinders;

    public GasPoweredCar(String name, String description, double avgKmPerLitre, int cylinders) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.cylinders = cylinders;
    }

    public double getAvgKmPerLitre() {
        return avgKmPerLitre;
    }

    public int getCylinders() {
        return cylinders;
    }

    @Override
    public void startEngine() {
        System.out.println(getClass().getSimpleName() + " -> startEngine()");
        System.out.println("Igniting fuel and air mixture in " + cylinders + " cylinders...");
    }

    @Override
    public void drive() {
        System.out.println(getClass().getSimpleName() + " -> drive()");
        runEngine();
        System.out.println("Gas-powered car is cruising on the road.");
    }

    @Override
    protected void runEngine() {
        System.out.println(getClass().getSimpleName() + " -> runEngine()");
        System.out.println("The petrol engine is running smoothly. Efficiency: " + avgKmPerLitre + " km/L");
    }
}
