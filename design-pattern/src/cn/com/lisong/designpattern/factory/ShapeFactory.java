package cn.com.lisong.designpattern.factory;

public class ShapeFactory {

	public Shape getShape(String shapeType) {
		if ("CIRCLE".equalsIgnoreCase(shapeType)) {
			return new Circle();
		} else if ("SQUARE".equalsIgnoreCase(shapeType)) {
			return new Square();
		} else if ("RECTANGLE".equalsIgnoreCase(shapeType)) {
			return new Rectangle();
		} 
		return null;
	}
}
