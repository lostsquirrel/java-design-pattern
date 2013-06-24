package cn.com.lisong.designpattern.abstractfactory;

import cn.com.lisong.designpattern.abstractfactory.color.ColorFactory;
import cn.com.lisong.designpattern.abstractfactory.shape.ShapeFactory;

public class FactoryProducer {
	
	public AbstractFactory getFactory(String choice) {
		if ("COLOR".equalsIgnoreCase(choice)) {
			return new ColorFactory();
		} else if ("SHAPE".equalsIgnoreCase(choice)) {
			return new ShapeFactory();
		}
		return null;
	}
}
