package car;
import javafx.scene.paint.Color;

public class Saab95 extends car{

	private boolean turboOn;
	/**
	 * Creates a saab95
	 */
	public Saab95() {
		super(Color.BLACK, 125, "Saab95");
		turboOn = false;
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
		double turbo = 2;
		if (turboOn)
			turbo = 1.3;
		return enginePower * 0.01 * turbo;
	}

	


	
}
