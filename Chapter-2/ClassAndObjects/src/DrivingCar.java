public class DrivingCar {

    String Name;
    static int minAgeForDriving;
    String DriverLicence;
    int age;


    String color;
    float price;

     static{
         minAgeForDriving++;
         System.out.println("i am in the static code clock");
     }

        DrivingCar() {// default constructor
        color = "Red";
        price = 100;
    }
//--------OR --------------------------------------
    DrivingCar(String color) {// default constructor
        this.color = color;
        price = 100;
    }


    public boolean isAllowedTODrive() {
        return this.age >= minAgeForDriving;
    }

    public static void main(String[] args) {

        InstanceAndVariable myCar = new InstanceAndVariable();

//        myCar.addFuel(7);
//
//        myCar.drive();
//        myCar.drive();
//        myCar.drive();
//        myCar.addFuel(2);
//        myCar.drive();

        //-------------------------------------------------
//        myCar.addFuel(7);
//        myCar.start();
//        myCar.drive();
        // -------OR-----------------------------------------
//        myCar.addFuel(7);
//        InstanceAndVariable carStarted = myCar.start();
//        carStarted.drive();
        // -------OR-----------------------------------------
        myCar.addFuel(7);
        myCar.start().drive();


//        DrivingCar myDrivingCar = new DrivingCar();
        DrivingCar myDrivingCar = new DrivingCar("blue");
        myDrivingCar.DriverLicence = "1/2/2012";

//        System.out.println(minAgeForDriving); //true
//        DrivingCar myDrivingCar = new DrivingCar();

        System.out.println(myDrivingCar.color);

        System.out.println(myCar.getCurrentFuelInLiter());
    }
}