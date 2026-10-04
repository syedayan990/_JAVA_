public class Nested_loop {
    static void main(String[] args) {
        System.out.println("Printing the Nested loop implementation");
//        print this patther
//        /*
//        *
//        * *
//        * * *
//        * * * *
//        * * * * *
//        */
//        for(int i=0; i<=5; i++){
//            for(int j=1; j<=i+1; j++){
//                System.out.print(" * ");
//            }
//            System.out.println();
//        }

//        print this patther
        /*
        * * * * * *
        * * * * *
        * * * *
        * * *
        * *
        *
        * */

        for(int i=8; i>=0; i--){
            for(int j=i-1; j>=0; j--){
                System.out.print(" * ");
            }
            System.out.println();
        }
    }
}
