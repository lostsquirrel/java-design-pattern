package cn.com.lisong.designpattern.builder;

public class ChickenBurger extends Burger {

	@Override
	public String name() {
		return "ChickenBurger";
	}

	@Override
	public float price() {
		return 50.5f;
	}

}
