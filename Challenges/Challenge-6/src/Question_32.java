import java.util.Scanner;

public class Question_32 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("enter your first number: ");
        int first = input.nextInt();
        System.out.print("enter your second number: ");
        int second = input.nextInt();
        int lcm = lcm(first , second);
        System.out.print("The largest number is: " + lcm);


    }
    public static int lcm(int first, int second)
    {
        int i= 1;
        while(i <= second){
            int factor = first * i;
            if(factor % second == 0){
                return factor;
            }
            i++;
        }
        return 0;
    }
}
