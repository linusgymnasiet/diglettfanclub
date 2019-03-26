package car;

public class Flatbed {

	public static int flatbedAngle; // the angle of the flatbed
	
	public int getFlatbedAngle(){
		return flatbedAngle;
	}
	
	public static void raiseFlatbed(int faltbedamount, Flatbed flat){
		
		if ( (flat.getFlatbedAngle() + faltbedamount <= 70) && (flat.getFlatbedAngle() + faltbedamount > 0)){
		
		flatbedAngle = flat.getFlatbedAngle() + faltbedamount;
		}
	}
}
