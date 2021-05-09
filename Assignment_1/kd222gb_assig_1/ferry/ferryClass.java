package kd222gb_assig_1.ferry;

import java.util.ArrayList;
import kd222gb_assig_1.ferry.Vehicle;
import java.util.Iterator;

public class ferryClass implements Ferry {
	ArrayList<Vehicle>parking=new ArrayList<>();
	ArrayList<Passenger> passenges=new ArrayList<>();
	
	private  int MaxPassengers=400;
	private int MaxParkingSpace=200;
    private int money;
    private int numofCycles ;
    private int cycleSpace=0; 
    private int numOfSpaces;
    private int numOfpassenger;
    private int passengerCost=20;
    
	@Override
	public int countPassengers() {
		
		return numOfpassenger;
	}

	@Override
	public int countVehicleSpace() {
		
		return numOfSpaces;
	}

	@Override
	public int countMoney() {
		
		return money;
	}

	@Override
	public Iterator<Vehicle> iterator() {
		
		return new vehIterartor();
	}

	@Override
	public void embark(Vehicle v) {
		if(hasSpaceFor(v)==true ) {
			numOfpassenger=numOfpassenger+v.getNumOfPassengers() ;
			money=money+v.getNumOfPassengers()*v.getVehiclePayment();
			numOfSpaces=numOfSpaces+v.getVehicleSize();
		
			parking.add(v);
			if(isCycle(v)==true) {
				numofCycles++;}
				else if(numofCycles==5) {
					numofCycles=0;
					cycleSpace=0;
				}
			
		}
		else {
			System.out.println("The Ferry is full");
		
	}
	}

	@Override
	public void embark(Passenger p) {
		if(hasRoomFor(p)==true && numOfpassenger+p.getNumberOfPassengers()<=MaxPassengers  ) {
			money=money+p.getNumberOfPassengers()*passengerCost;
			numOfpassenger=numOfpassenger+p.getNumberOfPassengers();
			passenges.add(p);
			
		}
		else {
			System.out.println("The Ferry is full , no more passengers ");
		}
		
		
	}

	@Override
	public void disembark() {
		passenges.removeAll(passenges);
		parking.removeAll(parking);
		numofCycles=0;
		numOfpassenger=0;
		money=0;
		
		
		
		
	}
	private boolean isCycle(Vehicle v) {
		return v.getVehicleSize()==1;
	}

	@Override
	public boolean hasSpaceFor(Vehicle v) {
		if(countVehicleSpace()+v.getVehicleSize()==MaxParkingSpace)
	
		return false ;
		
	   else 
	      return true;
		}
	

	@Override
	public boolean hasRoomFor(Passenger p) {
		if (countPassengers()+p.getNumberOfPassengers()==MaxPassengers)
		return false;
		else 
			return true;
	}
	
	
	class vehIterartor implements Iterator<Vehicle> {
         private int count=0;
         @Override
 		public Vehicle next() {
 			
 			return parking.get(count++);
 		}
 		
		@Override
		public boolean hasNext() {
			
			return count< parking.size();
		}

		
		
	}

}

