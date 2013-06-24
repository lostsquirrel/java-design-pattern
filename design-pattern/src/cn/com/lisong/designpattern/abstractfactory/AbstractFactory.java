package cn.com.lisong.designpattern.abstractfactory;

import cn.com.lisong.designpattern.abstractfactory.color.Color;
import cn.com.lisong.designpattern.abstractfactory.shape.Shape;

public abstract class AbstractFactory {
	public abstract Shape getShape(String shapeType);
	public abstract Color getColor(String colorType);
}
