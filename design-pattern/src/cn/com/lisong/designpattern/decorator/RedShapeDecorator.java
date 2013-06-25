package cn.com.lisong.designpattern.decorator;

public class RedShapeDecorator extends ShapeDecorator {
	//诡异的代码
	public RedShapeDecorator(Shape decoratedShape) {
		super(decoratedShape); 
	}
	
	@Override
	public void draw() {
		setRedBorder(this.decoratedShape);
		this.decoratedShape.draw(); 
	}
	private void setRedBorder(Shape decoratedShape){
		System.out.println("Border Color: Red");
	}
}