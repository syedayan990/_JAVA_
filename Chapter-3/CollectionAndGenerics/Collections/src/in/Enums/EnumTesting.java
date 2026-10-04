package in.Enums;

public class EnumTesting {
    static void main(String[] args) {

        TrafficLight Color = TrafficLight.YELLOW;
        Color = TrafficLight.GREEN;

//        Grade grade = Grade.A;
        Grade grade = Grade.valueOf("A"); // agr humne valye store ki hui h or data base ya netwok se nikl kr lana hate h to ese krege
        grade = Grade.B;
        for(Grade g : Grade.values()){
            System.out.println(g);
        }
    }

}
