package concurrency.threadsafety_collection;

public class Application {
    public static void main(String[] args) throws InterruptedException {
        InventoryManager manager = new InventoryManager();
        //start running 2 threads that access the same list from InventoryManager
        Thread inventoryTask = new Thread(new Runnable() {
            @Override
            public void run() {
                manager.populateSoldProducts();
            }
        });
        Thread dispalyTask = new Thread(new Runnable() {
            @Override
            public void run() {
                manager.displaySoldProducts();
            }
        });

        inventoryTask.start();
        //join the main thread
//        inventoryTask.join();
        Thread.sleep(200);
        dispalyTask.start();
    }
}
