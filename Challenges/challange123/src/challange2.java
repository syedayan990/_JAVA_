//Q== create a program to SWAP two number

import java.util.Scanner;

public class challange2 {
    static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("value of Alpha: ");
        int Aplha = input.nextInt();
        System.out.print("value of Beta: ");
        int Beta = input.nextInt();



        int Gamma=Aplha;
        Aplha=Beta;
        Beta=Gamma;

        System.out.println("swaping is done: ");
        System.out.println("Swap value of Alpha: " + Aplha);
        System.out.println("Swap value od Beta: " + Beta);




    }
}
