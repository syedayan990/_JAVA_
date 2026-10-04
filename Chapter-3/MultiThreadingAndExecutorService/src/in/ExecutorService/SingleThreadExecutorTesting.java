package in.ExecutorService;

import in.MultiThreading.Runnable.PrintRunnableClass;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class SingleThreadExecutorTesting {
    static void main(String[] args) {
        ExecutorService service = Executors.newSingleThreadExecutor();
        PrintRunnableClass task1 = new PrintRunnableClass('*');
        PrintRunnableClass task2 = new PrintRunnableClass('$');
        PrintRunnableClass task3 = new PrintRunnableClass('#');


        service.submit(task1);
        service.submit(task2);
        service.submit(task3);

        service.shutdown();
    }
}
