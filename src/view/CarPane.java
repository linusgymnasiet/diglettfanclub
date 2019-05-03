package view;

import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.Pane;

public class CarPane extends Pane {

	private ImageView scaniaImage;
	private ImageView saabImage;
	private ImageView volvoImage;
	private double volvoXPos, saabXPos, scaniaXPos;
	private double volvoYPos, saabYPos , scaniaYPos;

	public CarPane() {
		volvoImage = new ImageView(new Image("/pics/Volvo740.jpg"));
		this.getChildren().add(volvoImage);
		saabImage = new ImageView(new Image("/pics/Saab95.jpg"));
		this.getChildren().add(saabImage);
		scaniaImage = new ImageView(new Image("/pics/Scania.jpg"));
		this.getChildren().add(scaniaImage);
	}

	public void move(double x, double y, String model) {

		if(model == "Volvo740") {
		volvoXPos = x;
		volvoYPos = y;
		} else if (model == "Saab95") {
		saabXPos = x;
		saabYPos = y;
		}
		 else if (model == "Scania") {
				scaniaXPos = x;
				scaniaYPos = y;
				}
	}

	public void update() {
		volvoImage.setX(volvoXPos);
		volvoImage.setTranslateY(volvoYPos);
		saabImage.setX(saabXPos);
		saabImage.setTranslateY(saabYPos);
		scaniaImage.setX(scaniaXPos);
		scaniaImage.setTranslateY(scaniaYPos);
		
	}

}
