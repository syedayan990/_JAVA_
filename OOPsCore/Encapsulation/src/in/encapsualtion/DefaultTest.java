package in.encapsualtion;


import in.encapsulation.AccessModifier;

public class DefaultTest {
    static void main(String[] args) {
//        AccessModifier accessModifier = new AccessModifier(5000, 0.1 ,
//                "kia" , "White");
        AccessModifier accessModifier = new AccessModifier();
        accessModifier.color = "Blue";
        accessModifier.model = "BMW";
        //accessModifier.contOfPurchases = ? // it is not accessible in other package classes its is only accessible in same packages classes
        System.out.println("Car modifier: " + accessModifier);

        // here we are not able to access default class because it is in locally access package
    }


}
