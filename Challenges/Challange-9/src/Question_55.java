import java.util.Scanner;

public class Question_55 {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);
        System.out.println("create a absolute number calculator");
        System.out.print("Enter a number: ");
        Question_55 q = new Question_55();
        int num = input.nextInt();
        int isAbsolute = q.AbsoluteValue(num);

    }
    public int AbsoluteValue(int num){
        int result = (num >= 0) ?  num  : -num;
        System.out.println("absolute value of " + num + " is " + result);
        return result;
    }
}
