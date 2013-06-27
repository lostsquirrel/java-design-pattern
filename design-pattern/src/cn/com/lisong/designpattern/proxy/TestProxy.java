package cn.com.lisong.designpattern.proxy;

import org.junit.Test;

public class TestProxy {

	@Test
	public void testName() throws Exception {
		Image image = new ProxyImage("test_10mb.jpg");
		//image will be loaded from disk
		image.display();
		//image will not be loaded from disk
		image.display(); 
	}
}
