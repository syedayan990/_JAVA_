package in.encapsulation;

public class AccessModifierTest {
    static void main(String[] args) {
        AccessModifier accessModifier = new AccessModifier();
        accessModifier.color = "RED";
        accessModifier.model = "KIA saltos";
        accessModifier.contOfPurchases = 5000;
        System.out.println("The car modifier: " + accessModifier);
        System.out.println();
        AccessModifier car =  new AccessModifier(5000, 0.1 , "kia" , "White");
        System.out.println("Car detail: " + car);

        Default d = new Default(); // here we access default class because this class is locally present in package
    }

}
