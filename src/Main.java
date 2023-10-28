
public class Main {

    public static void main(String[] args) {
        BMW320d bmw320d = new BMW320d(35, "ABC123456789DEFXYZ");
        System.out.println("For BMW 320d: " + "Available fuel in tank: " + bmw320d.availableFuel + ", Chassis number VIN: " + bmw320d.chassisNumber);


        BMWM4 bmwm4 = new BMWM4(30, "12345WXYZ67890ABC");
        System.out.println("For BMW M4: " + "Available fuel in tank: " + bmwm4.availableFuel + ", Chassis number VIN: " + bmwm4.chassisNumber);

        AUDIA4 audia4 = new AUDIA4(25, "JKL987654321MNO456");
        System.out.println("For Audi A4: " + "Available fuel in tank: " + audia4.availableFuel + ", Chassis number VIN: " + audia4.chassisNumber);

        AUDIR8 audir8 = new AUDIR8(27, "XYZ7890PQR5678STU");
        System.out.println("For Audi R8?: " + "Available fuel in tank: " + audir8.availableFuel + ", Chassis number VIN: " + audir8.chassisNumber);


    }
}