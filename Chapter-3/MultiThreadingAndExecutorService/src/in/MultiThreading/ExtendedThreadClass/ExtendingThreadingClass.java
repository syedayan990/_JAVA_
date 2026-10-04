package in.MultiThreading.ExtendedThreadClass;

public class ExtendingThreadingClass {
    static void main(String[] args) {
        long StartTime = System.currentTimeMillis();

        FirstTask T1 = new FirstTask();
        SecondTask T2 = new SecondTask();
        ThirdTask T3 = new ThirdTask();

        System.out.println("\nStarting First Thread");
        T1.start();
        System.out.println("\nStarting Second Thread");
        T2.start();
        System.out.println("\nStarting Third Thread");
        T3.start();


        long endTime = System.currentTimeMillis();
        System.out.println();
        System.out.printf("%s total time %d: ",
                Thread.currentThread().getName(),
                (endTime - StartTime));
    }
}
