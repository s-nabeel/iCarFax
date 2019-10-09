package application;

import javafx.application.Application;
import javafx.stage.Stage;
import javafx.stage.StageStyle;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.fxml.FXMLLoader;

public class Main extends Application {
	@Override
	public void start(Stage splashScreenStage) throws Exception {
		Parent root = FXMLLoader.load(getClass().getResource("SplashScreen.fxml"));
		Scene scene = new Scene(root, 400, 400);
		splashScreenStage.initStyle(StageStyle.UNDECORATED);
		splashScreenStage.setTitle("iCarFax: Loading..."); // Not visible due to StageStyle.UNDECORATED
		splashScreenStage.setScene(scene);
		splashScreenStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}