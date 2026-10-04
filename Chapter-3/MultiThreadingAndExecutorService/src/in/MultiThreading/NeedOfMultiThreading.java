package in.MultiThreading;

public class NeedOfMultiThreading {
    static void main(String[] args) {
        long StartTime = System.currentTimeMillis();

        // first task
        for (int i = 1; i <= 100; i++) {
            System.out.printf("%d* ", i);
        }
        System.out.println("\n* task complete");

        // Second task
        for (int i = 1; i <= 100; i++) {
            System.out.printf("%d& ", i);
        }
        System.out.println("\n& task complete");

        // third task
        for (int i = 1; i <= 100; i++) {
            System.out.printf("%d# ", i);
        }
        System.out.println("\n# task complete");
        long endTime = System.currentTimeMillis();
        System.out.println();
        System.out.printf("total time %d: ", (endTime - StartTime));
    }
}
