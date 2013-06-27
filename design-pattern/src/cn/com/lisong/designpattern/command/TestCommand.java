package cn.com.lisong.designpattern.command;

import org.junit.Test;

public class TestCommand {

	@Test
	public void testName() throws Exception {
		Stock abcStock = new Stock();
		BuyStock buyStockOrder = new BuyStock(abcStock);
		SellStock sellStockOrder = new SellStock(abcStock);
		Broker broker = new Broker();
		broker.takeOrder(buyStockOrder);
		broker.takeOrder(buyStockOrder);
		broker.takeOrder(sellStockOrder);
		broker.placeOrders();
	}
}
