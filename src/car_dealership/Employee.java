package car_dealership;

public class Employee {
    public void handleCustomer(Customer customer, boolean finance, Vehicle vehicle) {
        if (finance == true) {
            double loanAmount = vehicle.getPrice() - customer.getCashOnHnad();
            runCreditHistory(customer, loanAmount);
        } else if (vehicle.getPrice() <= customer.getCashOnHnad()) {
            processTransaction(customer, vehicle);
        }else {
            System.out.println("Customer will need more money to purchase vehicle: " + vehicle);
        }
    }

    public void runCreditHistory(Customer customer, double loadAmount) {
        System.out.println("Ran credit history for Customer");
        System.out.println("Purchase approved!");

    }

    public void processTransaction(Customer customer, Vehicle vehicle) {
        System.out.println("Customer has purchased the vehicle " + vehicle.getBrand() + " for the price " + vehicle.getPrice());
    }
}
