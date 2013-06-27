package cn.com.lisong.designpattern.visitor;

import org.junit.Test;

public class TestVisitor {

	@Test
	public void testVistor() {
		ComputerPart computer = new Computer();
		computer.accept(new ComputerPartDisplayVisitor());
	}
}
