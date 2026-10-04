public class BreakStatement {
    static void main(String[] args) {
        System.out.println("Break statement");
        System.out.println("before break");
        for (int i = 1; i < 1000; i++) {
            if (i == 30) {
                break;
            }
            System.out.println(i);
        }
        System.out.println("after break");
    }
}
