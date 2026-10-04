package in.ExecutorService;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.TimeUnit;

public class MultipleThreadExecutorService {
    static void main(String[] args) throws InterruptedException {
        ExecutorService service = Executors.newFixedThreadPool(3);

        for(int i = 0; i < 10; i++) {
            PrintRunnableClass task = new PrintRunnableClass((char)i);
            service.submit(task);
        }

//        PrintRunnableClass task1 = new PrintRunnableClass('*');
//        PrintRunnableClass task2 = new PrintRunnableClass('$');
//        PrintRunnableClass task3 = new PrintRunnableClass('#');


//        service.submit(task1);
//        service.submit(task2);
//        service.submit(task3);

        service.shutdown();
        System.out.println("\n**********************1111");
        if(!service.awaitTermination(10, TimeUnit.SECONDS)){ // time out krega brcause print method mai task har 50ms mai exute hog or 10 taks h to time nii hoga itna
            System.out.println("\n********************222");
            service.shutdownNow();
        }
    }
}
