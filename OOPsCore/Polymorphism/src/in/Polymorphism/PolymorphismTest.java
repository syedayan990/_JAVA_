package in.Polymorphism;

public class PolymorphismTest {
    static void main(String[] args) {
        ChildCar car = new ChildCar();
        ParentVehicle vehicle = new ParentVehicle();
        ChildPlane plane = new ChildPlane();           //--third class

       // car.Start();     // here override the value in class child plane
       // plane.Start();     // here override the value in class child plane


       castTestParent(vehicle);                       // humne vehicle method create kiya h to usme hum koi bhi vehicle pass kr skate h so they cant give any error
       castTestParent(car);                           // humne vehicle method create kiya h to use hum koi bhi vehicle pass kr skate h so they cant give any error
       castTestParent(plane);

       //castTestChild(vehicle);                       // but here we pass the method of child or car so every car is a vehicle bur every vehicle is not a cat.
        castTestChild(car);                             // but here we pass the method of child or car so every car is a vehicle bur every vehicle is not a cat.


//          ParentVehicle vcar = (ParentVehicle) car;
        ParentVehicle vCar = new ChildCar();            // upcasting
        //ChildCar hcar = new ParentVehicle();          // not valid statement Because the second line tries to put a Parent object into a Child reference.
        ChildCar cCar = (ChildCar) vCar;                // down casting where childCar is the refence and also childCar is objected

        //object oCar = new ChildCar();                     // because object is the supreme parent of all classes
        //object ooCar = new ParentVehicle();               // because object is the supreme parent of all classes
    }

    private static void castTestParent(ParentVehicle vehicle) {
          vehicle.Start();          // vehicle have their own properties
        if (vehicle instanceof ChildCar && vehicle instanceof ChildPlane) {
            ChildCar cCar = (ChildCar) vehicle;
            cCar.noOfDoors();
            cCar.Start();
        }
    }

    private static void castTestChild(ChildCar vehicle) {
        vehicle.Start();            // this is the child of parent so they have properties of vehicle
        vehicle.noOfDoors();
    }
}
