package ch03.demo1;

/**
 * @author: WangDongDong
 * @version: v1.0
 * @create: 2020-12-03 21:06
 * @description
 **/
public class DarkRoast extends Beverage{
	public DarkRoast(){
		this.setDescription("Most Execllent Dark Roast");
	}

	@Override
	public double cost(){
		return 1.99+super.cost();
	}

	public static void main(String[] args) {
		DarkRoast darkRoast=new DarkRoast();
		System.out.println(darkRoast.cost());
		darkRoast.setMilk(true);
		System.out.println(darkRoast.cost());
	}
}
