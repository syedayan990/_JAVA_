import java.util.Scanner;

public class FactorialWithRecursion {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Factorial using recursion");
        System.out.print("Enter a number: ");
        int number = input.nextInt();
        long result = factorial(number);
        System.out.print("The factorial of " + number + " is " + result);
    }

    public static long factorial(int number) {
        if (number == 1) {
            return 1;
        }
        return number * factorial(number - 1);
    }
}
