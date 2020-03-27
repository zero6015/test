package com.homeminus.dto;

public class LifeProduct extends Product {
	private String maker;//제조사
	private boolean recycle;//재활용 여부
	private String usage;//용도: 주방, 욕실, 거실, 베란다 등
	
	public String getMaker() {
		return maker;
	}
	public void setMaker(String maker) {
		this.maker = maker;
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
