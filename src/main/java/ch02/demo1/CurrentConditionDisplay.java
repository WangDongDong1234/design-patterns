package ch02.demo1;

import ch02.demo1.api.*;

/**
 * @author: WangDongDong
 * @version: v1.0
 * @create: 2020-12-03 17:46
 * @description
 **/
public class CurrentConditionDisplay implements Observer, DisplayElement {
	private float temperature;
	private float humidity;
	private float pressure;
	private Subject subject;

	public CurrentConditionDisplay(Subject subject) {
		this.subject = subject;
		subject.registerObserver(this);
	}

	public void display() {
		System.out.println(temperature+",--"+humidity+",--"+pressure);
	}

	public void update(float temp, float humidity, float pressure) {
		this.temperature=temp;
		this.humidity=humidity;
		this.pressure=pressure;
		display();
	}
}
