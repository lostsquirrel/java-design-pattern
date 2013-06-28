package cn.com.lisong.designpattern.compositeentity;

import org.junit.Test;

public class TestCompositeEntity {

	@Test
	public void testCE() {
		Client client = new Client();
		client.setData("Test", "Data");
		client.printData();
		client.setData("Second Test", "Data1");
		client.printData();
	}
}
