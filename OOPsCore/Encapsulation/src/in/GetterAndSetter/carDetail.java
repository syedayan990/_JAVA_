package in.GetterAndSetter;

public class carDetail {

    private String color;

    private String model;

    private double fuelLevel;

    private long contOfPurchases;// Default

    public carDetail(String color, long contOfPurchases, double fuelLevel, String model) {
        this.color = color;
        this.contOfPurchases = contOfPurchases;
        this.fuelLevel = fuelLevel;
        this.model = model;
    }

    public carDetail() {

    }

    public String getColor(){
        return color;
    }

    public void setColor(String color){
//        this.color = color;// aha hum update kr rhe h color ko
        if(color.equals("red")){
            System.out.println("are you mad?");
        }else{
            this.color = color;
        }
    }

    public String getModel(){
        return model;
    }
}
