package car;
import javafx.scene.paint.Color;

public class VolkswagenGolf extends car{

	private final static double trimFactor = 1.25;
	/**
	 * Creates a Volkswagen Golf
	 */
	public VolkswagenGolf() {
		super(Color.BLACK, 100, "VolkswagenGolf");

		stopEngine();
	}
	
	public double speedFactor() {
		return enginePower * 0.01 * trimFactor;
	}

}
