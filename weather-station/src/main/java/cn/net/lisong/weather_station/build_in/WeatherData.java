package cn.net.lisong.weather_station.build_in;

import java.util.Observable;

public class WeatherData extends Observable{

	private float temperature;
	private float humidity;
	private float pressure;
	
	public void measurementsChanged() {
		this.setChanged();
		this.notifyObservers();
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		this.measurementsChanged();	
	}

	public float getTemperature() {
		return temperature;
	}

	public float getHumidity() {
		return humidity;
	}

	public float getPressure() {
		return pressure;
	}
	
}
