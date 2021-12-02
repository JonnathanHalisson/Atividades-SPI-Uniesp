package estacionamentoUniesp;

import fakeExternalSensor.SensorInterface;

public class SensorManager implements SensorInterface {
	public Sensor[] sensores;

	public SensorManager(Sensor[] sensores) {
		super();
		this.sensores = sensores;
	}

	@Override
	public void updateData(String serialNumber, boolean activated) {
		for(int i = 0; i <= this.sensores.length; ++i){
			Sensor sensor = this.sensores[i];
			if(sensor.getSerialNumber() == serialNumber) {
				sensor.setActivated(activated);
			}
		}
		
	}

	@Override
	public void registerSensorListening(String serialNumber) {
		// TODO Auto-generated method stub

	}

	@Override
	public void unregisterSensorListening(String serialNumber) {
		// TODO Auto-generated method stub

	}

	@Override
	public String[] getRegisteredSensors() {
		// TODO Auto-generated method stub
		return null;
	}

}
