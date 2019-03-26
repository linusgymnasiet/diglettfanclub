package car;

import javafx.scene.paint.Color;

public class Ferry extends Vehicle {

	private Loader vehicleLoader;

	public Ferry() {
		super(Color.WHITE, 500, "Stena Line");
		vehicleLoader = new Loader();
	}

	public void loadVehicle(Vehicle v) {
		vehicleLoader.load(v);
	}
	
	
	
	@Override
	public double speedFactor() {
		return getEnginePower() * 0.002;
	}

}