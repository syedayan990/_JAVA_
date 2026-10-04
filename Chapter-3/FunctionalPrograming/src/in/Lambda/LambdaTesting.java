package in.Lambda;

public class LambdaTesting {
    static void main(String[] args) {
        LambdaTesting testing = new LambdaTesting();
        int Sum = testing.sum(3 , 4);
        System.out.printf("Sum is : %d \n" , Sum);
        testing.printString("i am Ayan and i am the best");
    }

    public void printString(String toPrint){
        System.out.println(toPrint);
    }

    public int sum(int a, int b) {
        int sum = a + b;
        return sum;
    }
}
