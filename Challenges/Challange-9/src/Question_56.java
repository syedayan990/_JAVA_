import java.util.Scanner;

public class Question_56 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("marks calculator");
        System.out.print("Enter a number: ");
        Question_56 q = new Question_56();
        int num = input.nextInt();
        String ayan = q.marksCalculator(num);


    }
    public String marksCalculator(int marks) {
        String marksCalculator = (marks >= 80) ? "High" : (marks >= 50 ? "moderate" : "Low");
        System.out.println(marksCalculator);
        return marksCalculator;
    }
}
