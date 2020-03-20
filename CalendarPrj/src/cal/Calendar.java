package cal;

import java.util.Scanner;

public class Calendar {
	//입력 메소드에서 공통적으로 사용하는 스캐너
	Scanner scan = new Scanner(System.in);
	//입력 부분
	// 연도, 월
	public int yearInput() {
		System.out.print("연도 : ");
		int year = scan.nextInt();
		return year;
	}
	
	public int monthInput() {
		System.out.print("월 : ");
		int month = scan.nextInt();
		return month;
	}
	//입력부분 메소드가 구조가 똑같아요~ 하나의 메소드로 합치고 싶어요~ (inputData 메소드 만들어 주기)
	public int inputData(String str) {
		System.out.println(str + " : ");
		int num = scan.nextInt();
		return num;
	}
	
	
	//계산 부분
	// 전체 일수
	public int totalDays(int year, int month) {
		int total = 0;
		
		//입력한 연도의 전년 12월 31일까지 계산
		for(int i = 1; i < year; i++) {
			total += 365;
			
			if(leapYear(i)) {
				total++;
			}
		}
		
		//입력한 월의 전월 마지막 날까지 계산
		for(int j = 1; j < month; j++) {
			total += dayOfMonth(j, year);
		}
		
		return total;
	}
	
	// 윤년 여부
	public boolean leapYear(int year) {
		if((year % 4 == 0) && (year % 100 != 0) ||
			(year % 400 == 0)) {
			return true;
		}
		else {
			return false;
		}
	}
	
	// 월의 시작 요일
	public int startDay(int total) {
		int start = total % 7;
		return start;
	}
	
	// 월의 일수
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
	
	//출력 부분
	// 달력 타이틀(년월, 요일)
	public void printMonthTitle(int year, int month) {
		System.out.println();	//위에 한줄 띄어주기
		System.out.println(year + "년\t\t\t\t\t\t" + month + "월");
		System.out.println("===================================================");
		System.out.println("일\t월\t화\t수\t목\t금\t토");
		System.out.println("===================================================");
	}
	
	// 월 일자
	public void printBody(int start, int year, int month) {
		int cnt = 0;	//7번째 날 다음 줄바꿈을 위한 카운트(공백 출력도 하나씩 증가 시킴)
		
		//요일에 해당하는 빈칸 처리
		for (int i = 0; i <= start; i++) {//증감식을 뒤에 여러개 써도 됨!!!
			if (start == 6) {//첫줄이 공백 줄이 되지 않게 막기
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
//		System.out.println("연도와 월을 입력하세요.");
//		System.out.print("연도 : ");
//		year = scan.nextInt();
//		System.out.print("월 : ");
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
//        System.out.println(year + "년\t\t\t\t\t\t" + month + "월");
//        System.out.println("===================================================");
//        System.out.println("일\t월\t화\t수\t목\t금\t토");
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
//	}//main 끝
//
//}//클래스 끝
