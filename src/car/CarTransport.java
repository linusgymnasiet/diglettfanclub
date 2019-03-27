package car;

import javafx.scene.paint.Color;

public class CarTransport extends truck{
	
	private Loader vehicleLoader;
	
	public CarTransport(Color c, double ep, String m) {
		super(Color.RED, 200, "Car Transport");
		// TODO Auto-generated constructor stub
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
		// TODO Auto-generated method stub
		return enginePower*0.01;
	}
	
	public void unloadOne() {
		vehicleLoader.unloadLastVehicle();
	}
	
	public void unloadAll() {
		for(int i = 0 ; i < vehicleLoader.vehicles.size() ; i++ ) {
			vehicleLoader.unloadLastVehicle();
		}
	}
	
}
