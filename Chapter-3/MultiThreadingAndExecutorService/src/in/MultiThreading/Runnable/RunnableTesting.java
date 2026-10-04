package in.MultiThreading.Runnable;

public class RunnableTesting {
    static void main(String[] args) {
        long StartTime = System.currentTimeMillis();
        PrintRunnableClass p1 = new PrintRunnableClass('*');
        PrintRunnableClass p2 = new PrintRunnableClass('$');
        PrintRunnableClass p3 = new PrintRunnableClass('#');

        Thread T1 = new Thread(p1);  //Here thread is in new state
        T1.start();
        Thread T2 = new Thread(p2);  //Here thread is in new state
        T2.start();
        Thread T3 = new Thread(p3);   //Here thread is in new state
        T3.start();

        long endTime = System.currentTimeMillis();
        System.out.println();
        System.out.printf("%s total time %d: ",
                Thread.currentThread().getName(),
                (endTime - StartTime));
    }
}
