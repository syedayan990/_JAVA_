package in.Asbstraction;

public class AbstractionTest {
    static void main(String[] args) {
        //ParentVehicle vehicle = new ParentVehicle(2);  //ParentVehicle is abstracted class it is not instantiated
        ChildCar car = new ChildCar(); // but we instantiate ParentVehicle class with the help of child class
        car.Commute(); //--here we use ParentVehicle class with the help of childCar class
//       System.out.println(car.toString());
        car.vehicleResponsibility();
    }
}
