import java.util.Scanner;

public class Question_35 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter a number: ");
        int num = input.nextInt();
        int Reverse = Reverse(num);
        System.out.print("Number after reverse: " + Reverse);
    }

    public static int Reverse(int num) {
        int newNum = 0;
        while(num > 0){
            int digit =  num % 10;
            newNum = newNum * 10 + digit;
            num /= 10;
        }
        return newNum;
    }
}
