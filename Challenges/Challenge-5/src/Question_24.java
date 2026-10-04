package src;

import java.util.Scanner;

public class Question_24 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("testing operators");
        System.out.println("enter first Number number :");
        int first = input.nextInt();

        int result = ~first;
        System.out.println("your result is "+result);
    }
}
