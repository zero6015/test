package com.homeminus.dto;

public class FoodProduct extends Product{
	private String origin;
	private int period;
	private String kind;
	public String getOrigin() {
		return origin;
	}
	public void setOrigin(String origin) {
		this.origin = origin;
	}
	public int getPeriod() {
		return period;
	}
	public void setPeriod(int period) {
		this.period = period;
	}
	public String getKind() {
		return kind;
	}
	public void setKind(String kind) {
		this.kind = kind;
	}
	
	@Override
	public String toString() {
		String str =  "\n생산지:"+origin+
				  "\n유통기한:"+period+
				  "\n종류:"+kind;
		return super.toString()+str;
	}
}
