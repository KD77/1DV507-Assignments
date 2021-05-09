package kd222gb_assig_1.ferry;

import java.util.Iterator;

public class Passenger{
	 private int numberOfPassengers=1;
	 private String name;
	 private int passengerCost=25;
	 
	 
	 public Passenger ()  {
		
	}

	 public Passenger(String name) {
		 this.name=name;
		
		 
	
	}

	public int getNumberOfPassengers() {
		return numberOfPassengers;
	}

	public void setNumberOfPassengers(int numberOfPassengers) {
		this.numberOfPassengers = numberOfPassengers;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}
	public String toString() {
		return  "Name "+ name+" number of passengers "+ numberOfPassengers;
	}

	

	
	
	
}
