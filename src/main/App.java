package main;

import controller.CarController;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.layout.BorderPane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;
import car.Saab95;
import car.Vehicle;
import car.Volvo740;
import view.ButtonBox;
import view.CarPane;

public class App extends Application {

	public final static double WIDTH = 1200;
	public final static double HEIGHT = 700;

	@Override
	public void start(Stage primaryStage) throws Exception {

		CarPane cp = new CarPane();

		CarController cc = new CarController(cp);

		Vehicle model = new Volvo740();
		cc.addVehicle(model);

		Vehicle modelsaab = new Saab95();
		modelsaab.setY(60);
		cc.addVehicle(modelsaab);
		
		
		ButtonBox cbp = new ButtonBox(cc);

		BorderPane root = new BorderPane();

		root.setTop(cp);
		root.setBottom(cbp);

		Scene scene = new Scene(root, WIDTH, HEIGHT, Color.SKYBLUE);
		primaryStage.setScene(scene);
		primaryStage.setTitle("Car Simulator");
		primaryStage.show();

	}

	public static void main(String[] args) {
		launch();
	}
	

}
