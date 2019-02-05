import javafx.scene.paint.Color;

public abstract class car implements Movable {

	public double enginePower; // Engine power of the car
	public double currentSpeed; // The current speed of the car
	public Color color; // Color of the car
	public String modelName; // The car model name
	public double xpos;
	public double ypos;
	public int dir;

	public double getEnginePower() {
		return enginePower;
	}

	public double getCurrentSpeed() {
		return currentSpeed;
	}

	public Color getColor() {
		return color;
	}

	public void startEngine() {
		currentSpeed = 0.1;
	}

	public void stopEngine() {
		currentSpeed = 0;
	}

	public abstract double speedFactor();

	public void incrementSpeed(double amount) {
		currentSpeed = getCurrentSpeed() + speedFactor() * amount;
	}

	public void decrementSpeed(double amount) {
		currentSpeed = getCurrentSpeed() - speedFactor() * amount;
	}

	public void gas(double amount) {
		incrementSpeed(amount);
	}

	public void brake(double amount) {
		decrementSpeed(amount);
	}

	@Override
	public void move() {
		// TODO Auto-generated method stub

	}

	@Override
	public void turnLeft() {
		dir--;
	}

	@Override
	public void turnRight() {
		dir++;
	}

}
