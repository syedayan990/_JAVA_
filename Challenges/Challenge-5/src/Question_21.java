package src;

import java.util.Scanner;

public class Question_21 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("testing operators");
        System.out.println("enter first Number number :");
        int first = input.nextInt();
        System.out.println("enter second Number number :");
        int second = input.nextInt();

        int result = first & second;
        System.out.println(result + " result is ");

    }
}
