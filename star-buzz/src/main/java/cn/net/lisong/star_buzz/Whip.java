package cn.net.lisong.star_buzz;


public class Whip extends CondimentDecorator {
	public Whip(Beverage beverage) {
		this.beverage = beverage;
	}
	
    public double cost() {
    	return 0.1 + this.beverage.cost();
    }

	@Override
	public String getDescription() {
		return this.beverage.getDescription() + ", Whip";
	}
}
