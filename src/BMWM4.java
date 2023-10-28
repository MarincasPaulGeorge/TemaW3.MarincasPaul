public class BMWM4 extends Car{

    protected String chassisNumber;
    protected float availableFuel;

    public BMWM4(float availableFuel, String chassisNumber){
        super(60, "Petrol", 6, 10);
        this.availableFuel = availableFuel;
        this.chassisNumber = chassisNumber;
    }
}
