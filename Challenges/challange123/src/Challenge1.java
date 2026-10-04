// Question 1 --of challenge1=======================
//import java.util.Scanner;
//
//public class Challenge1 {
//    public static void main(String[] args) {
//        System.out.println("Enter Your Name: ");
//        Scanner input = new Scanner(System.in);
//        String name = input.nextLine();
//        System.out.println("Your Name is " + name);
//    }
//}




// Question 2 --of challenge1=======================

import java.util.Scanner;

public class Challenge1 {
    static void main(String[] args) {
        System.out.println("Lets Calculate The Two Numbers: ");
        Scanner input = new Scanner(System.in);
        System.out.print("Enter first number: ");

        int Alpha = input.nextInt();
        System.out.print("Enter second number: ");
        int Beta = input.nextInt();



        System.out.println("The Addition of two number is: " + (Alpha+Beta));
    }
}
