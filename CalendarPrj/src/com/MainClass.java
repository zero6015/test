package com;

import cal.Calendar;

public class MainClass {

	public static void main(String[] args) {
		//입력
		int year, month;
		
		Calendar calendar = new Calendar();
		System.out.println("연도와 날짜를 입력하세요.");
//		year = calendar.yearInput();
//		month = calendar.monthInput();
		year = calendar.inputData("연도");
		month = calendar.inputData("월");
		
		
		//날짜 계산
		int totalDay = calendar.totalDays(year, month);
		int startDay = calendar.startDay(totalDay);
						
		//출력
		calendar.printMonthTitle(year, month);
		calendar.printBody(startDay, year, month);
	}

}
