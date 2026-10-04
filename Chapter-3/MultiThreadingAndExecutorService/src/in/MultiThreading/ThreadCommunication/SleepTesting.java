package in.MultiThreading.ThreadCommunication;

public class SleepTesting {
    static void main(String[] args) throws InterruptedException {
        System.out.println("before Sleeping");
        Thread.sleep(2000);
        System.out.println("after Sleeping");
    }
}
