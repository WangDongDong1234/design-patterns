package ch01.behavicor;

import ch01.QuackBehavior;

/**
 * @author: WangDongDong
 * @version: v1.0
 * @create: 2020-12-02 19:16
 * @description
 **/
public class Squeak implements QuackBehavior {
	public void quack() {
		System.out.println("橡皮鸭子吱吱叫");
	}
}
