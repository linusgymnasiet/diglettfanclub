package car;

import java.util.ArrayList;

public class Loader {
	
	ArrayList<Vehicle> vehicles = new ArrayList<Vehicle>();
	
	/*unloadVechicle2 = sista bilen
	 * unloadVehicle1 = första bilen
	 */
	
	
	public void load(Vehicle v) {
		vehicles.add(v);
	}
		
	public Vehicle unloadLastVehicle() {
		Vehicle v = vehicles.get(vehicles.size()-1);
		vehicles.remove(v);
		return v;
	}
	
	public Vehicle unloadFirstVehicle() {
		Vehicle v = vehicles.get(0);
		vehicles.remove(v);
		return v;
	}
	
	public void position(double x, double y) {
		for (Vehicle vehicle : vehicles) {
			vehicle.setX(x);
			vehicle.setY(y);
		}
	}
}