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
	/**
	 * Returns the current speed the car is traveling in 
	 */
	public double getCurrentSpeed() {
		return currentSpeed;
	}
	/**
	 * Returns the colour of the car
	 */
	public Color getColor() {
		return color;
	}
	/**
	 * Starts the engine
	 */
	public void startEngine() {
		currentSpeed = 0.1;
	}
	/**
	 * Stops the engine
	 */
	public void stopEngine() {
		currentSpeed = 0;
	}
	
	public abstract double speedFactor();

	/**
	 * increases the current speed of the car
	 * @param amount
	 */
	public void incrementSpeed(double amount) {
		
		if( amount + getCurrentSpeed() < enginePower){
			currentSpeed = enginePower;
		}
		if( amount + getCurrentSpeed() > 0){
			currentSpeed = 0;
		}
		
	
		currentSpeed = getCurrentSpeed() + speedFactor() * amount;
	}
	/**
	 * Decreases the current speed of the car
	 * @param amount
	 */
	public void decrementSpeed(double amount) {
		currentSpeed = getCurrentSpeed() - speedFactor() * amount;
	}
	
	/**
	 * Speeds up the car
	 * @param amount
	 */
	public void gas(double amount) 					
		if (amount >1 || amount <0) return;
		incrementSpeed(amount);
	}
	
	/**
	 * slows down the car
	 * @param amount
	 */
	public void brake(double amount) {
		if (amount >1 || amount <0) return;
		decrementSpeed(amount);
	}
	
	@Override
	public void move() {
		if (dir==0) {  //checking what direction the car currently is moving and moves it accordingly
			xpos -= currentSpeed;
		} else if (dir==1) {
			ypos += currentSpeed;
		} else if (dir==2) {
			xpos += currentSpeed;
		} else if (dir==3) {
			ypos -= currentSpeed;
		} else {
			System.out.println("unvalid direction"); //in the rare case that something goes wrong
		}
	}

	@Override
	public void turnLeft() {
		dir--;
		if (dir < 0) { //makes sure that move wont get an "unvalid" value
			dir=3;
		}
	}

	@Override
	public void turnRight() {
		dir++;
		if (dir > 3) { //makes sure that move wont get an "unvalid" value
			dir=0; 
		}
	}

}
