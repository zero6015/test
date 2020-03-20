package com;

public class CarClass {
	//	//고유 정보
	//	String modelName;	//default 접근제어자 -> 즉 같은 패키지 안에서만 사용 가능
	//	public int price;
	//	 
	//	//가변 정보
	//	//타이어
	//	Tire t1, t2, t3, t4; //CarClass는 Tire 클래스에 의존함.
	//	

	//03.17
	private int speed;//속도값
	private String model; //모델명
	private String company; // 제조사
	private int door;// 문짝수

	//모든 변수 (필드)를 위한 setter/getter 메소드 작성
	// 규칙 아닌 규칙
	// 1.public 제어자 사용
	// 2.이름을 지을 때 앞에 set으로.
	//3. 변수 이름의 첫글자를 대문자로 하여 set/get 뒤에 붙임.
	public void setSpeed(int s) { //집어넣는다 (setter)
		speed = s;
	}
	public int getSpeed() {//꺼내온다.(getter)
		return speed;
	}



	public void speedUp(int s) {
		speed = s;
		if(speed>200) {
			speed=200;
		}
	}
	
	//getter/setter 자동생성
	//this : 인스턴스의 주소를 저장하고, 필드내의 변수임을 명확하게 명시하기 위해 붙여줌
	public String getModel() {
		return model;
	}
	public void setModel(String model) {
		this.model = model;
	}
	public String getCompany() {
		return company;
	}
	public void setCompany(String company) {
		this.company = company;
	}
	public int getDoor() {
		return door;
	}
	public void setDoor(int door) {
		this.door = door;
	}


}
