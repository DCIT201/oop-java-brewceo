// RentalAgency.java
public class RentalAgency {
    public void processRental(Rentable vehicle, Customer customer, int days) {
        vehicle.rent(customer, days);
    }

    public void processReturn(Rentable vehicle) {
        vehicle.returnVehicle();
    }
}
