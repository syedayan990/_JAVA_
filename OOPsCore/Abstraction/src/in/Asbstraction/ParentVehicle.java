package in.Asbstraction;

public abstract class ParentVehicle implements Transport {

    private int noOfTire;

    public abstract void vehicleResponsibility();// it is the responsibility of the parent class pass to child class

    @Override
    public void StartAndGo() {  // here parentVehicle class fulfill the responsibility of transport class if parentVehicle is doing this then ChildCar can be fulfilled this responsibility
        System.out.println("startAndGo in ParentVehicle");
    }

    public ParentVehicle(int noOfTire) {// constructor
        this.noOfTire = noOfTire;
    }

    public int getNoOfTire() {
        return this.noOfTire;
    }

    public void setNoOfTire(int noOfTire) {
        this.noOfTire = noOfTire;

    }

    public void Commute() {
        System.out.println("going......");
    }
}
