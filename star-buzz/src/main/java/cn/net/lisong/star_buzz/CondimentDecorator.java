package cn.net.lisong.star_buzz;


public abstract class CondimentDecorator extends Beverage {
    public Beverage beverage;
    public abstract String getDescription();
}
