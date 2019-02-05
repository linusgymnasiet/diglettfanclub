import javafx.scene.paint.Color;

public abstract class car implements Movable {

	public double enginePower; // Engine power of the car
	public double currentSpeed; // The current speed of the car
	public Color color; // Color of the car
	public String modelName; // The car model name
	public double xpos;
	public double ypos;
	public int dir = 0; //0=up 1=right 2=down 3=left

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
		if (dir==0) {
			xpos -= currentSpeed;
		} else if (dir==1) {
			ypos += currentSpeed;
		} else if (dir==2) {
			xpos += currentSpeed;
		} else if (dir==3) {
			ypos -= currentSpeed;
		} else {
			System.out.println("unvalid direction");
		}
	}

	@Override
	public void turnLeft() {
		dir--;
		if (dir < 0) {
			dir=3;
		}
	}

	@Override
	public void turnRight() {
		dir++;
		if (dir > 3) {
			dir=0;
		}
	}

}
