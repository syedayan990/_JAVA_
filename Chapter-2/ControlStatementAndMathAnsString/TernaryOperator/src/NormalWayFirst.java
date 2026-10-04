import java.util.Scanner;

public class NormalWayFirst {
    static void main(String[] args) {
        Scanner input = new Scanner((System.in));
        System.out.println("welcome to the number checker: ");
        System.out.print("Please enter your first number: ");
        int firstNumber = input.nextInt();
        System.out.print("Please enter your second number: ");
        int secondNumber = input.nextInt();
        boolean Checker = Checker(firstNumber , secondNumber);
        if(Checker == true){
            System.out.println("first is greater than second");
        }else{
            System.out.println("first is not greater than second");
        }
    }

    public static boolean Checker(int firstNumber , int secondNumber){
        if(firstNumber > secondNumber){
            return true;
        }
        return false;
    }
}
