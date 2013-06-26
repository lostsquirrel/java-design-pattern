package cn.com.lisong.designpattern.flyweight;

public class Circle implements Shape{

	private String color;
	private double x;
	private double y;
	private double radius;
	public Circle(String color) {
		this.color = color;
	}
	
	public void setX(double x) {
		this.x = x;
	}

	public void setY(double y) {
		this.y = y;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	@Override
	public void draw() {
		System.out.println("Circle: Draw() [Color : " + color 
				+", x: " + x +", y: " + y +", radius: " + radius);
	}

}
