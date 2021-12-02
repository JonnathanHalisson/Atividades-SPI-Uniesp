package fakeExternalSensor;

public interface SensorInterface {
	public void updateData(String serialNumber, boolean activated);
	public void registerSensorListening(String serialNumber);
	public void unregisterSensorListening(String serialNumber);
	public String[] getRegisteredSensors();
}
