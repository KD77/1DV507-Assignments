package kd222gb_assig_1.ferry;

public class busses extends Vehicle {
	
	private int ParkingSpace=20;
	private int vehiclePayment=15;
	private String vehicleType="Buss";
	private int numOfPassengers=20;
	public busses() {
		
	}
public busses(String vehicleType, int numOfPassengers, int vehiclePayment) {
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
