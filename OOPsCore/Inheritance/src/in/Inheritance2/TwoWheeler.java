package in.Inheritance2;

import in.Inheritance.Vehicle;

public class TwoWheeler extends Vehicle {
      public TwoWheeler(){
          noOfWheels = 2;
//          setNoOfWheels(2);
      }

      public void balance(){
          System.out.println("I am balancing on two wheel");
      }
}
