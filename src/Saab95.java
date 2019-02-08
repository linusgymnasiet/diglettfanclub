import javafx.scene.paint.Color;

public class Saab95 extends car{

	private boolean turboOn;
	/**
	 * Creates a saab95
	 */
	public Saab95() {
		color = Color.BLACK;
		enginePower = 125;
		turboOn = false;
		modelName = "Saab95";
		stopEngine();
	}
	/**
	 * urns on the turbo
	 */
	public void setTurboOn() {
		turboOn = true;
	}
	/**
	 * Turns off the turbo
	 */
	public void setTurboOff() {
		turboOn = false;
	}

	public double speedFactor() {
		double turbo = 1;
		if (turboOn)
			turbo = 1.3;
		return enginePower * 0.01 * turbo;
	}

	


	
}
