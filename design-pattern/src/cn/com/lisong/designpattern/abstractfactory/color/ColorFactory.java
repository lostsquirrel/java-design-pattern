package cn.com.lisong.designpattern.abstractfactory.color;

import cn.com.lisong.designpattern.abstractfactory.AbstractFactory;
import cn.com.lisong.designpattern.abstractfactory.color.Color;
import cn.com.lisong.designpattern.abstractfactory.shape.Shape;

public class ColorFactory extends AbstractFactory{

	@Override
	public Shape getShape(String shapeType) {
		return null;
	}

	@Override
	public Color getColor(String colorType) {
		if ("RED".equalsIgnoreCase(colorType)) {
			return new Red();
		} else if ("GREEN".equalsIgnoreCase(colorType)) {
			return new Green();
		} else if ("BLUE".equalsIgnoreCase(colorType)) {
			return new Blue();
		} 
		return null;
	}
}
