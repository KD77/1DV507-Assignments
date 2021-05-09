package kd222gb_assig_1.ferry;

public class lorries extends Vehicle {
	private String vehicleType="Lorry";
	private int numOfpassengers=2;
	private int vehiclePayment=300;
	
 public lorries() {
	 
 }
	
public lorries(String vehicleType, int numOfPassengers, int vehiclePayment) {
		super(vehicleType, numOfPassengers, vehiclePayment);
		this.vehicleType=vehicleType;
		this.numOfpassengers=numOfPassengers;
		this.vehiclePayment=vehiclePayment;
	}

	
	public String getVehicleType() {
		return vehicleType;
	}

	public void setVehicleType(String  vehicleType) {
		this.vehicleType = vehicleType;
	}

	public int getNumOfpassengers() {
		return numOfpassengers;
	}

	public void setNumOfpassengers(int numOfpassengers) {
		this.numOfpassengers = numOfpassengers;
	}

	public int getVehiclePayment() {
		return vehiclePayment;
	}

	public void setVehiclePayment(int vehiclePayment) {
		this.vehiclePayment = vehiclePayment;
	}

	
}
