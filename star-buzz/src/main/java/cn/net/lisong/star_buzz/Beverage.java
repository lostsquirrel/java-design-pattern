package cn.net.lisong.star_buzz;


public abstract class Beverage {
    public String description;
    public String getDescription() {
    	return this.description;
    }
    public abstract double cost();
}
