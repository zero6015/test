import java.time.Year;
import java.util.Scanner;

public class Calender {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int year = 0, month = 0;
		int totalDay = 0;
		int dayOfMonth = 0;
		int startDay = 0;
		
		System.out.println("연도와 월을 입력하세요.");
		System.out.print("연도 : ");
		year = scan.nextInt();
		System.out.print("월 : ");
		month = scan.nextInt();
		
		//--------------------------------------------------------------
		
		for(int i = 1; i < year; i++) {
			totalDay += 365;
			
			if(((i % 4) == 0) && ((i % 100) != 0) || ((i % 400) == 0)) {
				totalDay++;
			}
		}
		
		for(int j = 1; j < month; j++) {
			if(j == 4 || j == 6 || j == 9 || j == 11) {
				totalDay += 30;
			}
			else if(j == 2) { 
				if(((year % 4) == 0) && ((year % 100) != 0) || ((year % 400) == 0)) {				
					totalDay += 29;
				}
				else {
					totalDay += 28;
				}
			}
			else {
				totalDay += 31;
			}
		}
		
		startDay = totalDay % 7;
		
		//--------------------------------------------------------------
				
		if(month == 4 || month == 6 || month == 9 || month == 11) {
			dayOfMonth = 30;
		}
		else if(month == 2) {
			if(((year % 4) == 0) && ((year % 100) != 0)
					|| ((year % 400) == 0)) {				
				dayOfMonth = 29;
			}
			else {
				dayOfMonth = 28;
			}
		}
		else {
			dayOfMonth = 31;
		}
		
		//--------------------------------------------------------------
		
		System.out.println();
        System.out.println(year + "년\t\t\t\t\t\t" + month + "월");
        System.out.println("===================================================");
        System.out.println("일\t월\t화\t수\t목\t금\t토");
        System.out.println("===================================================");

        //--------------------------------------------------------------
		
        int cnt = 0;
        
        for(int k = 0; k <= startDay; k++) {
        	if(startDay == 6)
        		break;
        	System.out.print("\t");
        	cnt++;
        }
        
        //--------------------------------------------------------------
		
        for(int l = 1; l <= dayOfMonth; l++) {
        	System.out.printf("%2d", l);
        	cnt++;
        	if(cnt % 7 ==
        			0) {
        		System.out.println();
        	}
//			위 if문을 아래처럼 바꿔줄 수 있음
//        	if(cnt == 6
//        			0) {
//        		System.out.println();
//        		cnt = 0;
//        	}
        	else {
        		System.out.print("\t");
        	}
        }
        
		
		
//		연습
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("연도와 월을 입력하세요.");
//		System.out.println("연도 : ");
//		int year = scan.nextInt();
//		System.out.println("월 : ");
//		int month = scan.nextInt();
//		int totalday = 0, dayofmonth;
//		int i = 1;
//		
//		for(; i < year; i++) {
//			totalday += 365;
//			//1년부터 윤년에 하루씩 날짜 추가
//			if(((i % 4) == 0) && ((i % 100) != 0) || ((i % 400) == 0)){
//				totalday++;
//			}
//		}
//		System.out.println("전체 날짜수: " + totalday);
//		
//		for (int j = 1; j < month; j++) {
//			if(j == 4 || j == 6 || j == 9 || j == 11) {
//				totalday += 30;
//			}
//			else if(j == 2) {
//				if(((i % 4) == 0) && ((i % 100) != 0) || ((i % 400) == 0)){
//					totalday += 29;
//				}
//				else {
//					totalday += 28;
//				}
//			}
//			else {
//				totalday += 31;
//			}
//		}
//
//		System.out.println("전체 날짜수: " + totalday);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//main 끝

}//클래스 끝
