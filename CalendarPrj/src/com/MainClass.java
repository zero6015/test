package com;

import cal.Calendar;

public class MainClass {

	public static void main(String[] args) {
		//�Է�
		int year, month;
		
		Calendar calendar = new Calendar();
		System.out.println("������ ��¥�� �Է��ϼ���.");
//		year = calendar.yearInput();
//		month = calendar.monthInput();
		year = calendar.inputData("����");
		month = calendar.inputData("��");
		
		
		//��¥ ���
		int totalDay = calendar.totalDays(year, month);
		int startDay = calendar.startDay(totalDay);
						
		//���
		calendar.printMonthTitle(year, month);
		calendar.printBody(startDay, year, month);
	}

}
