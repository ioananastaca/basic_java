package concurrency.p_c_utils;

import java.util.concurrent.BlockingQueue;

public class Consumer implements Runnable{
    BlockingQueue<Integer> questionQueue;

    public Consumer(BlockingQueue<Integer> questionQueue) {
        this.questionQueue = questionQueue;
    }
    @Override
    public void run() {
        while(true) {
            try {
                Thread.sleep(1000);
                System.out.println("ANSWERED question " + questionQueue.take());
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
