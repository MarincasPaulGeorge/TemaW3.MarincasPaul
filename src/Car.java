

public abstract class Car implements Vehicle {

    protected final double tankFuel;
    protected final String fuelType;
    protected final int maxGears;
    protected double consumptionPer100Km;


    public Car(float tankFuel, String fuelType, int maxGears, double consumptionPer100Km) {
        this.tankFuel = tankFuel;
        this.fuelType = fuelType;
        this.maxGears = maxGears;
        this.consumptionPer100Km = consumptionPer100Km;

    }


}
