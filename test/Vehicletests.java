

import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.Test;

import vehicleBooking.*;

class Vehicletests {

	@Test
	void TestbookingUnavailableVehicle() {
		VehicleManagement management = new VehicleManagement();
		SUV vehicle = new SUV("x3", 100);
		Customer costumer = new Customer(12,"Henry");
		
		management.addVehicle(vehicle);
		
		vehicle.setAvailable(false);
		assertFalse(vehicle.isAvailable());
		
		assertFalse(management.bookVehicle(vehicle,costumer));
	}

}
