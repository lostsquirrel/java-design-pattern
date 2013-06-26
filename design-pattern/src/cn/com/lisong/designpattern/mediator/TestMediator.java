package cn.com.lisong.designpattern.mediator;

import org.junit.Test;

public class TestMediator {

	@Test
	public void main() {
		User robert = new User("Robert");
		User john = new User("John");
		robert.sendMessage("Hi! John!");
		john.sendMessage("Hello! Robert!");
	}
}
