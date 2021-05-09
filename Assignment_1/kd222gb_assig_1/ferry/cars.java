package kd222gb_assig_1.ferry;

public class cars extends Vehicle  {
	private String vehicleType= "Car";
	private int vehiclePayment=100;
	private int numOfPassengers=4;
	private int ParkingSpace=5;
	public cars() {
		
	}
public cars(String vehicleType, int numOfPassengers, int vehiclePayment) {
		super(vehicleType, numOfPassengers, vehiclePayment);
		this.vehicleType=vehicleType;
		this.numOfPassengers=numOfPassengers;
		this.vehiclePayment=numOfPassengers;
	}

	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	} 

	public int getVehiclePayment() {
		return vehiclePayment;
	}

	public void setVehiclePayment(int vehiclePayment) {
		this.vehiclePayment = vehiclePayment;
	}

	public int getNumfPassengers() {
		return numOfPassengers;
	}

	public void setNumfPassengers(int numfPassengers) {
		this.numOfPassengers = numfPassengers;
	}

	
}
