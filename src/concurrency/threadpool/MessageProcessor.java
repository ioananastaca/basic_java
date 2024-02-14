package concurrency.threadpool;

public class MessageProcessor implements Runnable {

    //made as int for easy understanding- should be string
    private int message;

    public MessageProcessor(int message) {
        this.message = message;
    }

    @Override
    public void run() {
        System.out.println(Thread.currentThread().getName() + "[RECEIVED] message = " + message);
        respondToMessage();//make the tread sleep to simulate doing some work
        System.out.println(Thread.currentThread().getName() + "[DONE] Processing Message = " + message);
    }

    private void respondToMessage() {
        try {
            Thread.sleep(3000);
        } catch (InterruptedException e) {
            System.out.println("unable to process message " + message);
        }

    }
}
