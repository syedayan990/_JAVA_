package in.Polymorphism;

public class ParentVehicle {

    private int noOftire;

    ParentVehicle(){
        this.noOftire=10;
    }
    ParentVehicle(int noOftire){
        this.noOftire=noOftire;
    }

    public int getNoOftire(){
        return this.noOftire;
    }

    public void Start(){
        System.out.println("Inside ParentVehicle Start 111111");
    }

//    public final void Start(){                                  // if we use final then we are not able to redefine and override this in anywhere
//        System.out.println("Inside ParentVehicle Start 111111");
//    }
}
