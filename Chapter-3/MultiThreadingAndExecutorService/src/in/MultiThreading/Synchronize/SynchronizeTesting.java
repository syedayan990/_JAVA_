package in.MultiThreading.Synchronize;

public class SynchronizeTesting {
    static void main(String[] args) {
        long startTime = System.currentTimeMillis();
        Counter counter = new Counter();
        UpdateThread t1 = new UpdateThread(counter);
        UpdateThread t2 = new UpdateThread(counter);

//        t1.start();  // yaha randomly execution ho raha h isliye jaghe counter ek dusre ko cancel kr rhe h like kabhi kabhi 2 counter ek tread mai ja rhe he to wo 2 ki jaghe ek hi ban ja rhe h basically(same value update hoti h kabhi kabhi)
//        t2.start();  // yaha randomly execution ho raha h isliye jaghe counter ek dusre ko cancel kr rhe h like kabhi kabhi 2 counter ek tread mai ja rhe he to wo 2 ki jaghe ek hi ban ja rhe h basically(same value update hoti h kabhi kabhi)

        try {
//            t1.start();   // yaha t1 khatam hone ke baad hi t2 start ho raha h isliye latency ya koi cancelation nhi hai
//            t1.join();   // yaha t1 khatam hone ke baad hi t2 start ho raha h isliye latency ya koi cancelation nhi hai
//
//            t2.start();   // yaha t1 khatam hone ke baad hi t2 start ho raha h isliye latency ya koi cancelation nhi hai
//            t2.join();   // yaha t1 khatam hone ke baad hi t2 start ho raha h isliye latency ya koi cancelation nhi hai

            // ---- OR ----------------------------------------------------

            t1.start();  //// here we use synchronization so we don't need to count sapreatly by using join()
            t2.start();  //// here we use synchronization so we don't need to count sapreatly by using join()

            t1.join();  //// here we use synchronization so we don't need to count sapreatly by using join()
            t2.join();  //// here we use synchronization so we don't need to count sapreatly by using join()

        } catch (InterruptedException e) {
            System.out.println("thread execution: " + e.getMessage());
        }
        long endTime = System.currentTimeMillis();
        System.out.printf("Final count value: %d and time taken: %d",
                counter.getCounter(),
                (endTime - startTime));

    }
}
