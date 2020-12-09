package ch03.demo1;

/**
 * @author: WangDongDong
 * @version: v1.0
 * @create: 2020-12-03 20:57
 * @description
 **/
public class Beverage {
	private String description;
	private boolean milk;
	private boolean soy;
	private boolean mocha;
	private boolean whip;
	private double condimentCost=0;

	public double cost(){
		if(isMilk()){
			condimentCost+=1;
		}
		if(isMocha()){
			condimentCost+=1;
		}
		if(isSoy()){
			condimentCost+=1;
		}
		if(isWhip()){
			condimentCost+=1;
		}
		return condimentCost;
	}
	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public boolean isMilk() {
		return milk;
	}

	public void setMilk(boolean milk) {
		this.milk = milk;
	}

	public boolean isSoy() {
		return soy;
	}

	public void setSoy(boolean soy) {
		this.soy = soy;
	}

	public boolean isMocha() {
		return mocha;
	}

	public void setMocha(boolean mocha) {
		this.mocha = mocha;
	}

	public boolean isWhip() {
		return whip;
	}

	public void setWhip(boolean whip) {
		this.whip = whip;
	}
}
