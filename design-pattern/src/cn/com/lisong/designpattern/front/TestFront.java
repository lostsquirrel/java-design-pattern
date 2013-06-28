package cn.com.lisong.designpattern.front;

import org.junit.Test;

public class TestFront {

	@Test
	public void testController() {
		FrontController frontController = new FrontController();
		frontController.dispatchRequest("HOME");
		frontController.dispatchRequest("STUDENT");
	}
}
