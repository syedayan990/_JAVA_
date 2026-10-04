package in.ExceptionHandling;

import java.util.Scanner;

public class Calculator {
    public static void main(String[] args) {
        a();
    }

    private static void a(){
        b();
    }

    private static void b(){
        c();
    }

    private static void c(){
         d();
    }
    private static void d(){
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to Calculator");
        System.out.print("please enter your first number: ");
        int first = input.nextInt();
        System.out.print("please enter your second number: ");
        int second = input.nextInt();
//
//        try {
//            int result = first / second;
//            System.out.printf("result is: %d", result);
//        } catch (ArithmeticException e) {
//            e.getCause();
//            System.out.printf("%s Arithmetic Exception" , e.getMessage());
//        } catch (Throwable exe){
//            System.out.println("Exception caught");
//        }

        try {
            int[] a = new int[5];
            System.out.printf("result is %d ", a[6]);
            a[6] = first / second;
            System.out.printf("result is %d ", a[6]);

        }catch (ArithmeticException e){
            System.out.println("Arithmetic Exception");

        }catch (Throwable throwable){
            System.out.println("General Exception");
            throw throwable;
        }finally {
            System.out.println("Finally");
        }
    }
}
