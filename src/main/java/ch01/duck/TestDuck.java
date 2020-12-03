package ch01.duck;

import ch01.behavicor.FlyNoWay;

/**
 * @author: WangDongDong
 * @version: v1.0
 * @create: 2020-12-02 20:46
 * @description
 **/
public class TestDuck {
	public static void main(String[] args) {
		Duck duck=new MallardDuck();
		duck.display();
		duck.setFlyBehavior(new FlyNoWay());
		duck.display();
	}
}
