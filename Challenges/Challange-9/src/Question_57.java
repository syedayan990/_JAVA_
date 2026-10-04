import java.util.Scanner;

public class Question_57 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("list of months in a year:");
        System.out.println("Please enter the month value: ");
        int month = input.nextInt();
        Question_57 q = new Question_57();
        String ayan = q.MonthInYear(month);
        System.out.println(ayan);
    }

    public String MonthInYear(int num){
        return switch (num){
            case 1 -> "January";
            case 2 -> "February";
            case 3 -> "March";
            case 4 -> "April";
            case 5 -> "May";
            case 6 -> "June";
            case 7 -> "July";
            case 8 -> "August";
            case 9 -> "September";
            case 10 -> "October";
            case 11 -> "November";
            case 12 -> "December";
            default -> "Invalid year";
        };

    }
}
