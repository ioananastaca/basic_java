package car_dealership;

public class Dealership {
    public static void main(String args[]){

        Vehicle v1 = new Vehicle("Skoda", 500.3);
        Vehicle v2 = new Vehicle("Ford", 453.9);

        Customer c1 = new Customer("Pop Alex", "Str Anghel 34", 450);
        Customer c2 = new Customer("Alina Anita", "Str Sadova 34", 800.88);

        Employee e1 = new Employee();

        c1.purchaseCar(v1,e1,true);
        c1.purchaseCar(v2,e1,true);
        c1.purchaseCar(v2,e1,false);
    }
}
