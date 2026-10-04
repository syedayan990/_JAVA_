package in.MultiThreading.JoinClass;

import in.MultiThreading.Runnable.PrintRunnableClass;

public class JoinTesting {
    static void main(String[] args) throws InterruptedException {
        long StartTime = System.currentTimeMillis();
        PrintRunnableClass p1 = new PrintRunnableClass('*');
        PrintRunnableClass p2 = new PrintRunnableClass('$');
        PrintRunnableClass p3 = new PrintRunnableClass('#');

        Thread T1 = new Thread(p1);  //Here thread is in new state
        T1.start();
        System.out.println("\nThread 1 started");
        Thread T2 = new Thread(p2);  //Here thread is in new state
        T2.start();
        System.out.println("\nThread 2 started");
        T1.join();
        Thread T3 = new Thread(p3);   //Here thread is in new state
        T3.start();
        System.out.println("\nThread 3 started");

        long endTime = System.currentTimeMillis();
        System.out.println();
        System.out.printf("%s total time %d: ",
                Thread.currentThread().getName(),
                (endTime - StartTime));
    }
}
