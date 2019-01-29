import javafx.scene.paint.Color;

public class Volvo740 extends car{

	public final static double trimFactor = 1.25;

	

	public Volvo740() {
		color = Color.RED;
		enginePower = 100;
		modelName = "Volvo740";
		stopEngine();
	}

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

	public double speedFactor() {
		return enginePower * 0.01 * trimFactor;
	}

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
}
