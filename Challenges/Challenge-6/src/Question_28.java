public class Question_28 {
    static void main(String[] args) {
        multipleNumber(3);
    }

    public static void multipleNumber(int num) {
//        for (int i = 1; i <= 10; i++) {
//            System.out.println(num + " multiple number is: " + num * i);
//
//        }

        int i = 1;
        while(i <= 10){
            System.out.println(num + " multiple number is: " + num * i);
            i++;
        }

    }
}
