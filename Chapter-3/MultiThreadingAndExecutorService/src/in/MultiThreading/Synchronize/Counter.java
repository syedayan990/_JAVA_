package in.MultiThreading.Synchronize;

public class Counter {

    private int counter = 0;

//    public void increment() {
//        counter++;
//    }

    public synchronized void increment() { // here we use synchronization so we don't need to count sapreatly by using join()
        counter++;
    }

    public int getCounter() {
        return counter;
    }
}
