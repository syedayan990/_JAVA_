import java.util.Scanner;

public class AccToTernaryOperator {
    static void main(String[] args) {
        Scanner input = new Scanner((System.in));
        System.out.println("welcome to the number checker: ");
        System.out.print("Please enter your first number: ");
        int firstNumber = input.nextInt();
        System.out.print("Please enter your second number: ");
        int secondNumber = input.nextInt();
        Checker(firstNumber, secondNumber);

    }

    public static void Checker(int firstNumber, int secondNumber) {

//        if(firstNumber > secondNumber){
//            int Greater = firstNumber;
//            System.out.println(Greater + " is the greatest number");
//        }else{
//            int  Greater = secondNumber;
//            System.out.println(Greater + " is the greatest number");
//        }

        int GreaterNumber = firstNumber > secondNumber ? firstNumber : secondNumber;
        System.out.println(GreaterNumber + " is the Greatest number");


    }
}
