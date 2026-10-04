package src;

import java.util.Scanner;

public class Question_17 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Create the Gretest Number");
        System.out.println("Please enter your first number");
        int firstNumber = input.nextInt();
        System.out.println("Please enter your second number");
        int secondNumber = input.nextInt();
        System.out.println("Please enter your third number");
        int thirdNumber = input.nextInt();

        if (firstNumber >= secondNumber && firstNumber >= thirdNumber) {
            System.out.println(firstNumber + " The first number is greater than the second number");
        } else if (secondNumber >= firstNumber && secondNumber >= thirdNumber) {
            System.out.println(secondNumber + " The second number is greater than the first number");
        } else {
            System.out.println(thirdNumber + " The third number is greater than the first number");
        }

    }
}
