package car_dealership;

public class Customer {
    private String name;
    private String adress;
    private double cashOnHnad;

    public Customer(String name, String adress, double cashOnHnad) {
        this.name = name;
        this.adress = adress;
        this.cashOnHnad = cashOnHnad;
    }

    public double getCashOnHnad() {
        return cashOnHnad;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAdress() {
        return adress;
    }

    public void setAdress(String adress) {
        this.adress = adress + "DealearShip City";
    }

    public void setCashOnHnad(double cashOnHnad) {
        this.cashOnHnad = cashOnHnad;
    }

    public void purchaseCar(Vehicle vehicle, Employee emp, boolean finance) {
            emp.handleCustomer(this, finance, vehicle);
    }
}
