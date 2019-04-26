package controller;

import javafx.animation.AnimationTimer;
import main.App;

import java.util.ArrayList;

import car.Vehicle; //förvänade sig att hitta Vehicle i mappen model men den var i mappen car
import view.CarPane;

public class CarController {
	
	private ArrayList<Vehicle> models = new ArrayList<Vehicle>();
	
	private Vehicle model;

	public CarController(CarPane cp) { //dim 100x60
		AnimationTimer at = new AnimationTimer() {
			@Override
			public void handle(long now) {
				if(model.getX() > App.WIDTH - 100 || model.getX() < 0) {
					model.turnLeft();
					model.turnLeft();
					model.move();
					model.stopEngine();
				}
				
				if (model != null) {
					model.move();
					cp.move(model.getX(), model.getY());
					cp.update();
				}
				
				
				
				
			}
			
			
		};
		at.start();
	}

	public void setModel(Vehicle v) {	
		model = v;
	}

	public void gas(double amount) {
		model.gas(amount);
	}
	
	public void brake(double amount) {
		model.brake(amount);
	}
	
	public void addVehicle(Vehicle mod) {
		models.add(mod);
	}
	
	public Vehicle getVehicle(int i) {
		return models.get(i);
	}

}
