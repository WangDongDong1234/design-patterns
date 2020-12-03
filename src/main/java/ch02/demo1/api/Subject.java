package ch02.demo1.api;

/**
 * @author: WangDongDong
 * @version: v1.0
 * @create: 2020-12-03 17:33
 * @description
 **/
public interface Subject {
	void registerObserver(Observer o);
	void removeObserver(Observer o);
	void notifyObservers();
}
