package vehicleBooking;

public abstract class VehicleBase implements Vehicle {
	private int maxDistance;
	private boolean available = true;
	private String name;
	private OperatingEnvironment environment;

	public VehicleBase(String name, int distance, OperatingEnvironment environment) {
		super();
		this.name = name;
		this.environment = environment;
		
		setMaxDistance(distance);		
	}

	public OperatingEnvironment getOperatingEnvironment() {
		return environment;
	}

	public void setOperatingEnvironment(OperatingEnvironment environment) {
		if (!this.environment.equals(environment)) {
			this.environment = environment;
		}
	}

	public boolean isAvailable() {
		return available;
	}

	public void setAvailable(boolean available) {
		if (this.available != available) {
			this.available = available;
		}
	}

	public int getMaxDistance() {
		return maxDistance;
	}

	public void setMaxDistance(int distance) throws IllegalArgumentException
	{
		if(distance <= 0) 
		{
			throw new IllegalArgumentException("distance cannot be 0 or negative");
		}
		
		if (this.maxDistance != distance) {
			this.maxDistance = distance;
		}
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (!this.name.equals(name)) {
			this.name = name;
		}
	}

	public boolean canOperateOn(OperatingEnvironment environment) {
		if (environment == this.environment) {
			return true;
		}
		return false;
	}

	public void book() {
		setAvailable(false);
	}
}
