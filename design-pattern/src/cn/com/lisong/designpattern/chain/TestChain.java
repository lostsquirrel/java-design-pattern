package cn.com.lisong.designpattern.chain;

import static org.junit.Assert.*;

import org.junit.Test;

public class TestChain {

	@Test
	public void testName() throws Exception {
		AbstractLogger loggerChain = getChainOfLoggers();
		loggerChain.logMessage(AbstractLogger.INFO, "This is an information.");
		loggerChain.logMessage(AbstractLogger.DEBUG, "This is an debug level information.");
		loggerChain.logMessage(AbstractLogger.ERROR, "This is an error information.");
	}
	
	private AbstractLogger getChainOfLoggers(){
		AbstractLogger errorLogger = new ErrorLogger(AbstractLogger.ERROR);
		AbstractLogger fileLogger = new FileLogger(AbstractLogger.DEBUG);
		AbstractLogger consoleLogger = new ConsoleLogger(AbstractLogger.INFO);
		errorLogger.setNextLogger(fileLogger);
		fileLogger.setNextLogger(consoleLogger);
		return errorLogger;
	}
}
