public class AUDIA4 extends AUDI{
    protected String chassisNumber;
    protected float availableFuel;

    public AUDIA4(float availableFuel, String chassisNumber){
        super(60, "Diesel", 6, 7);
        this.availableFuel = availableFuel;
        this.chassisNumber = chassisNumber;
    }
}
