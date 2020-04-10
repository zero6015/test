package com.homeminus.dto;

public class LifeProduct extends Product{
	private String maker; //제조사
	private boolean recycle; // 재활용
	private String usage; // 용도
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
	
	@Override
	public String toString() {
		String re = null;
		if(recycle==true) {
			re = "가능";
		}
		else{
			re = "불가능";
		}
		String str = "\n제조사:" + maker +
				   "\n용도:" +usage+
				   "\n재활용 여부:" +re;
		return super.toString()+str;
	}
}
