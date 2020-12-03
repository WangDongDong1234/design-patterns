package ch02.demo2;

import java.util.Observable;

/**
 * @author: WangDongDong
 * @version: v1.0
 * @create: 2020-12-03 19:56
 * @description  java内置的观察者模式，Observable类实现了add,delete,notify方法了,同时维护了一个list来存在观察者
 **/
public class WeatherData extends Observable {
	private float temperature;
	private float humidity;
	private float pressure;

	public WeatherData(){

	}

	public void setMeasurements(float temperature,float humidity,float pressure){
		this.temperature=temperature;
		this.humidity=humidity;
		this.pressure=pressure;
		measurementsChanged();
	}

	private void measurementsChanged() {
		setChanged();
		notifyObservers();
	}

	//提供拉的方法
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
