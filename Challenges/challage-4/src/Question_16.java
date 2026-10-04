package src;

import java.util.Scanner;

public class Question_16 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("check odd or even number");
        System.out.print("Enter a valid number : ");
        int number = input.nextInt();


        if(number % 2 == 0){
            System.out.println("The number is even");
        }else{
            System.out.println("The number is odd" );
        }
    }
}
