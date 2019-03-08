package car;

public class Flatbed {

	public static int flatbedAngle; // the angle of the flatbed
	
	public static int getFlatbedAngle(){
		return flatbedAngle;
	}
	
	public static void raiseFlatbed(int faltbedamount){
		
		if ( (getFlatbedAngle() + faltbedamount <= 70) && (getFlatbedAngle() + faltbedamount > 0)){
		
		flatbedAngle = getFlatbedAngle() + faltbedamount;
		}
	}
}
