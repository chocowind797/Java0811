package com.pcschool.ocp.d03.foodshop;

public class Breast {
	private int price = 35;
	private static int amount = 10;

	public Breast() {
		amount--;
	}
	
	public int getPrice() {
		return price;
	}
	public static int getAmount() {
		return amount;
	}
}
