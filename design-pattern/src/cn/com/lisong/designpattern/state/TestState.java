package cn.com.lisong.designpattern.state;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestState {

	@Test
	public void testName() throws Exception {
		Context context = new Context();
		StartState startState = new StartState();
		startState.doAction(context);
		System.out.println(context.getState().toString());
		StopState stopState = new StopState();
		stopState.doAction(context);
		System.out.println(context.getState().toString());
	}
}
