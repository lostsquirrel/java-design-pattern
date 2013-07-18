package cn.net.lisong.duck_simulator;


public abstract class Duck {
    protected FlyBehavior fly;
    protected QuackBehavior quack;
    public void performQuack() {
    	this.quack.quack();
    }
    
    public void performFly() {
    	this.fly.fly();
    }
    
    public void swim() {
    	System.out.println(this.getClass().getName() + "Swimming");
    }
    
    public abstract void display();
    
    public void setQuack(QuackBehavior quack) {
    	this.quack = quack;
    }
    
    public void setFly(FlyBehavior fly) {
    	this.fly = fly;
    }
}
