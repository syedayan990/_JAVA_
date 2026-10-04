import java.util.Scanner;

public class Java12EnhancedSwitchCase {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the calender: ");
        System.out.print("Enter Your day: ");
        int day = input.nextInt();
        switchCase(day);
    }

    public static void switchCase(int day) {

        String output = switch (day){
            case 1 -> "Monday";
            case 2 -> "Tuesday";
            case 3 -> "Wednesday";
            case 4 -> "Thursday";
            case 5 -> "Friday";
            case 6 -> "Saturday";
            case 7 -> "Sunday";
            default -> "Invalid Day";
        };
        System.out.println(output);
        }
    }

