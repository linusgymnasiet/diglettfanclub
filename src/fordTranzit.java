import javafx.scene.paint.Color;

public class fordTranzit extends car{

	private final static double trimFactor = 1.25;
	/**
	 * Creates a Ford Tranzit
	 */
	public fordTranzit() {
		color = Color.RED;
		enginePower = 100;
		modelName = "Ford Tranzit";
		stopEngine();
	}
	
	public double speedFactor() {
		return enginePower * 0.01 * trimFactor;
	}

}
