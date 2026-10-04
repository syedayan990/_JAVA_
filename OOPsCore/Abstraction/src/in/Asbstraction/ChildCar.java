package in.Asbstraction;

import in.Inheritance.Vehicle;

public class ChildCar extends ParentVehicle {

    private int noOfDoor;

    public ChildCar() {
        super(4);
    }

//    @Override
//    public void StartAndGo() {   ChildCar fulfill this transport responsibility only if when parentVehicle class can't do
//        super.StartAndGo();
//    }

    @Override
    public void vehicleResponsibility() { // because of responsibility and implementing method of
        System.out.println("ChildCar vehicle responsibility");
    }
}
