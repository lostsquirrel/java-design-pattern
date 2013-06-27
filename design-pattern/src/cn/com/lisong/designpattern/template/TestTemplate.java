package cn.com.lisong.designpattern.template;

import org.junit.Test;

public class TestTemplate {

	@Test
	public void testName() throws Exception {
		Game game = new Cricket();
		game.play();
		System.out.println();
		game = new Football();
		game.play();
	}
}
