package cn.com.lisong.designpattern.interceptor;

import org.junit.Test;

public class TestIntercepter {

	@Test
	public void testintercepter() {
		FilterManager filterManager = new FilterManager(new Target());
		filterManager.setFilter(new AuthenticationFilter());
		filterManager.setFilter(new DebugFilter());
		Client client = new Client();
		client.setFilterManager(filterManager);
		client.sendRequest("HOME");
	}
}
