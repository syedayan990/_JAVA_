import java.lang.StringBuilder;

public class carDetail {

    int noOfWheels;

    int noOfDoors;

    int maxSpeed;

    String name;

    String modelNumber;

    String company;

    public carDetail(int noOfWheels, int noOfDoors, int maxSpeed, String name, String modelNumber, String company){
        this.noOfWheels = noOfWheels;
        this.noOfDoors = noOfDoors;
        this.maxSpeed = maxSpeed;
        this.name = name;
        this.modelNumber = modelNumber;
        this.company = company;
    }

    // with ToString method
//    @Override
//    public String toString() {
//        return "carDetail{" +
//                "noOfWheels=" + noOfWheels +
//                ", noOfDoors=" + noOfDoors +
//                ", maxSpeed=" + maxSpeed +
//                ", name='" + name + '\'' +
//                ", modelNumber='" + modelNumber + '\'' +
//                ", company='" + company + '\'' +
//                '}';
//    }
    // ---------OR  --------------
    //with String Builder


    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("carDetail{");
        sb.append("noOfWheels=").append(noOfWheels);
        sb.append(", noOfDoors=").append(noOfDoors);
        sb.append(", maxSpeed=").append(maxSpeed);
        sb.append(", name='").append(name).append('\'');
        sb.append(", modelNumber='").append(modelNumber).append('\'');
        sb.append(", company='").append(company).append('\'');
        sb.append('}');
        return sb.toString();
    }

    public static void main(String[] args) {
        carDetail myCar = new carDetail(4,4, 180,
                "BMW" , "ayan78" , "BMW");
        System.out.println(myCar.toString());
    }

}
