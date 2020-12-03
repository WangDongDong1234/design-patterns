package ch01.behavicor;

import ch01.FlyBehavior;

/**
 * @author: WangDongDong
 * @version: v1.0
 * @create: 2020-12-02 19:14
 * @description
 **/
public class FlyWithWings implements FlyBehavior {
	public void fly() {
		System.out.println("用翅膀飞");
	}
}
