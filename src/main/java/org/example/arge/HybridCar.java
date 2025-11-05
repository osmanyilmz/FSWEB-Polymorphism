package org.example.arge;

public class HybridCar extends CarSkeleton {

    private double avgKmPerLitre;
    private int batterySize;
    private int cylinders;

    public HybridCar(String name, String description, double avgKmPerLitre, int batterySize, int cylinders) {
        super(name, description);
        this.avgKmPerLitre = avgKmPerLitre;
        this.batterySize = batterySize;
        this.cylinders = cylinders;
    }

    public double getAvgKmPerLitre() {
        return avgKmPerLitre;
    }

    public int getBatterySize() {
        return batterySize;
    }

    public int getCylinders() {
        return cylinders;
    }

    @Override
    public void startEngine() {
        System.out.println(getClass().getSimpleName() + " -> startEngine()");
        System.out.println("Hybrid system engaging both electric motor and gas engine...");
    }

    @Override
    public void drive() {
        System.out.println(getClass().getSimpleName() + " -> drive()");
        runEngine();
        System.out.println("Hybrid car optimizes between electric and gas for best efficiency.");
    }

    @Override
    protected void runEngine() {
        System.out.println(getClass().getSimpleName() + " -> runEngine()");
        System.out.println("Battery (" + batterySize + " kWh) and " + cylinders +
                " cylinder engine working together. Efficiency: " + avgKmPerLitre + " km/L");
    }
}
