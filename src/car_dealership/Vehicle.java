package car_dealership;

import java.util.Objects;

public class Vehicle {
    private String brand;
    private double price;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Vehicle vehicle)) return false;
        return Double.compare(getPrice(), vehicle.getPrice()) == 0 && Objects.equals(getBrand(), vehicle.getBrand());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getBrand(), getPrice());
    }

    public Vehicle(String brand, double price) {
        this.brand = brand;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Vehicle{" +
                "brand='" + brand + '\'' +
                ", price=" + price +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}
