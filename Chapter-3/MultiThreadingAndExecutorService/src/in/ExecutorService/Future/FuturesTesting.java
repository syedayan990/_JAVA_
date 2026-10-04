package in.ExecutorService.Future;

import java.util.concurrent.*;

public class FuturesTesting {
    static void main(String[] args) throws ExecutionException, InterruptedException {
        ExecutorService Service = Executors.newFixedThreadPool(2); // its matter how many threads we pass
        FetchName task1 = new FetchName("Jamshed");
        FetchName task2 = new FetchName("Ayan");
        FetchName task3 = new FetchName("Anas");
        FetchName task4 = new FetchName("Farzan");

        Future<String> name1 = Service.submit(task1);  // iska mtlb hai result abhi nhi mila future mai milega
        Future<String> name2 = Service.submit(task2);  // iska mtlb hai result abhi nhi mila future mai milega
        Future<String> name3 = Service.submit(task3);  // iska mtlb hai result abhi nhi mila future mai milega
        Future<String> name4 = Service.submit(task4);  // iska mtlb hai result abhi nhi mila future mai milega

        System.out.printf("\nFull name is : %s", name1.get());  // yaha get main thread ko wait krata h jab tak khud execute nii hota
        System.out.printf("\nFull name is : %s", name2.get());  // yaha get main thread ko wait krata h jab tak khud execute nii hota
        System.out.printf("\nFull name is : %s", name3.get());  // yaha get main thread ko wait krata h jab tak khud execute nii hota
        System.out.printf("\nFull name is : %s", name4.get());  // yaha get main thread ko wait krata h jab tak khud execute nii hota

        Service.shutdown();
    }
}
