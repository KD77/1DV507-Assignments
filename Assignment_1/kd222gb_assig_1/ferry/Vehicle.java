package kd222gb_assig_1.ferry;

import java.util.ArrayList;
import java.util.Iterator;

public class Vehicle  {
	private int numOfPassengers;
	private int vehiclePayment;
	private String vehicleType;
	private int vehicleSize=1;
	ArrayList<Passenger>passOnVehicle=new ArrayList<Passenger>();
	
	
	public Vehicle() {
		
	}
	public  Vehicle(String vehicleType,int numOfPassengers,int vehiclePayment) {
		this.numOfPassengers=numOfPassengers;
		this.vehiclePayment=vehiclePayment;
		this.vehicleType=vehicleType;
		
		
	}


	
	public int getNumOfPassengers() {
		return numOfPassengers;
	}

	public void setNumOfPassengers(int numOfPassengers) {
		this.numOfPassengers = numOfPassengers;
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

	public int getVehicleSize() {
		return vehicleSize;
	}

	public void setVehicleSize(int vehicleSize) {
		this.vehicleSize = vehicleSize;
	}
	public void omboad(Vehicle vehicle,  Passenger person ) {
		if (person !=null ) {
			passOnVehicle.add(person);
			vehicle.numOfPassengers=vehicle.numOfPassengers + vehicle.getNumOfPassengers();
			
		}
		else {
			vehicle.numOfPassengers=vehicle.numOfPassengers + 0;
			
		}
	}

	
}