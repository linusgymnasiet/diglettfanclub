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
	public void move() {
		super.move();
		vehicleLoader.updatePosition(this.getX(), this.getY());
	}
	
	@Override
	public double speedFactor() {
		return getEnginePower() * 0.002;
	}
	
	
	public void unloadOne() {
		vehicleLoader.unloadFirstVehicle();
	}
	
	public void unloadAll() {
		for(int i = 0 ; i < vehicleLoader.vehicles.size() ; i++ ) {
			vehicleLoader.unloadFirstVehicle();
		}
	}
	
}