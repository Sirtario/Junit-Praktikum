package vehicleBooking;

import static org.junit.jupiter.api.Assertions.*;
import org.junit.Test;
import org.junit.Assert;

import org.junit.jupiter.api.Test;

public class Vehicletests {
	
	@Test
	public void test()
	 {
	  Boat boat = new Boat(null, 0);
	  assertTrue(boat.isAvailable()==false);
	 }

	@Test
	public void vehicleBaseTest()
	{
		VehicleManagement vehicleManagement = new VehicleManagement();
		Customer customer = new Customer(51, "Peter");
		assertTrue(vehicleManagement.bookVehicle(null, customer)==false);
	}
	
}
