package com.homeminus.dto;

public class Product {//부모 클래스
	private String name;//제품명
	private int price;//가격
	private int amount;//수량
	private String made;//생산국
	private String mday;//제조일자
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public int getAmount() {
		return amount;
	}
	public void setAmount(int amount) {
		this.amount = amount;
	}
	public String getMade() {
		return made;
	}
	public void setMade(String made) {
		this.made = made;
	}
	public String getMday() {
		return mday;
	}
	public void setMday(String mday) {
		this.mday = mday;
	}
	
	
}
