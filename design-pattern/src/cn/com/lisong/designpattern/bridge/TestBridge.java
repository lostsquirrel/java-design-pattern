package cn.com.lisong.designpattern.bridge;

import org.junit.Test;

public class TestBridge {

	@Test
	public void testDraw() {
//		Shape nullCircle = new Circle(0, 0, 0, null);
		Shape redCircle = new Circle(10, 10, 10, new RedCircle());
		redCircle.draw();
		Shape greenCircle = new Circle(9, 9, 9, new GreenCircle());
		greenCircle.draw();
	}
}
