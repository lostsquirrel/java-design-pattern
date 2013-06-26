package cn.com.lisong.designpattern.interpreter;

import org.junit.Test;

public class TestInterpreter {

	// Rule: Robert and John are male
	public Expression getMaleExpression() {
		Expression robert = new TerminalExpression("Robert");
		Expression john = new TerminalExpression("John");
		return new OrExpression(robert, john);
	}

	// Rule: Julie is a married women
	public Expression getMarriedWomanExpression() {
		Expression julie = new TerminalExpression("Julie");
		Expression married = new TerminalExpression("Married");
		return new AndExpression(julie, married);
	}
	@Test
	public void main() {
		Expression isMale = getMaleExpression();
		Expression isMarriedWoman = getMarriedWomanExpression();
		System.out.println("John is male? " + isMale.interpret("Joh"));
		System.out.println("Julie is a married women? "
				+ isMarriedWoman.interpret("Married Julie"));
	}
}
