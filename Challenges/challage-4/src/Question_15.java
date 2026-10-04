

import java.util.Scanner;

public class Question_15 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to thr number Checking\n");
        System.out.println("please enter your number : ");
        int number = input.nextInt();


        if (number > 0) {
            System.out.println("Number is positive integer");
        } else if (number < 0) {
            System.out.println("Number is a negative integer");
        } else {
            System.out.println("Number is zero integer");
        }
    }
}
