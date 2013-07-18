package cn.net.lisong.duck_simulator;


public class RedheadDuck extends Duck {
	public RedheadDuck() {
    	this.fly = new FlyWithWings();
    	this.quack = new Quack();
	}

	public void display() {
		this.performFly();
		this.performQuack();
    }
}
