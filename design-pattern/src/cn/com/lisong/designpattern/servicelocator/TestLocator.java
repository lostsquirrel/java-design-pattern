package cn.com.lisong.designpattern.servicelocator;

import org.junit.Test;

public class TestLocator {

	@Test
	public void testLocator() {
		Service service = ServiceLocator.getService("Service1");
		service.execute();
		service = ServiceLocator.getService("Service2");
		service.execute();
		service = ServiceLocator.getService("Service1");
		service.execute();
		service = ServiceLocator.getService("Service2");
		service.execute(); 
	}
}
