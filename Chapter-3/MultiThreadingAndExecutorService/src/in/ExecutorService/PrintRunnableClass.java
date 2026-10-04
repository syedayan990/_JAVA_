package in.ExecutorService;

public class PrintRunnableClass implements Runnable {
    @Override
    public void run() {
            // print Runnable task
            for (int i = 1; i <= 100; i++) {
                try {
                    Thread.sleep(50);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.printf("%d%c ", i , TargetChar);
            }
            System.out.printf("\n* %s %c task complete" , Thread.currentThread().getName() , TargetChar);
    }

    private final char TargetChar;

    public PrintRunnableClass(char TargetChar) {
        this.TargetChar = TargetChar;
    }
}
