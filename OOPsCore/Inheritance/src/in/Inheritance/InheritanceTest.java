package in.Inheritance;

import in.Inheritance2.TwoWheeler;

public class InheritanceTest {
    static void main(String[] args) {
        System.out.println();

        Vehicle vehicle =  new Vehicle();
        vehicle.commute();// own properties
        System.out.println(vehicle.toString());// this all come from object class which is supreme parent class of all class
        System.out.println(vehicle.hashCode());// this all come from object class which is supreme parent class of all class
        System.out.println(vehicle.getClass());// this all come from object class which is supreme parent class of all class
        System.out.println();

        TwoWheeler twoWheeler = new TwoWheeler();
        twoWheeler.commute(); // inherit from parent
        twoWheeler.balance(); // own properties
        System.out.println();

        MotorCycle motorCycle = new MotorCycle();
        motorCycle.commute();// inherit from grandparent
        motorCycle.balance();//inherit from parent
        motorCycle.Start();// own properties
    }

}
