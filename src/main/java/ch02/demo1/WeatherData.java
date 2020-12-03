package ch02.demo1;

import ch02.demo1.api.Observer;
import ch02.demo1.api.Subject;

import java.util.ArrayList;

/**
 * @author: WangDongDong
 * @version: v1.0
 * @create: 2020-12-03 17:32
 * @description
 **/
public class WeatherData implements Subject {
	private ArrayList<Observer> observers;
	private float temperature;
	private float humidity;
	private float pressure;

	public WeatherData() {
		observers=new ArrayList<Observer>();
	}

	public void registerObserver(Observer o) {
		observers.add(o);
	}

	public void removeObserver(Observer o) {
		int index=observers.indexOf(o);
		if(index>=0){
			observers.remove(index);
		}
	}

	public void notifyObservers() {
		for(Observer observer:observers){
			observer.update(temperature,humidity,pressure);
		}
	}

	public void measurementsChanged(){
		notifyObservers();
	}

	public void setMeasurements(float temperature,float humidity,float pressure){
		this.temperature=temperature;
		this.humidity=humidity;
		this.pressure=pressure;
		measurementsChanged();
	}
}
