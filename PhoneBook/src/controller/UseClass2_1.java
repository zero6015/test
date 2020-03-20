package controller;

import java.util.Scanner;

import dto.PhoneInfo;

//전화번호부 만들어보기 교수님이랑 같이 해본거2222 - 오버로딩 활용해서 UseClass2 수정해보기
public class UseClass2_1 {

	private static PhoneInfo pInfo = new PhoneInfo();
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		PhoneInfo pInfo2 = new PhoneInfo();
		
		while (true) {
			System.out.println("메뉴를 선택하세요.");
			System.out.println("----------------");
			System.out.println("1.데이터 입력");
			System.out.println("2.데이터 입력(전달방식)");
			System.out.println("0.프로그램 종료");
			System.out.println("----------------");
			System.out.print("선택: ");
			

			
			int menu = Integer.parseInt(scan.nextLine());
			
			//종료 처리
			if (menu == 0) {
				System.out.println("프로그램이 종료되었습니다.");
				break;
			}
			
			switch (menu) {
			case 1://입력처리
				inputData();
				break;
			case 2://정보 인스턴스를 전달하여 입력처리 
				inputData(pInfo2);
				break;
			default://1,2번이 아닌 번호가 들어왔을 경우 처리
				System.out.println("잘못 입력하셨습니다.");
				break;
			}			
		}
		
	}//메인 메소드 끝
	
	private static void inputData() {
		//입력 받기
		System.out.print("이름: ");
		pInfo.setName(scan.nextLine());
		System.out.print("전화번호 : ");
		pInfo.setPhoneNum(scan.nextLine());
		System.out.print("생년월일 : ");
		pInfo.setBirth(scan.nextLine());
		
		//입력 내용 출력하기
		System.out.println("입력된 정보 출력...");
		pInfo.showPhoneInfo();
	}
	
	//오버로딩 : 같은 이름의 메소드를 여러개 만듦.
	private static void inputData(PhoneInfo p) {

		System.out.print("이름 : ");
		pInfo.setName(scan.nextLine());
		System.out.print("전화번호 : ");
		pInfo.setPhoneNum(scan.nextLine());
		System.out.print("생년월일 : ");
		pInfo.setBirth(scan.nextLine());
		
		//출력
		System.out.println("입력된 정보 출력...");
		System.out.println("name : " + p.getName());
		System.out.println("phone : " + p.getPhoneNum());
		System.out.println("birth : " + p.getBirth());
		
	}

}//클래스 끝























