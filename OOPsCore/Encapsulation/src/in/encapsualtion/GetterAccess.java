package in.encapsualtion;

import in.GetterAndSetter.carDetail;

public class GetterAccess {

    static void main(String[] args) {
        carDetail  carDetail = new carDetail("Black" , 8000 ,
                                                     0.1 , "Swift");
//        carDetail.setColor("White");
        carDetail.setColor("red");
        System.out.printf("%s %s" , carDetail.getColor() , carDetail.getModel());
    }
}
