package src;

import java.util.Scanner;

public class Question_18 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the year callander:");
        System.out.println("please enter the year : ");
        int year = input.nextInt();

        if (year % 400 == 0 || (year % 4 == 0 && year % 100 != 0)) {
            System.out.println("the year is the leap year");
        } else {
            System.out.println("the year is not a leap year");
        }
    }
}
