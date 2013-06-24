package cn.com.lisong.designpattern.abstractfactory.shape;

import cn.com.lisong.designpattern.abstractfactory.AbstractFactory;
import cn.com.lisong.designpattern.abstractfactory.color.Color;

public class ShapeFactory extends AbstractFactory{

	@Override
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

	@Override
	public Color getColor(String colorType) {
		return null;
	}
}
