package cn.net.lisong.duck_simulator;


public class DecoyDuck extends Duck {
	public DecoyDuck() {
    	this.fly = new FlyNoWay();
    	this.quack = new MuteQuack();
	}

	public void display() {
		this.performFly();
		this.performQuack();
    }
}
