import java.util.Scanner;

public class Question_53 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("find the minimum of two number");
        System.out.print("please enter your first number: ");
        int first = input.nextInt();
        System.out.print("please enter your second number: ");
        int second = input.nextInt();
        Question_53 ternary = new Question_53(); // use for applying non-static method in the class
        ternary.MinNumber(first, second);

    }

    public void MinNumber(int first, int second) {// here we use non-static function or method
        System.out.println(
                first < second
                        ? first + " is the minimum number"
                        : first > second
                          ? second + " is the minimum number"
                          : "Both numbers are equal"
        );
    }
}
