package in.Varages;

public class varArgs {

    public static int sum(int a , int b){
        return a + b;
    }
    
//    public static int sum(int[] a){  // array ke sath ye krna kafi tough or lengthy process hai
//        int sum = 0;
//        for (int i : a) {
//            sum += i;
//        }
//        return sum;
//    }

//    public static int sum(int... a){
//                int sum = 0;
//        for (int i : a) {
//            sum += i;
//        }
//        return sum;
//    }
//----   OR --------
    public static int sum(int first , int second ,int... a){   // it is same as upper but hume isme 2 elemrnt pass krne padege baki ye array khud se create kr lega
        int sum = 0;
        for (int i : a) {
            sum += i;
        }
        return sum;
    }

//    static void main(String[] args) {
//        System.out.println(sum(4 , 5));
//       // System.out.println(sum(new int[] {4, 5, 6}));  // array ke sath ye krna kafi tough or lengthy process hai
//        System.out.println(sum(4, 5, 6 , 7, 6));  // now here we pass the value directly with any size
//        //System.out.println(sum(4, 5, 6));
//    }

    //       OR
    static void main(String... args) {
        System.out.println(sum(4 , 5));
        // System.out.println(sum(new int[] {4, 5, 6}));  // array ke sath ye krna kafi tough or lengthy process hai
        System.out.println(sum(4, 5, 6 , 7, 6));  // now here we pass the value directly with any size
        //System.out.println(sum(4, 5, 6));
    }
}
