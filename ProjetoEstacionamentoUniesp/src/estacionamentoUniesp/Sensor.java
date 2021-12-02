package estacionamentoUniesp;

public class Sensor {
	private String serialNumber;
	private boolean activated;
	private String name;
	private Category category;
	
	public Sensor(String serialNumber, boolean activated, String name, Category category) {
		this.serialNumber = serialNumber;
		this.activated = activated;
		this.name = name;
		this.category = category;
	}

	public String getSerialNumber() {
		return serialNumber;
	}

	public void setSerialNumber(String serialNumber) {
		this.serialNumber = serialNumber;
	}

	public boolean isActivated() {
		return activated;
	}

	public void setActivated(boolean activated) {
		this.activated = activated;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Category getCategory() {
		return category;
	}

	public void setCategory(Category category) {
		this.category = category;
	}
}
