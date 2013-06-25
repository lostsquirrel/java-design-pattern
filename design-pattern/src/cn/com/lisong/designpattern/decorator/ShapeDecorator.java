package cn.com.lisong.designpattern.decorator;

public class ShapeDecorator implements Shape {
	protected Shape decoratedShape;

	public ShapeDecorator(Shape decoratorShape) {
		this.decoratedShape = decoratorShape;
	}

	@Override
	public void draw() {
		this.decoratedShape.draw();
	}

}
