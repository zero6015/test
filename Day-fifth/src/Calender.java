import java.time.Year;
import java.util.Scanner;

public class Calender {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int year = 0, month = 0;
		int totalDay = 0;
		int dayOfMonth = 0;
		int startDay = 0;
		
		System.out.println("������ ���� �Է��ϼ���.");
		System.out.print("���� : ");
		year = scan.nextInt();
		System.out.print("�� : ");
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
        System.out.println(year + "��\t\t\t\t\t\t" + month + "��");
        System.out.println("===================================================");
        System.out.println("��\t��\tȭ\t��\t��\t��\t��");
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
//			�� if���� �Ʒ�ó�� �ٲ��� �� ����
//        	if(cnt == 6
//        			0) {
//        		System.out.println();
//        		cnt = 0;
//        	}
        	else {
        		System.out.print("\t");
        	}
        }
        
		
		
//		����
//		Scanner scan = new Scanner(System.in);
//		
//		System.out.println("������ ���� �Է��ϼ���.");
//		System.out.println("���� : ");
//		int year = scan.nextInt();
//		System.out.println("�� : ");
//		int month = scan.nextInt();
//		int totalday = 0, dayofmonth;
//		int i = 1;
//		
//		for(; i < year; i++) {
//			totalday += 365;
//			//1����� ���⿡ �Ϸ羿 ��¥ �߰�
//			if(((i % 4) == 0) && ((i % 100) != 0) || ((i % 400) == 0)){
//				totalday++;
//			}
//		}
//		System.out.println("��ü ��¥��: " + totalday);
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
//		System.out.println("��ü ��¥��: " + totalday);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	}//main ��

}//Ŭ���� ��
