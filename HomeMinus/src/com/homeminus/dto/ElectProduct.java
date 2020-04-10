package com.homeminus.dto;

public class ElectProduct extends Product {
	private String maker;      //제조사
	private int guarantee;	   //보증기간
	private int energyGrade;   //효율등급
	
	public String getMaker() {
		return maker;
	}
	public void setMaker(String maker) {
		this.maker = maker;
	}
	public int getGuarantee() {
		return guarantee;
	}
	public void setGuarantee(int guarantee) {
		this.guarantee = guarantee;
	}
	public int getEnergyGrade() {
		return energyGrade;
	}
	public void setEnergyGrade(int energyGrade) {
		this.energyGrade = energyGrade;
	}
	
	@Override
	public String toString() {
		String str = "\n제조사: " + maker+
				"\n보증기간: "+ guarantee+
				"\n등급: " + energyGrade; 
		return super.toString() + str;
	}
	
}
