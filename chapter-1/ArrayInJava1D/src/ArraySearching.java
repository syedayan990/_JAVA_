import java.util.Scanner;

public class ArraySearching {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int[] arr = {2 ,34 , 56, 12, 4, 7, 8,9};
        System.out.println("Enter the number: ");
        int num = input.nextInt();
        boolean isFound = isFound(arr , num);
        if(isFound){
            System.out.println("The number is found : " + num);
        }else{
            System.out.println("The number is not found : " + num);
        }
    }

    public static boolean isFound(int[] arr, int num){
        for(int index = 0; index <= arr.length; index++){
            if(arr[index] == num){
                return true;
            }

        }
        return  false;
    }
}
