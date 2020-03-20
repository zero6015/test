package cal;

import java.util.Scanner;

public class Calendar {
	//�Է� �޼ҵ忡�� ���������� ����ϴ� ��ĳ��
	Scanner scan = new Scanner(System.in);
	//�Է� �κ�
	// ����, ��
	public int yearInput() {
		System.out.print("���� : ");
		int year = scan.nextInt();
		return year;
	}
	
	public int monthInput() {
		System.out.print("�� : ");
		int month = scan.nextInt();
		return month;
	}
	//�Էºκ� �޼ҵ尡 ������ �Ȱ��ƿ�~ �ϳ��� �޼ҵ�� ��ġ�� �;��~ (inputData �޼ҵ� ����� �ֱ�)
	public int inputData(String str) {
		System.out.println(str + " : ");
		int num = scan.nextInt();
		return num;
	}
	
	
	//��� �κ�
	// ��ü �ϼ�
	public int totalDays(int year, int month) {
		int total = 0;
		
		//�Է��� ������ ���� 12�� 31�ϱ��� ���
		for(int i = 1; i < year; i++) {
			total += 365;
			
			if(leapYear(i)) {
				total++;
			}
		}
		
		//�Է��� ���� ���� ������ ������ ���
		for(int j = 1; j < month; j++) {
			total += dayOfMonth(j, year);
		}
		
		return total;
	}
	
	// ���� ����
	public boolean leapYear(int year) {
		if((year % 4 == 0) && (year % 100 != 0) ||
			(year % 400 == 0)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	// ���� ���� ����
	public int startDay(int total) {
		int start = total % 7;
		return start;
	}
	
	// ���� �ϼ�
	public int dayOfMonth(int month, int year) {
		int days = 0;
		
		if(month==4 || month==6 || month==9 || month==11) {
			days = 30;
		}
		else if(month == 2) {
			if(leapYear(year)) {
				days = 29;
			}
			else {
				days = 28;
			}
		}
		else {
			days = 31;
		}
		
		return days;
	}
	
	//��� �κ�
	// �޷� Ÿ��Ʋ(���, ����)
	public void printMonthTitle(int year, int month) {
		System.out.println();	//���� ���� ����ֱ�
		System.out.println(year + "��\t\t\t\t\t\t" + month + "��");
		System.out.println("===================================================");
		System.out.println("��\t��\tȭ\t��\t��\t��\t��");
		System.out.println("===================================================");
	}
	
	// �� ����
	public void printBody(int start, int year, int month) {
		int cnt = 0;	//7��° �� ���� �ٹٲ��� ���� ī��Ʈ(���� ��µ� �ϳ��� ���� ��Ŵ)
		
		//���Ͽ� �ش��ϴ� ��ĭ ó��
		for (int i = 0; i <= start; i++) {//�������� �ڿ� ������ �ᵵ ��!!!
			if (start == 6) {//ù���� ���� ���� ���� �ʰ� ����
				break;
			}
			System.out.print("\t");
			cnt++;
		}
		for (int j = 1; j <= dayOfMonth(month, year) ; j++) {
			System.out.printf("%2d", j);
			cnt++;
			if (cnt % 7 == 0) {
				System.out.println();
			}
			else {
				System.out.print("\t");
			}
		}
	}
}






//package cal;
//import java.util.Scanner;
//
//public class Calendar {
//
//	public static void main(String[] args) {
//		
//		Scanner scan = new Scanner(System.in);
//		
//		int year = 0, month = 0;
//		int totalDay = 0;
//		int dayOfMonth = 0;
//		int startDay = 0;
//		
//		System.out.println("������ ���� �Է��ϼ���.");
//		System.out.print("���� : ");
//		year = scan.nextInt();
//		System.out.print("�� : ");
//		month = scan.nextInt();
//		
//		//--------------------------------------------------------------
//		
//		for(int i = 1; i < year; i++) {
//			totalDay += 365;
//			
//			if(((i % 4) == 0) && ((i % 100) != 0) || ((i % 400) == 0)) {
//				totalDay++;
//			}
//		}
//		
//		for(int j = 1; j < month; j++) {
//			if(j == 4 || j == 6 || j == 9 || j == 11) {
//				totalDay += 30;
//			}
//			else if(j == 2) { 
//				if(((year % 4) == 0) && ((year % 100) != 0) || ((year % 400) == 0)) {				
//					totalDay += 29;
//				}
//				else {
//					totalDay += 28;
//				}
//			}
//			else {
//				totalDay += 31;
//			}
//		}
//		
//		startDay = totalDay % 7;
//		
//		//--------------------------------------------------------------
//				
//		if(month == 4 || month == 6 || month == 9 || month == 11) {
//			dayOfMonth = 30;
//		}
//		else if(month == 2) {
//			if(((year % 4) == 0) && ((year % 100) != 0)
//					|| ((year % 400) == 0)) {				
//				dayOfMonth = 29;
//			}
//			else {
//				dayOfMonth = 28;
//			}
//		}
//		else {
//			dayOfMonth = 31;
//		}
//		
//		//--------------------------------------------------------------
//		
//		System.out.println();
//        System.out.println(year + "��\t\t\t\t\t\t" + month + "��");
//        System.out.println("===================================================");
//        System.out.println("��\t��\tȭ\t��\t��\t��\t��");
//        System.out.println("===================================================");
//
//        //--------------------------------------------------------------
//		
//        int cnt = 0;
//        
//        for(int k = 0; k <= startDay; k++) {
//        	if(startDay == 6)
//        		break;
//        	System.out.print("\t");
//        	cnt++;
//        }
//        
//        //--------------------------------------------------------------
//		
//        for(int l = 1; l <= dayOfMonth; l++) {
//        	System.out.printf("%2d", l);
//        	cnt++;
//        	if(cnt % 7 == 0) {
//        		System.out.println();
//        	}
//        	else {
//        		System.out.print("\t");
//        	}
//        }
//        
//	}//main ��
//
//}//Ŭ���� ��
