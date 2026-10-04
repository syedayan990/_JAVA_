import java.util.Scanner;

public class Question_30 {
    static void main(String[] args) {
        ayan();
    }

    public static void ayan() {
        Scanner input = new Scanner(System.in);
        System.out.print("enter a number: ");
        int number = input.nextInt();
        long product = 1;
        if (number == 0) {
            System.out.println("The number is zero");
        } else {
            for (int i = 1; i <= number; i++) {
                product *= i;


            }
            System.out.println(product);
        }
    }
}
