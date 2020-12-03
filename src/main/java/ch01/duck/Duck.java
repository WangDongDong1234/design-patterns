package ch01.duck;

import ch01.FlyBehavior;
import ch01.QuackBehavior;

/**
 * @author: WangDongDong
 * @version: v1.0
 * @create: 2020-12-02 19:10
 * @description
 **/
public abstract class Duck {
	 FlyBehavior flyBehavior;
	 QuackBehavior quackBehavior;

	public void performQuack(){
		quackBehavior.quack();
	}

	public void swim(){
		System.out.println("游泳");
	}

	public abstract void display();

	public void peformFly(){
		flyBehavior.fly();
	}

	public void setFlyBehavior(FlyBehavior flyBehavior) {
		this.flyBehavior = flyBehavior;
	}

	public void setQuackBehavior(QuackBehavior quackBehavior) {
		this.quackBehavior = quackBehavior;
	}
}
