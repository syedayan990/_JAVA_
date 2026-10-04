import java.util.Scanner;

public class Question_54 {
    public static void main(String[] args) {
     Scanner input = new Scanner(System.in);
        System.out.println("Check number is odd or even:");
        System.out.print("please enter a number: ");
        int num = input.nextInt();
        Question_54 q = new Question_54();
        int isEvenOrOdd = q.checkOddOrEven(num);
        if(isEvenOrOdd == 1){
            System.out.print(num + "Even number");
        }
        else{
            System.out.print(num + "odd number");
        }

    }
    public int checkOddOrEven(int num){
        int checkOddOrEven = (num % 2 == 0) ? 1 : 0;
        return checkOddOrEven;
    }
}
