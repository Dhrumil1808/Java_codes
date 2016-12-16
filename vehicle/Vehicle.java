package vehicle;

public abstract class Vehicle {
	protected double weightInKg;
	protected double speedInKmPerHr = 0;			// a new vehicle should stop after it rolls off the assembly line
	protected Direction direction = new Direction(); // avoid null pointer exceptions by giving new vehicle the default direction 0, 0, 0

	public Vehicle() {
	}

	public Vehicle(double weightInKgIn) {
		weightInKg = weightInKgIn;		
	}

	public abstract void steer(double bearing, double z);

	public abstract void accelerate(double speedIncrement);

	public String toString() {
		return "vehicle weighs " + weightInKg + " kg: is going "
				+ speedInKmPerHr + ": " + direction.toString();
	}

}

