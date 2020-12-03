package ch02.demo2;

/**
 * @author: WangDongDong
 * @version: v1.0
 * @create: 2020-12-03 20:14
 * @description
 **/
public class WeatherStation {
	public static void main(String[] args) {
		WeatherData weatherData=new WeatherData();
		CurrentConditionsDisplay currentConditionsDisplay=new CurrentConditionsDisplay(weatherData);
		weatherData.setMeasurements(110,90,0);
	}
}
