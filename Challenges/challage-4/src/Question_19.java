package src;

import java.util.Scanner;

public class Question_19 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to grades calculator");
        System.out.println("please enter your marks: ");
        int marks = input.nextInt();


        if(marks >= 90){
            System.out.println("your garde is A ");
        }else if(marks >= 75){
            System.out.println("your garde is B ");
        }else if(marks >= 60){
            System.out.println("your garde is C ");
        }else if(marks >= 30){
            System.out.println("your garde is D ");
        }else{
            System.out.println("your garde is F ");
        }
    }
}
