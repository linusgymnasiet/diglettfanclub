package car;

import javafx.scene.paint.Color;

public class CarTransport extends truck{
	
	private Loader vehicleLoader;
	
	public CarTransport(Color c, double ep, String m) {
		super(c, ep, m);
		// TODO Auto-generated constructor stub
	}

	@Override
	public double speedFactor() {
		// TODO Auto-generated method stub
		return 0;
	}
	
}
