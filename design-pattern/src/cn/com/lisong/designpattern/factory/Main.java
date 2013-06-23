package cn.com.lisong.designpattern.factory;

public class Main {

	//工厂模式是java开发中常用到的设计模式. 它属于creational pattern，是一种很好的创建对方的方式. 在工厂模式中，创建逻辑没有暴露线客户端，用同一个接口（表示、关联）被创建的对象
	public static void main(String[] args) {
		ShapeFactory shapeFactory = new ShapeFactory();
		Shape circle = shapeFactory.getShape("circle");
		circle.draw();
		Shape square = shapeFactory.getShape("square");
		square.draw();
		Shape rectangle = shapeFactory.getShape("rectangle");
		rectangle.draw();
	}
}
