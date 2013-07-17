package cn.net.lisong.weather_station;

import java.util.ArrayList;
import java.util.List;

public class WeatherData implements Subject{

	private List<Observer> observers = new ArrayList<Observer>();
	private float temperature;
	private float humidity;
	private float pressure;
	
	@Override
	public void registerObserver(Observer observer) {
		observers.add(observer);
	}

	@Override
	public void removeObserver(Observer observer) {
		int index = observers.indexOf(observer);
		if (index > 0) {
			observers.remove(index);
		}
	}

	@Override
	public void notifyObserver() {
		for (Observer observer : observers) {
			observer.update(temperature, humidity, pressure);
		}
	}
	
	public void measurementsChanged() {
		this.notifyObserver();
	}
	
	public void setMeasurements(float temperature, float humidity, float pressure) {
		this.temperature = temperature;
		this.humidity = humidity;
		this.pressure = pressure;
		this.measurementsChanged();	
	}

}
