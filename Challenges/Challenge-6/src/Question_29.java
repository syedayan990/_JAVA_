import java.util.Scanner;

public class Question_29 {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter a number: ");
        int num = input.nextInt();

        int sum = sumOfOddNumber(num);

        System.out.println("Sum of odd numbers = " + sum);
    }

    public static int sumOfOddNumber(int num) {

        int sum = 0;

        for (int i = 1; i <= num; i += 2) {
            sum += i;
        }

        return sum;
    }
}