public class InstanceAndVariable {

    // Instance variables
    int noOfWheel;
    String color;
    float speedOfCar;
    float currentFuelInLiter;
    int noOfSeats;

    // Instance method

    public InstanceAndVariable start() {
        if (currentFuelInLiter == 0) {
            System.out.println("No fuel is available car will not start");
        } else if (currentFuelInLiter <= 5) {
            System.out.println("Car is on reserve mode, please refuel");
        } else {
            System.out.println("brurrrrhhhhh.... after start");
        }
        return this;
    }

    public void drive() {
        System.out.println("Driving continue");

        if (currentFuelInLiter > 0) {
            currentFuelInLiter--;
        }
    }

//    public void addFuel(float fuel) {
//        currentFuelInLiter += fuel;
//    }
    //--  OR ---------------
public void addFuel(float currentFuelInLiter) {
    this.currentFuelInLiter += currentFuelInLiter;
}


    public float getCurrentFuelInLiter() {
        return currentFuelInLiter;
    }


}