package ch02.demo1;

/**
 * @author: WangDongDong
 * @version: v1.0
 * @create: 2020-12-03 17:53
 * @description
 **/
public class WeathreStation {
	public static void main(String[] args) {
		WeatherData weatherData=new WeatherData();
		CurrentConditionDisplay currentConditionDisplay=new CurrentConditionDisplay(weatherData);
		weatherData.setMeasurements(80,90,100);
	}
}
