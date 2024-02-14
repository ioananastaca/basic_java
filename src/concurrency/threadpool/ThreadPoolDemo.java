package concurrency.threadpool;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

public class ThreadPoolDemo {
    public static void main(String[] args) {
        ExecutorService executor = Executors.newFixedThreadPool(2);

        Runnable processor = new MessageProcessor(2);
        executor.execute(processor);

        Runnable processor2= new MessageProcessor(5);
        executor.execute(processor2);

        Runnable processor3 = new MessageProcessor(7);
        executor.execute(processor3);

        executor.shutdown();//rejects any new task for being submitted.Gracefully
        while (!executor.isTerminated()){

        }
        System.out.println("DONE!!");
    }
}
