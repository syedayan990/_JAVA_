package src;

import java.util.Scanner;

public class Question_20 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Welcome to the age group calender");
        System.out.println("Please enter your age: ");
        int age = input.nextInt();


        if(age < 13){
            System.out.println("you are a child");
        }else if(age < 20){
            System.out.println("you are a teenager");
        }
        else if(age < 60){
            System.out.println("you are a Adult");
        }else{
            System.out.println("you are a senior");
        }
    }
}
