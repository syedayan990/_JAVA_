package in.Polymorphism;

public class ChildCar extends ParentVehicle {
        public int noOfDoors(){
            return 5;
        }

    @Override
    public void Start() {
        super.getNoOftire();
        System.out.println("Inside ChildCar Start");
    }
}
