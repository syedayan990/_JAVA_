package in.MultiThreading;

import in.MultiThreading.Runnable.PrintRunnableClass;

public class PriorityTesting {
    static void main(String[] args) {
        long StartTime = System.currentTimeMillis();
        PrintRunnableClass p1 = new PrintRunnableClass('*');
        PrintRunnableClass p2 = new PrintRunnableClass('$');
        PrintRunnableClass p3 = new PrintRunnableClass('#');

        Thread T1 = new Thread(p1);  //Here thread is in new state
        T1.setPriority(Thread.MIN_PRIORITY);
        T1.start();
        Thread T2 = new Thread(p2);  //Here thread is in new state
        T2.setPriority(Thread.MAX_PRIORITY);
        T2.start();
        Thread T3 = new Thread(p3);   //Here thread is in new state
        T3.setPriority(Thread.NORM_PRIORITY);
        T3.start();

        long endTime = System.currentTimeMillis();
        System.out.println();
        System.out.printf("%s total time %d: ",
                Thread.currentThread().getName(),
                (endTime - StartTime));
    }
}
