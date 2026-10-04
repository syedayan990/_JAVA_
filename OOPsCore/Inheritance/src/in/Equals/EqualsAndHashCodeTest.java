package in.Equals;

public class EqualsAndHashCodeTest {
    static void main(String[] args) {
        Person person1 = new Person("Ayan", 18, "001");
//        Person person2 = new Person("Ayan", 18, "001");
        Person person2 = new Person("Ayan", 10, "001");
//
//        if(person1 == person2) // this equal to sign define the references that person1 ref point the same value as that person 2 point ref
//        {
//            System.out.println("Equals");
//        }
//        else
//        {
//            System.out.println("Not Equals");
//        }
        //------------------
        if (person1.equals(person2)) { // after equals overriding
            System.out.println("Equals");
        } else {
            System.out.println("Not Equals");
        }
    }


}
