package cn.net.lisong.weather_station;

public interface Observer {
	public void update(float temp, float humidity, float pressure);
}
