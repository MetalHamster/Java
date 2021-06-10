package oop.vehicle;

public class Car extends Landcraft {
	int numberOfWheels;
	String name;

	Car(int numberOfWheels, String name) {
		this.numberOfWheels = numberOfWheels;
		this.name = name;
	}

	@Override
	public void accelaration() {

	}

	public String getName() {
		return name;
	}
}
