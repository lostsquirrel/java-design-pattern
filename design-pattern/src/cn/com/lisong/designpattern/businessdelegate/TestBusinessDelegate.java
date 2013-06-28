package cn.com.lisong.designpattern.businessdelegate;

import org.junit.Test;

public class TestBusinessDelegate {

	@Test
	public void testBusiness() {
		BusinessDelegate businessDelegate = new BusinessDelegate();
		businessDelegate.setServiceType("EJB");
		Client client = new Client(businessDelegate);
		client.doTask();
		businessDelegate.setServiceType("JMS");
		client.doTask();
	}
}
