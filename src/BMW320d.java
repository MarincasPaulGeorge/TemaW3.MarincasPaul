public class BMW320d extends BMW{

    protected String chassisNumber;
    protected float availableFuel;

    public BMW320d(float availableFuel, String chassisNumber){
        super(60, "Diesel", 6, 7.5);
        this.availableFuel = availableFuel;
        this.chassisNumber = chassisNumber;
    }

}
