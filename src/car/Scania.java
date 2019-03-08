package car;


import javafx.scene.paint.Color;
public class Scania extends truck{
	
		private final static double trimFactor = 1.25;
	/**
	 * Creates a Scania
	 */
	public Scania() {
		color = Color.BLACK;
		enginePower = 100;
		modelName = "Scania";
		stopEngine();
	}
	
	public double speedFactor() {
		return enginePower * 0.01 * trimFactor;
	}
	
}









