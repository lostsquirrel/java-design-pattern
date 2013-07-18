package cn.net.lisong.duck_simulator;


public class MallardDuck extends Duck {
	public MallardDuck() {
    	this.fly = new FlyWithWings();
    	this.quack = new Quack();
	}

	public void display() {
		this.performFly();
		this.performQuack();
    }
}
