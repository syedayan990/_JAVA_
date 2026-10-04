import java.util.Scanner;

public class SwitchCase {
    static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the calender: ");
        System.out.print("Enter Your day: ");
        int day = input.nextInt();
        switchCase(day);
    }

    public static void switchCase(int day) {
        switch(day){
            case 1:
                System.out.println("Monday");
                break;
            case 2:
                System.out.println("tuesday");
                break;
            case 3:
                System.out.println("wednesday");
                break;
            case 4:
                System.out.println("thursday");
                break;
            case 5:
                System.out.println("friday");
                break;
            case 6:
                System.out.println("saturday");
            case 7:
                System.out.println("holiday");
                break;
            case 8:
                System.out.println("sunday");
                break;
            default:
                System.out.println("Invalid day");
                break;

        }
    }
}
