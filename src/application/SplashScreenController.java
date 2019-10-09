package application;

import java.io.IOException;
import java.net.URL;
import java.util.ResourceBundle;
import java.util.logging.Level;
import java.util.logging.Logger;
import javafx.application.Platform;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.ProgressIndicator;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;

public class SplashScreenController implements Initializable {

	@FXML
	private AnchorPane rootPane;
	@FXML
	private ProgressIndicator _progressIndicator;

	@Override
	public void initialize(URL location, ResourceBundle resources) {
		new SplashScreen().start(); // Calls the SplashScreen method (thread)
	}

	class SplashScreen extends Thread {

		@Override
		public void run() {
			try {
				Thread.sleep(4000); // Shows SplashScreen.fxml for 5 seconds

				Platform.runLater(new Runnable() {
					@Override
					public void run() {
						Parent root = null;
						try {
							root = FXMLLoader.load(getClass().getResource("Main.fxml"));
						} catch (IOException e) {
							Logger.getLogger(SplashScreenController.class.getName()).log(Level.SEVERE, null, e);
						}
						Scene scene = new Scene(root);
						Stage stage = new Stage();
						stage.setScene(scene);
						stage.show();
						stage.setTitle("iCarFax: Login");
						rootPane.getScene().getWindow().hide(); // Hides SplashScreen.fxml after 5 seconds
					}
				});

			} catch (InterruptedException e) {
				Logger.getLogger(SplashScreenController.class.getName()).log(Level.SEVERE, null, e);
			}
		}
	}
}