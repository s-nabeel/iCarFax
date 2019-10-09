package application;

import javafx.animation.FadeTransition;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.input.KeyCode;
import javafx.scene.input.KeyCodeCombination;
import javafx.scene.input.KeyCombination;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Modality;
import javafx.stage.Stage;
import javafx.util.Duration;

public class MainController {

	@FXML
	private RadioButton _radioButtonGuest;
	@FXML
	private RadioButton _radioButtonMember;
	@FXML
	private TextField _textFieldUsername;
	@FXML
	private Label _labelUsername;
	@FXML
	private PasswordField _passwordFieldPassword;
	@FXML
	private Label _labelPassword;
	@FXML
	private Button _buttonLogin;

	@FXML
	private void initialize() {

		if (_radioButtonGuest.isSelected() == false & _radioButtonMember.isSelected() == false) {
			_buttonLogin.setVisible(false);
			if (_radioButtonGuest.isSelected() == true & _radioButtonMember.isSelected() == false) {
				_textFieldUsername.clear();
				_passwordFieldPassword.clear();
			}
		}

		_radioButtonGuest.setOnAction(e -> onGuestClicked(e));
		_radioButtonMember.setOnAction(e -> onMemberClicked(e));
		_buttonLogin.setOnAction(e -> onLoginClicked(e));

		/*
		 * Only accepts the Enter/Return key rather than accepting ALT+Enter,
		 * etc.
		 * Allows the user to click Return key, rather than Login.
		 */
		_passwordFieldPassword.setOnKeyPressed(event -> {
			final KeyCombination combo = new KeyCodeCombination(KeyCode.ENTER);
			if (combo.match(event)) {
				System.out.println("The following username has been entered: " + _textFieldUsername.getText());
				System.out.println("The following password has been entered: " + _passwordFieldPassword.getText());
				_buttonLogin.fire();
			}
		});
	}

	// Hides all elements on the pane, and sets focus on Login button
	private void onGuestClicked(ActionEvent e) {
		if (_radioButtonGuest.isSelected() == true) {
			_radioButtonMember.setSelected(false);
			_textFieldUsername.setVisible(false);
			_labelUsername.setVisible(false);
			_passwordFieldPassword.setVisible(false);
			_labelPassword.setVisible(false);
			_buttonLogin.setVisible(true);
			_buttonLogin.requestFocus();
			_textFieldUsername.setText("admin");
			_passwordFieldPassword.setText("password");
		}
	}

	// Displays the Username and Password TextFields
	private void onMemberClicked(ActionEvent e) {
		if (_radioButtonMember.isSelected() == true) {
			_radioButtonGuest.setSelected(false);
			_textFieldUsername.clear();
			_passwordFieldPassword.clear();
		}

		_textFieldUsername.setVisible(true);
		_textFieldUsername.requestFocus();
		_labelUsername.setVisible(true);
		_passwordFieldPassword.setVisible(true);
		_labelPassword.setVisible(true);
		_buttonLogin.setVisible(true);
	}

	// Error handles every possible outcome for invalid usermame and/or password
	private void onLoginClicked(ActionEvent e) {
		if (_textFieldUsername.getText().equalsIgnoreCase("admin")
				& _passwordFieldPassword.getText().equals("password")) {
			System.out.println("Username & Password are valid! ");
			_textFieldUsername.clear();
			_passwordFieldPassword.clear();
			_buttonLogin.requestFocus();

			try {

				FXMLLoader fxmlLoader = new FXMLLoader(getClass().getResource("ManufacturerSelection.fxml"));
				AnchorPane root = fxmlLoader.load();
				Scene scene = new Scene(root, 400, 400);
				scene.getStylesheets().add(getClass().getResource("application.css").toExternalForm());
				Stage secondStage = new Stage();
				secondStage.setScene(scene);
				secondStage.setTitle("iCarFax: Manufacturer Selection");
				secondStage.initModality(Modality.APPLICATION_MODAL);
				secondStage.showAndWait();
			} catch (Exception ex) {
				ex.printStackTrace();
				return;
			}

		} else if (!_textFieldUsername.getText().equalsIgnoreCase("admin")
				& !_passwordFieldPassword.getText().equals("password")) {
			System.out.println("Username & Password are invalid! Try again. ");
			FadeTransition fade = new FadeTransition(Duration.millis(2000), _buttonLogin);
			fade.setFromValue(1.0);
			fade.setToValue(0.3);
			fade.setAutoReverse(true);
			fade.play();
			fade.setRate(-2);
			fade.jumpTo(Duration.millis(2000));
			_buttonLogin.requestFocus();
			_textFieldUsername.clear();
			_passwordFieldPassword.clear();
			_textFieldUsername.requestFocus();
		} else if (_textFieldUsername.getText().equalsIgnoreCase("admin")
				& !_passwordFieldPassword.getText().equals("password")
				| !_textFieldUsername.getText().equalsIgnoreCase("admin")
						& _passwordFieldPassword.getText().equals("password")) {
			System.out.println("Username & Password are invalid! Try again. ");
			FadeTransition fade = new FadeTransition(Duration.millis(2000), _buttonLogin);
			fade.setFromValue(1.0);
			fade.setToValue(0.3);
			fade.setAutoReverse(true);
			fade.play();
			fade.setRate(-2);
			fade.jumpTo(Duration.millis(2000));
			_buttonLogin.requestFocus();
			_textFieldUsername.clear();
			_passwordFieldPassword.clear();
			_textFieldUsername.requestFocus();
		}
	}
}