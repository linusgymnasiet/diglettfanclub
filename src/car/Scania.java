package car;


import javafx.scene.paint.Color;
public abstract class Scania extends truck{

	public Scania(Color c, double ep, String m) {
		super(c, ep, m);
		// TODO Auto-generated constructor stub
	}
	
	public void move() {
		if (flat.getFlatbedAngle() == 0) {
			super.move();
		}
	}
	
}









