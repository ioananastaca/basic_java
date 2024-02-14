package concurrency.p_c_utils;

import java.util.concurrent.BlockingQueue;

public class Producer implements Runnable {

    int questionNo;
    BlockingQueue<Integer> questionQueue;

    public Producer(BlockingQueue<Integer> questionQueue) {
        this.questionQueue = questionQueue;
    }


    @Override
    public void run() {
        while (true) {
            try {
                synchronized (this) {
                    int nextQuestion = questionNo++;
                    System.out.println("Got new question: " + nextQuestion);
                    questionQueue.put(nextQuestion);
                }
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

}
