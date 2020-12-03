package ch01.behavicor;

import ch01.QuackBehavior;

/**
 * @author: WangDongDong
 * @version: v1.0
 * @create: 2020-12-02 19:17
 * @description
 **/
public class MuteQuack  implements QuackBehavior {
	public void quack() {
		System.out.println("什么都不叫");
	}
}
