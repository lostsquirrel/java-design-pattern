package cn.net.lisong.duck_simulator;


public class RubberDuck extends Duck {
	
    public RubberDuck() {
    	this.fly = new FlyNoWay();
    	this.quack = new Queak();
	}

	public void display() {
		this.performFly();
		this.performQuack();
    }
}
