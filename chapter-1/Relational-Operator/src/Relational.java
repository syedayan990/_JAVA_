import java.util.Scanner;

public class Relational
{
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("welcome to Deriving license portal");
        System.out.println("please enter your age : ");
        int age = input.nextInt();

        if(age < 18){
            System.out.println("you are a child");
        }
        else if(age == 18){
            System.out.println("you are approx to alligible");
        }
        else if(age <= 24){
            System.out.println("you are alligible");
        }else if(age <= 60){
            System.out.println("you are approx to benifit");

        }
        else if(age == 90){
            System.out.println("you are in bennifit");
        }
        else{
            System.out.println("you are un-non person");
        }
    }
}
