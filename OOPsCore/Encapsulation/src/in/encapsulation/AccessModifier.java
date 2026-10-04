package in.encapsulation;

public class AccessModifier {

    public String color;

    public String model;

    private double fuelLevel;

    //private long contOfPurchases;// for AccessModifier test

    long contOfPurchases;//for DefaultTest

    //default constructor
   public AccessModifier(){

   }


   // constructor
    public AccessModifier(long contOfPurchases, double fuelLevel, String model, String color) {
        this.contOfPurchases = contOfPurchases;
        this.fuelLevel = fuelLevel;
        this.model = model;
        this.color = color;
    }

    //toString builder
    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("AccessModifier{");
        sb.append("color='").append(color).append('\'');
        sb.append(", model='").append(model).append('\'');
        sb.append(", fuelLevel=").append(fuelLevel);
        sb.append(", contOfPurchases=").append(contOfPurchases);
        sb.append('}');
        return sb.toString();
    }
}
