package estacionamentoUniesp;

import java.time.LocalDateTime;

public class SensorAnalytics {
	private Sensor sensor;
	private LocalDateTime date;
	
	public SensorAnalytics(Sensor sensor, LocalDateTime date) {
		this.sensor = sensor;
		this.date = date;
	}

	public Sensor getSensor() {
		return sensor;
	}

	public void setSensor(Sensor sensor) {
		this.sensor = sensor;
	}

	public LocalDateTime getDate() {
		return date;
	}

	public void setDate(LocalDateTime date) {
		this.date = date;
	}
}
