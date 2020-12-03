package ch01.behavicor;

import ch01.FlyBehavior;

/**
 * @author: WangDongDong
 * @version: v1.0
 * @create: 2020-12-02 19:15
 * @description
 **/
public class FlyNoWay implements FlyBehavior {
	public void fly() {
		System.out.println("本鸭子不会飞");
	}
}
