package ch01.duck;

import ch01.behavicor.FlyWithWings;
import ch01.behavicor.Quack;

/**
 * @author: WangDongDong
 * @version: v1.0
 * @create: 2020-12-02 19:21
 * @description
 **/
public class MallardDuck extends Duck {
	public MallardDuck(){
		flyBehavior =new FlyWithWings();
		quackBehavior=new Quack();
	}

	@Override
	public void display() {
		peformFly();
		swim();
		performQuack();
	}
}
