

import static org.junit.Assert.assertThrows;
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
	@Test
	void TestNegativeValuesMaxDistance() 
	{
		// test for exceptions with negative number at init
		assertThrows(IllegalArgumentException.class, ()->
			{
				SUV henry = new SUV("",-1);
			});
		
		assertThrows(IllegalArgumentException.class, ()->
		{
			SUV henry = new SUV("",0);
		});
		
		//test for exceptions during change per method
		assertThrows(IllegalArgumentException.class, ()->{SUV heiner = new SUV("",1); heiner.setMaxDistance(-1);});
		assertThrows(IllegalArgumentException.class, ()->{SUV heiner = new SUV("",1); heiner.setMaxDistance(0);});
	}
	
	@Test
    void TestbookVehiclewithoutCustomerID() {
        assertThrows(NullPointerException.class, () -> {

            VehicleManagement management = new VehicleManagement();
            SUV vehicle = new SUV("Tiguan", 100);
            Customer costumer = new Customer(11, "Bob");
            management.bookVehicle(vehicle, null);
        });
    }

}
