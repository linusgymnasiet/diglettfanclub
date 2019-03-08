package car;
import javafx.scene.paint.Color;

public class fordTranzit extends car{

	private final static double trimFactor = 1.75;
	/**
	 * Creates a Ford Transit
	 */
	public fordTranzit() {
		
		super(Color.WHITE, 180, "Ford Tranzit");
		stopEngine();
	}
	
	public double speedFactor() {
		return enginePower * 0.01 * trimFactor;
	}

}
