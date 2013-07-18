package cn.net.lisong.star_buzz;


public class Milk extends CondimentDecorator {
	public Milk(Beverage beverage) {
		this.beverage = beverage;
	}
	
    public double cost() {
    	return 0.3 + this.beverage.cost();
    }

	@Override
	public String getDescription() {
		return this.beverage.getDescription() + ", Milk";
	}
}
