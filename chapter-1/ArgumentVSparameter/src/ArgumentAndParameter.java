public class ArgumentAndParameter {
    static void main(String[] args) {
//        ayan(5 , 6);
//    }
//    public static int ayan(int first , int second){
//        int sum = first + second;
//        System.out.println("print the value of sum: " + sum);
//        return sum;

        //----------------------------------------------------------
//        int sum = ayan(5, 6);
//        System.out.println("the sum of two number is: " + sum);
//    }
//
//    public static int ayan(int first, int second) {
//        int sum = first + second;
////        System.out.println("print the value of sum: " + sum);
//        return sum;
        System.out.println("the sum of two number : " + ayan(5 , 6));
        System.out.println();
        System.out.println("the sum of two number : " + ayan(15 , 16));
        System.out.println();
        System.out.println("the sum of two number : " + ayan(51 , 61));

    }
    public static int ayan(int first , int second){
        System.out.println("the first number is: " + first);

        System.out.println("the second number is: " + second);
        System.out.println();
        int sum = first + second;
        return sum;
    }
}
