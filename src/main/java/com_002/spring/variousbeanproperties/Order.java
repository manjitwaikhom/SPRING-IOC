package com_002.spring.variousbeanproperties;

public class Order {
	private int orderId;
	private String orderDate;
	private int qty;
	private double cost;
	private String status;

	public Order() {

		System.out.println("Order default constructor");
	}

	public int getOrderId() {
		return orderId;
	}

	public void setOrderId(int orderId) {
		this.orderId = orderId;
	}

	public String getOrderDate() {
		return orderDate;
	}

	public void setOrderDate(String orderDate) {
		this.orderDate = orderDate;
	}

	public int getQty() {
		return qty;
	}

	public void setQty(int qty) {
		this.qty = qty;
	}

	public double getCost() {
		return cost;
	}

	public void setCost(double cost) {
		this.cost = cost;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String toString() {
		return "" + orderId + "\t" + orderDate + "\t" + qty + "\t" + cost
				+ "\t" + status;
	}
}
