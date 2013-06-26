package cn.com.lisong.designpattern.command;

import java.util.ArrayList;
import java.util.List;

public class Broker {

	private List<Order> orderList = new ArrayList<Order>();
	
	public void takeOrder(Order order) {
		orderList.add(order);
	}
	public void placeOrders() {
		for (Order order: this.orderList) {
			order.execute();
		}
		this.orderList.clear();
	}
}
