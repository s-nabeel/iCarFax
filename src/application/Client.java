package application;

public class Client {

	private String _name;
	private String _address;
	private String _number;
	private String _carMake;
	private int _carMilage;
	private String _report;

	public Client(String _name, String _address, String _number, String _carMake, int _carMilage, String _report) {
		this._name = _name;
		this._address = _address;
		this._number = _number;
		this._carMake = _carMake;
		this._carMilage = _carMilage;
		this._report = _report;
	}

	public String getName() {
		return _name;
	}

	public void setName(String _name) {
		this._name = _name;
	}

	public String getAddress() {
		return _address;
	}

	public void setAddress(String _address) {
		this._address = _address;
	}

	public String getNumber() {
		return _number;
	}

	public void setNumber(String _number) {
		this._number = _number;
	}

	public String getCarMake() {
		return _carMake;
	}

	public void setCarMake(String _carMake) {
		this._carMake = _carMake;
	}

	public int getCarMilage() {
		return _carMilage;
	}

	public void setCarMilage(int _carMilage) {
		this._carMilage = _carMilage;
	}

	public String getReport() {
		return _report;
	}

	public void setReport(String _report) {
		this._report = _report;
	}

	@Override
	public String toString() {
		return ("\n" + _name + ",   " + _address + ",   " + _number + ",   " + _carMake + ",   " + _carMilage + "km,   " + _report);
	}
}