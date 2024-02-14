package concurrency.threadsafety_collection;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

public class InventoryManager {
    List<Product> soldPRoductList = new CopyOnWriteArrayList<>();
    List<Product> purchaseProductsList = new CopyOnWriteArrayList<>();

    public void populateSoldProducts() {
        for (int i = 1; i < 100; i++) {
            Product product = new Product(i, "test_product_" + i);
            soldPRoductList.add(product);
            System.out.println("ADDED: " + product);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }

    public void displaySoldProducts(){
        for(Product product:soldPRoductList){
            System.out.println("Printing the sold prod: "+product);
            try {
                Thread.sleep(10);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
        }
    }
}
