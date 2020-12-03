package ch02.demo2;

import ch02.demo1.api.DisplayElement;

import java.util.Observable;
import java.util.Observer;

/**
 * @author: WangDongDong
 * @version: v1.0
 * @create: 2020-12-03 20:08
 * @description
 **/
public class CurrentConditionsDisplay implements Observer, DisplayElement {
	private float temperature;
	private float humidity;
	private float pressure;
	private Observable observable;
	public CurrentConditionsDisplay(Observable observable){
		this.observable=observable;
		observable.addObserver(this);
	}
	public void display() {
		System.out.println(temperature+"--,--"+humidity+"--,--"+pressure);
	}

	public void update(Observable o, Object arg) {
		if(o instanceof WeatherData){
			WeatherData weatherData=(WeatherData)o;
			this.humidity=weatherData.getHumidity();
			this.temperature=weatherData.getTemperature();
			this.pressure=weatherData.getPressure();
			display();
		}
	}
}
