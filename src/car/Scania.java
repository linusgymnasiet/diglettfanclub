package car;


import javafx.scene.paint.Color;
public class Scania extends truck{

	public Scania() {
		super(Color.BLUE, 200, "Scania");
		// TODO Auto-generated constructor stub
	}

	@Override
	public double speedFactor() {
		return enginePower * 0.05;
	}

	
	
	
}









