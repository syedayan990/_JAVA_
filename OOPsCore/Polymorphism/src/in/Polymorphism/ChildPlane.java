package in.Polymorphism;

public class ChildPlane extends ParentVehicle{

    @Override
    public void Start() { // if we cant override value here then the value is print ParentVehicle
        super.Start(); // value taken from parent
        System.out.println("Inside ChildPlane Start 2222222");

    }
}
