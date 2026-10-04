import java.util.Scanner;

public class ReturnStatement {
    static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("make a calculator calculate the value of two number: ");
        greetUser();
//        System.out.println("please enter the first number: ");
//        int num1 = reedNumber();
        int num1 = reedNumber() + 1;
//        System.out.println("please enter the second number: ");
//        int num2 = reedNumber();
        int num2 = reedNumber() + 2;
        int sum =  num1 + num2;
        System.out.println("the sum of two number is: " + sum);


    }
    static int reedNumber(){
        Scanner input = new Scanner(System.in);
        System.out.println("please enter the number: ");
        return input.nextInt();
    }

    static void greetUser() {
        System.out.println("make a calculator calculate the value of two number: ");
    }
}
