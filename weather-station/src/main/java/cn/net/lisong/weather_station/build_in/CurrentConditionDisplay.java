package cn.net.lisong.weather_station.build_in;

import java.util.Observable;
import java.util.Observer;

public class CurrentConditionDisplay implements Observer, DisplayElement{
	Observable observable;
	private float temperature;
	private float humidity;
	
	public CurrentConditionDisplay(Observable observable) {
		this.observable = observable;
		observable.addObserver(this);
	}

	@Override
	public void display() {
		System.out.println("当前天气: \n温度: " + this.temperature + "F, 相对温度: " +this.humidity + "%");
	}

	@Override
	public void update(Observable o, Object arg) {
		if (o instanceof WeatherData) {
			WeatherData wd = (WeatherData) o;
			this.temperature = wd.getTemperature();
			this.humidity = wd.getHumidity();
			this.display();
		}
	}

}
