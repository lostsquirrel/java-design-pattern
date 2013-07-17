package cn.net.lisong.weather_station;

public class WeatherStation {

	public static void main(String[] args) {
		WeatherData weatherData = new WeatherData();
		CurrentConditionDisplay currentConditionDisplay = new CurrentConditionDisplay(weatherData);
		weatherData.setMeasurements(80f, 65f, 30.4F);
		weatherData.setMeasurements(82f, 70f, 29.2F);
		weatherData.setMeasurements(78f, 90f, 31.1F);
	}
}
