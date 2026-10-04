import java.util.Scanner;

public class ShortHandOperator {
    static void main(String[] args) {
        int num = 50;
        System.out.println("Print the addition value of num: " + num);
        Scanner input = new Scanner(System.in);
        int x1 = input.nextInt();
        num += x1;
        System.out.println(num);
        int x2 = input.nextInt();
        num += x2;
        System.out.println(num);
        int x3 = input.nextInt();
        num += x3;
        System.out.println(num);
        int x4 = input.nextInt();
        num += x4;
        System.out.println(num);




        System.out.println("Print the subtraction value of num: " + num);
        int y1 = input.nextInt();
        num -= x1;
        System.out.println(num);
        int y2 = input.nextInt();
        num -= x2;
        System.out.println(num);
        int y3 = input.nextInt();
        num -= x3;
        System.out.println(num);
        int y4 = input.nextInt();
        num -= x4;
        System.out.println(num);
    }
}
