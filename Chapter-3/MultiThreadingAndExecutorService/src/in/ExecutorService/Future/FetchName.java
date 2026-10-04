package in.ExecutorService.Future;

import java.util.concurrent.Callable;

public class FetchName implements Callable<String> {

    private final String name;

    public FetchName(String name) {  // constructor
        this.name = name;
    }

    @Override
    public String call() throws Exception {
        System.out.printf("\nFetching Full name of %s from server: " , name);
        System.out.println();
        Thread.sleep(4000);
        return name + " Chandpuri";
    }
}
