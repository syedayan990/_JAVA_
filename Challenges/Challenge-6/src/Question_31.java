import java.util.Scanner;

public class Question_31 {

    public static void main(String[] args) {
        ayan();
    }

    public static void ayan() {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int number = input.nextInt();

        int sum = 0;
        while (number > 0) {
            sum += number % 10;
            number /= 10;
        }
        System.out.println("The sum is " + sum);
    }
}