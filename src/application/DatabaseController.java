package application;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.ListView;
import javafx.scene.control.TextField;
import javafx.stage.Stage;

public class DatabaseController {

	ObservableList<Client> infinitiData = FXCollections.observableArrayList();
	ObservableList<Client> porscheData = FXCollections.observableArrayList();
	ObservableList<Client> audiData = FXCollections.observableArrayList();
	ObservableList<Client> rangeData = FXCollections.observableArrayList();
	ObservableList<Client> benzData = FXCollections.observableArrayList();
	ObservableList<Client> bmwData = FXCollections.observableArrayList();

	private static final String CLIENT_INFORMATION = "/Users/Nabeel/Documents/Java Workspace/iCarFax/load_clients.txt";

	@FXML
	private TextField _textFieldSearch;
	@FXML
	private TextField _textFieldAdd;
	@FXML
	private Button _buttonBack;
	@FXML
	private Button _buttonAdd;
	@FXML
	private Button _buttonEdit;
	@FXML
	private Button _buttonDelete;
	@FXML
	private ListView<Client> _listView;

	@FXML
	public void initialize() {

		_buttonBack.setOnAction(e -> onBackClicked(e));
		_buttonAdd.setOnAction(e -> onAddClicked(e));
		_buttonEdit.setOnAction(e -> onEditClicked(e));
		_buttonDelete.setOnAction(e -> onDeleteClicked(e));
		_textFieldSearch.setOnAction(e -> onSearched(e));

		_textFieldSearch.setFocusTraversable(false);

	}

	public void onSearched(ActionEvent e) {

	}

	public void onAddClicked(ActionEvent e) {
		infinitiData.add(new Client(_textFieldAdd.getText().toString(), _textFieldAdd.getText().toString(),
				_textFieldAdd.getText().toString(), _textFieldAdd.getText().toString(), 0,
				_textFieldAdd.getText().toString()));
		_textFieldAdd.clear();
	}

	public void onEditClicked(ActionEvent e) {

	}

	public void onDeleteClicked(ActionEvent e) {
	}

	// Loads Infiniti's Database
	public void infinitiDatabase() {
		infinitiData.add(new Client("John Doe", "100 Unknown Street", "(647) 478-3793", "2007 Infiniti G35 Coupe",
				27382, "No accidents. Like new. Warranty expired."));
		infinitiData.add(new Client("Sarah M", "31 King Blvd.", "(647) 343-4738", "2016 Infiniti Q50", 1838,
				"No accidents. Like new. Under dealer warranty."));
		infinitiData.add(new Client("Melissa Adams", "19 Bays Ave.", "(416) 183-5382", "2017 Infiniti Q60", 4729,
				"One accident, covered under insurance. Under dealer warranty."));
		_listView.setItems(infinitiData);
	}

	// Loads Porsche's Database
	public void porscheDatabase() {
		porscheData.add(new Client("Porsche", "100 Unknown Street", "(647) 478-3793", "2007 Infiniti G35 Coupe", 27382,
				"No accidents. Like new. Warranty expired."));
		porscheData.add(new Client("Sarah M", "31 King Blvd.", "(647) 343-4738", "2016 Infiniti Q50", 1838,
				"No accidents. Like new. Under dealer warranty."));
		porscheData.add(new Client("Melissa Adams", "19 Bays Ave.", "(416) 183-5382", "2017 Infiniti Q60", 4729,
				"One accident, covered under insurance. Under dealer warranty."));
		_listView.setItems(porscheData);
	}

	// Loads Audi's Database
	public void audiDatabase() {
		audiData.add(new Client("Audi", "100 Unknown Street", "(647) 478-3793", "2007 Infiniti G35 Coupe", 27382,
				"No accidents. Like new. Warranty expired."));
		audiData.add(new Client("Sarah M", "31 King Blvd.", "(647) 343-4738", "2016 Infiniti Q50", 1838,
				"No accidents. Like new. Under dealer warranty."));
		audiData.add(new Client("Melissa Adams", "19 Bays Ave.", "(416) 183-5382", "2017 Infiniti Q60", 4729,
				"One accident, covered under insurance. Under dealer warranty."));
		_listView.setItems(audiData);
	}

	// Loads Range Rover's Database
	public void rangeDatabase() {
		rangeData.add(new Client("Range", "100 Unknown Street", "(647) 478-3793", "2007 Infiniti G35 Coupe", 27382,
				"No accidents. Like new. Warranty expired."));
		rangeData.add(new Client("Sarah M", "31 King Blvd.", "(647) 343-4738", "2016 Infiniti Q50", 1838,
				"No accidents. Like new. Under dealer warranty."));
		rangeData.add(new Client("Melissa Adams", "19 Bays Ave.", "(416) 183-5382", "2017 Infiniti Q60", 4729,
				"One accident, covered under insurance. Under dealer warranty."));
		_listView.setItems(rangeData);
	}

	public void benzDatabase() {
		benzData.add(new Client("Benz", "100 Unknown Street", "(647) 478-3793", "2007 Infiniti G35 Coupe", 27382,
				"No accidents. Like new. Warranty expired."));
		benzData.add(new Client("Sarah M", "31 King Blvd.", "(647) 343-4738", "2016 Infiniti Q50", 1838,
				"No accidents. Like new. Under dealer warranty."));
		benzData.add(new Client("Melissa Adams", "19 Bays Ave.", "(416) 183-5382", "2017 Infiniti Q60", 4729,
				"One accident, covered under insurance. Under dealer warranty."));
		_listView.setItems(benzData);
	}

	// Loads BMW's Database
	public void bmwDatabase() {
		bmwData.add(new Client("BMW", "100 Unknown Street", "(647) 478-3793", "2007 Infiniti G35 Coupe", 27382,
				"No accidents. Like new. Warranty expired."));
		bmwData.add(new Client("Sarah M", "31 King Blvd.", "(647) 343-4738", "2016 Infiniti Q50", 1838,
				"No accidents. Like new. Under dealer warranty."));
		bmwData.add(new Client("Melissa Adams", "19 Bays Ave.", "(416) 183-5382", "2017 Infiniti Q60", 4729,
				"One accident, covered under insurance. Under dealer warranty."));
		_listView.setItems(bmwData);
	}

	private void onBackClicked(ActionEvent e) {
		Stage stage = (Stage) _buttonBack.getScene().getWindow();
		stage.hide();

		PrintWriter writerOne = null;

		try {
			File designerRates = new File("client-data.txt");
			writerOne = new PrintWriter(designerRates);
			writerOne.println(infinitiData);
		} catch (FileNotFoundException event) {
			event.printStackTrace();
		} finally {
			if (writerOne != null) {
				writerOne.close();
			}
		}
	}
}