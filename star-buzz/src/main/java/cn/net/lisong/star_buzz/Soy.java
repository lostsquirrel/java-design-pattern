package cn.net.lisong.star_buzz;


public class Soy extends CondimentDecorator {
	public Beverage beverage;
	public Soy(Beverage beverage) {
		this.beverage = beverage;
	}
	
    public double cost() {
    	return 0.4 + this.beverage.cost();
    }

	@Override
	public String getDescription() {
		return this.beverage.getDescription() + ", Soy";
	}
}
