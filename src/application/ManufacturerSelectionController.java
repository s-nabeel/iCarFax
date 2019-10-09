package application;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;

public class ManufacturerSelectionController {

	@FXML
	private Button _buttonInfiniti;
	@FXML
	private Button _buttonPorsche;
	@FXML
	private Button _buttonAudi;
	@FXML
	private Button _buttonRange;
	@FXML
	private Button _buttonBenz;
	@FXML
	private Button _buttonBMW;

	@FXML
	private void initialize() {
		_buttonInfiniti.setOnAction(e -> onInfinitiClicked(e));
		_buttonPorsche.setOnAction(e -> onPorscheClicked(e));
		_buttonAudi.setOnAction(e -> onAudiClicked(e));
		_buttonRange.setOnAction(e -> onRangeClicked(e));
		_buttonBenz.setOnAction(e -> onBenzClicked(e));
		_buttonBMW.setOnAction(e -> onBMWClicked(e));
	}

	private void onInfinitiClicked(ActionEvent e) {

		try {

			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Database.fxml"));
			AnchorPane root = fxmlLoader.load();
			fxmlLoader.getController();
			DatabaseController controller = fxmlLoader.getController();
			controller.infinitiDatabase();
			Scene scene = new Scene(root, 821, 682);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			Stage secondStage = new Stage();
			secondStage.setScene(scene);
			secondStage.setTitle("iCarFax: Infiniti's Database");
			secondStage.initModality(Modality.APPLICATION_MODAL);
			secondStage.showAndWait();
		} catch (Exception e1) {
			e1.printStackTrace();
			return;
		}
	}

	private void onPorscheClicked(ActionEvent e) {

		System.out.println("Porsche Clicked");

		try {

			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Database.fxml"));
			AnchorPane root = fxmlLoader.load();
			fxmlLoader.getController();
			DatabaseController controller = fxmlLoader.getController();
			controller.porscheDatabase();
			Scene scene = new Scene(root, 821, 682);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			Stage secondStage = new Stage();
			secondStage.setScene(scene);
			secondStage.setTitle("iCarFax: Porsche's Database");
			secondStage.initModality(Modality.APPLICATION_MODAL);
			secondStage.showAndWait();
		} catch (Exception e1) {
			e1.printStackTrace();
			return;
		}
	}

	private void onAudiClicked(ActionEvent e) {

		System.out.println("Audi Clicked");

		try {

			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Database.fxml"));
			AnchorPane root = fxmlLoader.load();
			fxmlLoader.getController();
			DatabaseController controller = fxmlLoader.getController();
			controller.audiDatabase();
			Scene scene = new Scene(root, 821, 682);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			Stage secondStage = new Stage();
			secondStage.setScene(scene);
			secondStage.setTitle("iCarFax: Audi's Database");
			secondStage.initModality(Modality.APPLICATION_MODAL);
			secondStage.showAndWait();
		} catch (Exception e1) {
			e1.printStackTrace();
			return;
		}
	}

	private void onRangeClicked(ActionEvent e) {

		System.out.println("Range Rover Clicked");

		try {
			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Database.fxml"));
			AnchorPane root = fxmlLoader.load();
			fxmlLoader.getController();
			DatabaseController controller = fxmlLoader.getController();
			controller.rangeDatabase();
			Scene scene = new Scene(root, 821, 682);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			Stage secondStage = new Stage();
			secondStage.setScene(scene);
			secondStage.setTitle("iCarFax: Range Rover's Database");
			secondStage.initModality(Modality.APPLICATION_MODAL);
			secondStage.showAndWait();
		} catch (Exception e1) {
			e1.printStackTrace();
			return;
		}
	}

	private void onBenzClicked(ActionEvent e) {

		System.out.println("Mercedes Benz Clicked");

		try {

			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Database.fxml"));
			AnchorPane root = fxmlLoader.load();
			fxmlLoader.getController();
			DatabaseController controller = fxmlLoader.getController();
			controller.benzDatabase();
			Scene scene = new Scene(root, 821, 682);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			Stage secondStage = new Stage();
			secondStage.setScene(scene);
			secondStage.setTitle("iCarFax: Mercedes Benz' Database");
			secondStage.initModality(Modality.APPLICATION_MODAL);
			secondStage.showAndWait();
		} catch (Exception e1) {
			e1.printStackTrace();
			return;
		}
	}

	private void onBMWClicked(ActionEvent e) {

		System.out.println("BMW Clicked");

		try {

			FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("Database.fxml"));
			AnchorPane root = fxmlLoader.load();
			fxmlLoader.getController();
			DatabaseController controller = fxmlLoader.getController();
			controller.bmwDatabase();
			Scene scene = new Scene(root, 821, 682);
			scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
			Stage secondStage = new Stage();
			secondStage.setScene(scene);
			secondStage.setTitle("iCarFax: BMW's Database");
			secondStage.initModality(Modality.APPLICATION_MODAL);
			secondStage.showAndWait();
		} catch (Exception e1) {
			e1.printStackTrace();
			return;
		}
	}
}