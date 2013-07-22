package cn.net.lisong.star_buzz;


public class Mocha extends CondimentDecorator {
	public Beverage beverage;
	public Mocha(Beverage beverage) {
		this.beverage = beverage;
	}
	
    public double cost() {
    	return 0.2 + this.beverage.cost();
    }

	@Override
	public String getDescription() {
		return this.beverage.getDescription() + ", Mocha";
	}
}
