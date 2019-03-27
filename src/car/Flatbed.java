package car;

public class Flatbed {

	public static int flatbedAngle; // the angle of the flatbed
	
	public int getFlatbedAngle(){
		return flatbedAngle;
	}
	
	public void raiseFlatbed(int faltbedamount, Flatbed flat){	
		if ( (flat.getFlatbedAngle() + faltbedamount <= 70) && (flat.getFlatbedAngle() + faltbedamount > 0)){
		flatbedAngle = flat.getFlatbedAngle() + faltbedamount;
		}
	}
	
	public void lowerFlatbed(int amount, Flatbed flat) {
		if ( (flatbedAngle - amount >= 70) && (flatbedAngle - amount < 0)){
			flatbedAngle = flat.getFlatbedAngle() + amount;
			}
	}
	
}
