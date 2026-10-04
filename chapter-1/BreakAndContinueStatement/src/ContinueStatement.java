public class ContinueStatement {
    static void main(String[] args) {
        System.out.println("continue statement");
        System.out.println("before continue statement");
        for(int i = 0; i < 10; i++){
            if(i == 5){
                continue;
            }
            System.out.println(i);
        }
        System.out.println("after continue statement");
    }
}
