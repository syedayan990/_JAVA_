import java.util.Scanner;

public class FactorialWithBruteForce {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Factorial with brute-force method");
        System.out.print("Enter the number of factorial you want to face in: ");
        int number = input.nextInt();
        long fact = Factorial(number);
        System.out.print("Factorial of " + number + " is: " + fact);

    }
    public static long Factorial(int number) {
        long result = 1;
        for(int i = 1; i <= number; i++){
           result *= i;
        }
        return result;
    }
}
