package in.Inheritance;

public class Vehicle {

        //public int noOfWheels;
    //------------------------------------
        //  private int noOfWheels = 8; // after private parent not inherit there properties to their child
    //------------------------------------
         //int noOfWheels = 8;// it is default, and we are not able to use this beyond the package so we use protected here
    //-----------------------------------
         protected int noOfWheels = 8;  // here we use protected because i want to access this beyond the package

    public Vehicle() {
    }

    public void setNoOfWheels(int noOfWheels){
             this.noOfWheels = noOfWheels;
         }

    @Override
    public String toString() {
        return noOfWheels + " Wheels"; // this override the object supreme class thinks (toString)
    }

    public void commute(){
            System.out.printf("i am going place A to place B using %d tires\n" , noOfWheels);
        }

}
