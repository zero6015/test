package com;

public class CarClass {
	//	//���� ����
	//	String modelName;	//default ���������� -> �� ���� ��Ű�� �ȿ����� ��� ����
	//	public int price;
	//	 
	//	//���� ����
	//	//Ÿ�̾�
	//	Tire t1, t2, t3, t4; //CarClass�� Tire Ŭ������ ������.
	//	

	//03.17
	private int speed;//�ӵ���
	private String model; //�𵨸�
	private String company; // ������
	private int door;// ��¦��

	//��� ���� (�ʵ�)�� ���� setter/getter �޼ҵ� �ۼ�
	// ��Ģ �ƴ� ��Ģ
	// 1.public ������ ���
	// 2.�̸��� ���� �� �տ� set����.
	//3. ���� �̸��� ù���ڸ� �빮�ڷ� �Ͽ� set/get �ڿ� ����.
	public void setSpeed(int s) { //����ִ´� (setter)
		speed = s;
	}
	public int getSpeed() {//�����´�.(getter)
		return speed;
	}



	public void speedUp(int s) {
		speed = s;
		if(speed>200) {
			speed=200;
		}
	}
	
	//getter/setter �ڵ�����
	//this : �ν��Ͻ��� �ּҸ� �����ϰ�, �ʵ峻�� �������� ��Ȯ�ϰ� ����ϱ� ���� �ٿ���
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
