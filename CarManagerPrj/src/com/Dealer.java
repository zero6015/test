package com;

public class Dealer {
	CarClass car1 = new CarClass();
	
	//메소드 유형 1. 매개변수와 리턴사용
	public int add(int a, int b) {
		int result = a + b;
		return result;
	}
	//매개변수로 배열 사용
	public int add2(int a[]) {
		int result = a[0] + a[1];
		return result;
	}
	
}
