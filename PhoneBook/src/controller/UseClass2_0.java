package controller;

import java.util.Scanner;

import dto.PhoneInfo;

//전화번호부 만들어보기 교수님이랑 같이 해본거
public class UseClass2_0 {
	//한 인스턴스 여러 메소드에서 같이 쓰는 방법 1) 여러 메소드에서 인스턴스를 사용해야하기때문에 클래스 밑, 메소드 밖에 static멤버 생성해줌
	private static PhoneInfo pInfo = new PhoneInfo();//전역변수: 생성자는 일반적으로 다른 패키지에서 사용하기 때문에 생성자 앞에는 public 제어자를 붙여주는것이 정석
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		while (true) {
			System.out.println("메뉴를 선택하세요.");
			System.out.println("----------------");
			System.out.println("1.데이터 입력");
			System.out.println("2.프로그램 종료");
			System.out.println("----------------");
			System.out.print("선택: ");
			
			//*********대빵중요**********
			//문자열 -> 숫자 변환 방법
			// 정수 : Integer.parseInt("문자열:)
			
			int menu = Integer.parseInt(scan.nextLine());
			//Scanner의 문제: 숫자(정수,실수) 입력 후에 문자열을 받을 수 없다.
			//문자열을 받기 위해 숫자 입력 후 scan.nextLine()을 한번 사용한다.
			//또는 모든 입력을 문자열로 입력받고 해당 데이터로 변환한다
			
			//종료 처리
			if (menu == 2) {
				System.out.println("프로그램이 종료되었습니다.");
				break;
			}
			
			switch (menu) {
			case 1://입력처리
				inputData();
				break;

			default://1,2번이 아닌 번호가 들어왔을 경우 처리
				System.out.println("잘못 입력하셨습니다.");
				break;
			}			
		}
		
	}//메인 메소드 끝
	
	//입력 처리를 위한 메소드 (static을 붙여주는 이유 : main에서 이 메소드를 호출해서 사용할꺼기 때문에 static맴버는 static멤버만 호출할 수 있다.
	//즉, static 메소드는 static 멤버만 사용할 수 있기 때문에 static인 main메소드에서 호출하려면 static 메소드가 되어야함.
	private static void inputData() {
		//입력 받기
		System.out.print("이름 : ");
//		String name = scan.nextLine();
//		pInfo.setName(name);
		//위 두줄을 합쳐서 아래 한줄 처럼 줄여줄 수 있다!!
		pInfo.setName(scan.nextLine());
		System.out.print("전화번호 : ");
//		String phoneNum = scan.nextLine();
		pInfo.setPhoneNum(scan.nextLine());
		System.out.print("생년월일 : ");
//		String birth = scan.nextLine();
		pInfo.setBirth(scan.nextLine());
		
		//입력 내용 출력하기
		System.out.println("입력된 정보 출력...");
		pInfo.showPhoneInfo();
	}
	

}//클래스 끝
























