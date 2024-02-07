package collection;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Application1 {
    public static void main(String[] args) {
        ArrayList<String> words = new ArrayList<>();
        words.add("ioana");
        words.add("flm");

        String item2 = words.get(1);
        System.out.println(item2);

        for (String i : words) {
            System.out.println(i);
        }

        ArrayList<String> animals = new ArrayList<>();
        animals.add("cat");
        animals.add("dog");
        animals.add("bird");

        LinkedList<Vehicle> vehicles = new LinkedList<>();
        vehicles.add(new Vehicle("ford", 300, 1000.99));
        printElements(vehicles);
    }

    public static void printElements(List list) {
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
