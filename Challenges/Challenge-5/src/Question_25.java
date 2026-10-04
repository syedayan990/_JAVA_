package src;

import java.util.Scanner;

public class Question_25 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("testing operators");
        System.out.println("enter first Number number :");
        int first = input.nextInt();

//        int result = first << 3;
        int result = first >> 1;
        System.out.println("your result is "+result);
    }
}
