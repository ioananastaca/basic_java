package lambda_practice.lambda_practical;

import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class App {
    public static void main(String[] args) {
        List<Car> cars = Arrays.asList(
                new Car("Honda", "Accord", "Red", 22300),
                new Car("Honda", "Civic", "Blue", 17700),
                new Car("Toyota", "Land Cruiser", "White", 48500),
                new Car("Toyota", "Corolla", "Black", 16200),
                new Car("Toyota", "Camry", "Blue", 24000),
                new Car("Nissan", "Sentra", "White", 17300),
                new Car("Mitsubishi", "Lancer", "White", 20000),
                new Car("Jeep", "Wrangler", "Red", 24500)
        );

//        printCarByColor(cars,"Red");
//        printCarsPriceRange(cars,18000,20000);

        printCars(cars, new Predicate<Car>() {
            @Override
            public boolean test(Car c) {
                return c.getColor() == "Red";
            }
        });
        printCars(cars, new Predicate<Car>() {
            @Override
            public boolean test(Car c) {
                return c.getPrice() >= 18000 && c.getPrice() <= 22000;
            }
        });

        //more fancy way
        printCars(cars, (c) -> c.getPrice() >= 18000 && c.getPrice() <= 22000);
        printCars(cars, (c) -> c.getColor().equals("Blue"));

    }

    //this method can be used instead of the other 2 for printing cars based on different conditions
    public static void printCars(List<Car> cars, Predicate<Car>predicate) {
        for (Car c : cars) {
            if (predicate.test(c)) {
                c.printCar();
            }
        }
    }

    public static void printCarsPriceRange(List<Car> cars, int low, int high) {
        for (Car c : cars) {
            if (low <= c.getPrice() && c.getPrice() <= high) {
                c.printCar();
            }
        }
    }


    public static void printCarByColor(List<Car> cars, String color) {
        for (Car c : cars) {
            if (c.getColor().equals(color)) {
                c.printCar();
            }
        }
    }
}
