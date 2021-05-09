package kd222gb_assig_1.ferry;

import java.util.Iterator;

public class FerryMain {

	public static void main(String[] args) {
		Ferry myFerry = new ferryClass();

		Vehicle car = new cars();

		for (int i = 0; i < 4; i++) {
			myFerry.embark(car);

		}
		System.out.println("vehicle space " + myFerry.countVehicleSpace());
		Passenger person = new Passenger();
		for (int i = 0; i < 10; i++) {
			myFerry.embark(person);
		}

		System.out.println("passengers " + myFerry.countPassengers());
		System.out.println("disembark ");
		myFerry.disembark();
		System.out.println("passengers " + myFerry.countPassengers());

		Passenger p1 = new Passenger("Ania");
		Passenger p2 = new Passenger("Obsa");
		Passenger p3 = new Passenger("Sahra");
		Passenger p4 = new Passenger("Ibro");
		Passenger p5 = new Passenger("kalid");
		myFerry.embark(p1);
		myFerry.embark(p2);
		myFerry.embark(p3);
		myFerry.embark(p4);

		System.out.print("number of passengers " + myFerry.countPassengers());
		System.out.println();

		for (int i = 0; i < 5; i++) {
			myFerry.embark(p1);

		}

		System.out.print("number of passengers " + myFerry.countPassengers());
		System.out.println();
		System.out.println(myFerry.hasRoomFor(p4));
		System.out.println(p1.getName());

		for (int i = 0; i < 4; i++) {
			car = new cars();
			car.omboad(car, p3);
		}
		System.out.println("money " + myFerry.countMoney());
		System.out.println("Vehicle space " + myFerry.countVehicleSpace());

	}

}
