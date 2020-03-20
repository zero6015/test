package controller;

import java.util.Scanner;

import dto.PhoneInfo;

public class UseClass {

	public static void main(String[] args) {
//1		//2사람 연락처 입력
//		PhoneInfo pInfo1 = new PhoneInfo("홍길동", "1111-2222", "90/08/30");
//		PhoneInfo pInfo2 = new PhoneInfo("전우치", "2222-3333");
//		
//		//출력
//		pInfo1.showPhoneInfo();
//		pInfo2.showPhoneInfo();

//2		//2사람의 정보를 입력받아서 저장
//		Scanner scan = new Scanner(System.in);
//		//첫번째 사람 정보
//		String name = scan.nextLine();
//		String phoneNum = scan.nextLine();
//		String birth = scan.nextLine();
//		
//		PhoneInfo pInfo3 = new PhoneInfo(name, phoneNum, birth);
//		
//		//두번째 사람 정보
//		name = scan.nextLine();
//		phoneNum = scan.nextLine();
//		
//		PhoneInfo pInfo4 = new PhoneInfo(name, phoneNum);
//		
//		System.out.println("-----------------------------");
//		pInfo3.showPhoneInfo();
//		System.out.println("-----------------------------");
//		pInfo4.showPhoneInfo();
		
//3 교수님이 시키신 전화번호부 만들어보기(showPhoneInfo 메소드 말고 getter/setter로 코딩해보기)
		while(true) {

			bodyPrint();
			
			Scanner scan = new Scanner(System.in);
			int input = scan.nextInt();

			//프로그램 종료
			if (input == 2) {
				System.out.println("프로그램이 종료되었습니다.");
				break;
			}
			else if(input == 1) {
				scan.nextLine();
				System.out.print("이름: ");
				String name = scan.nextLine();
				System.out.print("전화번호: ");
				String phoneNum = scan.nextLine();
				System.out.print("생년월일: ");
				String birth = scan.nextLine();
				
				PhoneInfo pInfo = new PhoneInfo();
				
				pInfo.setName(name);
				pInfo.setPhoneNum(phoneNum);
				pInfo.setBirth(birth);
				
//				pInfo.showPhoneInfo();
				System.out.println();
				System.out.println("name : " + pInfo.getName());
				System.out.println("phone : " + pInfo.getPhoneNum());
				System.out.println("birth : " + pInfo.getBirth());
				System.out.println();
			}
		}
	}
	
	public static void bodyPrint() {
		System.out.println("메뉴를 선택하세요.");
		System.out.println("----------------");
		System.out.println("1.데이터 입력");
		System.out.println("2.프로그램 종료");
		System.out.println("----------------");
		System.out.print("선택: ");
	}
	
	
	
}

























