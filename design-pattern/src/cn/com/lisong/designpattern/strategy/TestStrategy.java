package cn.com.lisong.designpattern.strategy;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestStrategy {

	@Test
	public void testName() throws Exception {
		Context context = new Context(new OperationAdd()); 
		System.out.println("10 + 5 = " + context.executeStrategy(10, 5));
		context = new Context(new OperationSubstract()); 
		System.out.println("10 - 5 = " + context.executeStrategy(10, 5));
		context = new Context(new OperationMultiply()); 
		System.out.println("10 * 5 = " + context.executeStrategy(10, 5));
	}
}
