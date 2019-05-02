package controller;

import javafx.animation.AnimationTimer;
import main.App;

import java.util.ArrayList;

import car.Vehicle; //förvänade sig att hitta Vehicle i mappen model men den var i mappen car
import view.CarPane;

public class CarController {

	private ArrayList<Vehicle> models = new ArrayList<Vehicle>();

	public CarController(CarPane cp) { // dim 100x60
		AnimationTimer at = new AnimationTimer() {
			@Override
			public void handle(long now) {
				for (Vehicle vehicle : models) {

					if (vehicle.getX() > App.WIDTH - 100 || vehicle.getX() < 0) {
						vehicle.turnLeft();
						vehicle.turnLeft();
						vehicle.move();
						vehicle.stopEngine();
					}

					if (vehicle != null) {
						vehicle.move();
						cp.move(vehicle.getX(), vehicle.getY(),vehicle.getModelName());
						cp.update();
					}
				}

			}

		};
		at.start();
	}

	public void addVehicle(Vehicle v) {
		models.add(v);
	}

	public void gas(double amount) {
		for (Vehicle vehicle : models) {
			vehicle.gas(amount);
			System.out.println(vehicle.getClass().getSimpleName() + " GAS");
		}
	}

	public void brake(double amount) {
		for (Vehicle vehicle : models) {
			vehicle.brake(amount);

		}
	}

	public Vehicle getVehicle(int i) {
		return models.get(i);
	}

}
