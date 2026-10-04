public class StringClassFormater {
    static void main(String[] args) {
        String name = "Ayan";
        int marks = 90;
        int marks2 = 8000;
        System.out.println("my name is " + name + " and marks is " + marks);// here we concatenate String and integer value here we use extra memory
        // so we use this
        System.out.printf("my name is %s and my marks1 is %d and marks2 is %d  " , name , marks , marks2);
        System.out.printf("%nmy name is %10S and my marks1 is %d and marks2 is %d " , name , marks , marks2);
        System.out.printf("\n%nmy name is %S and my marks1 is %d and marks2 is %d " , name , marks , marks2);
        System.out.printf("\n%nmy name is %S and my marks1 is %d and marks2 is %0,5d " , name , marks , marks2);

    }
}
