package cn.com.lisong.designpattern.singleton;

import org.junit.Test;

public class TestSingleton {

	@Test
	public void testGet() {
		Singleton s = Singleton.getInstance("1");
		System.out.println(s.showMessage());
		Singleton s2 = Singleton.getInstance("2");
		System.out.println(s2.showMessage());
		//反射可以破
	}
}
