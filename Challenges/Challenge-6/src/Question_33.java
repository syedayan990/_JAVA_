import java.util.Scanner;

public class Question_33 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter the first number: ");
        int first = input.nextInt();
        System.out.println("Please enter the second number: ");
        int second = input.nextInt();
        int GCD = GCD(first, second);
        System.out.println("The greatest number is: " + GCD);
    }

    public static int GCD(int first, int second) {
        int GCD = 1;
        int i = 1;
        int least = least(first, second);

        while (i <= least) {

            if (first % i == 0 && second % i == 0) {
                GCD = i;
            }
            i++;
        }
        return GCD;
    }

    public static int least(int num1, int num2) {
        if (num1 < num2) {
            return num1;
        }
        return num2;
    }
}
