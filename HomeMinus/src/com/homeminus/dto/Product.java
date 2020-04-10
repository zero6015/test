package com.homeminus.dto;

public class Product {	 //부모클래스
	private String name; //제품명
	private int price;   //가격
	private int amount;  //수량 
	private String made; //생산국
	private String mday; //제조년월
	
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
	
	
	@Override  //재정의 했다는 것을 나타내는 어노테이션
		public String toString() {
			//제품 클래스의 필드들을 출력하도록 작성
			String str = "===============\n"
					    +"제품명:"+ name
					    +"\n가격:" + price
					    +"\n수량:" + amount
					    +"\n국가:" + made
					    +"\n일자:" + mday+"\n";
			
			
			return str;
		}
	
	
	
	
}//메인종료
