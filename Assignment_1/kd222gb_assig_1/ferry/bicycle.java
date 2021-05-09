package kd222gb_assig_1.ferry;

public class bicycle extends Vehicle{
	private int ParkingSpace=1;
	private int vehiclePayment=20;
	private String vehicleType="Bicycle";
	private int numOfPassengers=1;
	
public bicycle() {
	
}
	public bicycle(String vehicleType, int numOfPassengers, int vehiclePayment) {
		super(vehicleType, numOfPassengers, vehiclePayment);
		
		
	}


	public int getParkingSpace() {
		return ParkingSpace;
	}


	public void setParkingSpace(int parkingSpace) {
		ParkingSpace = parkingSpace;
	}


	public int getVehiclePayment() {
		return vehiclePayment;
	}


	public void setVehiclePayment(int vehiclePayment) {
		this.vehiclePayment = vehiclePayment;
	}


	public String getVehicleType() {
		return vehicleType;
	}


	public void setVehicleType(String vehicleType) {
		this.vehicleType = vehicleType;
	}


	public int getNumOfPassengers() {
		return numOfPassengers;
	}


	public void setNumOfPassengers(int numOfPassengers) {
		this.numOfPassengers = numOfPassengers;
	}



	}
