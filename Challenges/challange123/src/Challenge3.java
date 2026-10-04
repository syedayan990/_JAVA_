// write code for all arithmetic operators----
//import java.util.Scanner;
//
//public class Challenge3 {
//    static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("welcome to the arithmetic operator-\n");
//        System.out.print("please enter the first number : ");
//        int first = input.nextInt();
//        System.out.print("please enter the second number : ");
//        int second = input.nextInt();
//
//        int add = first + second;
//        int sub = first - second;
//        int multi = first * second;
//        int div = first / second;
//        int modulo = first % second;
//
//        System.out.println("addition of two number : " + add);
//        System.out.println("subtraction of two number : " + sub);
//        System.out.println("multiple of two number : " + multi);
//        System.out.println("division of two number : " + div);
//        System.out.println("modulo of two number : " + modulo);
//
//    }
//}




//// write aa code for product of two floating number---
//import java.util.Scanner;
//public class Challenge3 {
//    static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("product of two floating numbers");
//        System.out.print("first number is : ");
//        double first = input.nextDouble();
//        System.out.print("second number is : ");
//        double second = input.nextDouble();
//
//        double product = first * second;
//
//        System.out.println("product of two numbers is : " + product);
//    }
//}





// parameter of a rectangle of side A B C D-
//import java.util.Scanner;
//public class Challenge3 {
//    static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("Find the parameter of a rectangle : ");
//        System.out.print("the first side of a rectangle is A : ");
//        int A = input.nextInt();
//        System.out.print("the second side of a rectangle is B : ");
//        int B = input.nextInt();
//        System.out.print("the third side of a rectangle is C : ");
//        int C = input.nextInt();
//        System.out.print("the fouth side of a rectangle is D : ");
//        int D = input.nextInt();
//
//        int parameter = A + B + C + D;
//
//        System.out.println("the parameter of a rectangle ABCD is : " + parameter);
//
//
//    }
//}




//find the area of triangle ABC--
//import java.util.Scanner;
//public class Challenge3 {
//    static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//        System.out.println("The area of triangle is");
//        System.out.print("The base of a triangle is : ");
//        double Base = input.nextDouble();
//        System.out.print("The height of a triangle is : ");
//        double height = input.nextDouble();
//
//        double area = 0.5*Base*height;
//
//        System.out.println("THE AREA OF TRIANGLE IS : " + area);
//    }
//}





// find the simple intrest---
////import java.util.Scanner;
////public class Challenge3 {
////    static void main(String[] args) {
////        Scanner input = new Scanner(System.in);
////        System.out.println("find the simple intrest");
//        System.out.print("the principle of simple intrest : ");
//        double principle = input.nextDouble();
//        System.out.print("the rate of simple intrest : ");
//        double Rate = input.nextInt();
//        System.out.print("the time for simple intrest : ");
//        double Time = input.nextInt();



////
////        double SimpleIntrest = (principle*Rate*Time)/100;
////
////        System.out.print("The simple intrest is : " + SimpleIntrest);
////
////    }
////}





// find compound intrest --
//import java.util.Scanner;
//public class Challenge3 {
//    static void main(String[] args) {
//        Scanner input = new Scanner(System.in);
//
//        System.out.println("find the simple intrest");
//        System.out.print("the principle of simple intrest : ");
//        double principle = input.nextDouble();
//        System.out.print("the rate of simple intrest : ");
//        double Rate = input.nextDouble();
//        System.out.print("the time for simple intrest : ");
//        double Time = input.nextDouble();
//
//        double CompoundIntrest = principle * Math.pow((1+Rate/100),Time);
//
//        System.out.println("The compound intrest is : " + CompoundIntrest);
//
//    }
//}




// convert Fahrenheit to Celsius-
import java.util.Scanner;
public class Challenge3 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("convert Fahrenheit to Celsius");
        System.out.print("take value of Fahrenheit : ");
        double Fahrenheit = input.nextDouble();

        double Celsius = (5.0 / 9)*(Fahrenheit - 32);

        System.out.println("value of celsius : " + Celsius);

    }
}
