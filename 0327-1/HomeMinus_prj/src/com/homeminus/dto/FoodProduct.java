package com.homeminus.dto;

public class FoodProduct extends Product {
	private String origin;//생산직
	private boolean recycle;//재활용 여부
	private String usage;//용도: 주방, 욕실, 거실, 베란다 등
	
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public boolean isRecycle() {
		return recycle;
	}
	public void setRecycle(boolean recycle) {
		this.recycle = recycle;
	}
	public String getUsage() {
		return usage;
	}
	public void setUsage(String usage) {
		this.usage = usage;
	}
	
}
