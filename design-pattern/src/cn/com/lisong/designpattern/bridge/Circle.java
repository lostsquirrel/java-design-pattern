package cn.com.lisong.designpattern.bridge;

public class Circle extends Shape {

	private int x;
	private int y;
	private int radius;
	
	public Circle( int radius, int x, int y, DrawAPI drawAPI) {
		super(drawAPI);
		this.x = x;
		this.y = y;
		this.radius = radius;
	}

	@Override
	public void draw() {
		this.drawAPI.drawCircle(radius, x, y);
	}

}
