import java.util.Scanner;

public class userInput {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Please enter your name: ");
        String name = input.nextLine();
        System.out.println("Good MORNING " + name);
        System.out.println(name + " also tell us your age");
        int age = input.nextInt();
        System.out.println("your age is " + age);
    }
}
