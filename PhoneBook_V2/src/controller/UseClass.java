package controller;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

import dto.PhoneInfo;

public class UseClass {
	
	//저장 공간(필드) : 연락처 정보 저방
	//컬랙션 프레임워크 중 ArrayList 사용 -> 크기 제한이 없음(원하는 만큼 입력 가능)
//	방법1)
	private static ArrayList<PhoneInfo> pList = new ArrayList<PhoneInfo>();
//	방법2)
//	private static PhoneInfo pListArr[] = new PhoneInfo[10];
//	방법3)
//	private static ArrayList<String> strArr = new ArrayList<String>();
	
	//Array 만드는 형식
	//ArrayList<객체> 이름 = new ArrayList<객체>()ㅣ;
	
	//입력, 출력
	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
//		메인이 하는 일
//		1. 타이틀 출력
//		2. 메뉴 출력
//		3. 메뉴별로 분기 처리
//		1~3번을 종료가 되기 전까지 반복.
		int menu = 0;
		
		while (true) {
			System.out.println();
			System.out.println("연락처 프로그램");
			System.out.println("메뉴를 선택하세요");
			System.out.println("---------------------");
			System.out.println("1. 데이터 출력");
			System.out.println("2. 데이터 검색");
			System.out.println("3. 데이터 삭제");
			System.out.println("0. 종료");
			System.out.println("---------------------");
			System.out.print("선택 : ");
			menu = Integer.parseInt(scan.nextLine());
			
			//종료 처리
			if(menu == 0) {
				System.out.println("프로그램 종료");
				break;
			}
			
			switch (menu) {
			case 1://데이터입력 기능 -> 메소드로 생성
				inputData();
				break;
			case 2://데이터검색 기능 -> 메소드로 생성
				selectData();
				break;
			case 3://데이터삭제 기능 -> 메소드로 생성
				
				break;

			default:
				break;
			}
			
			
			
			
			
			
		}
	}

//	selectData 메소드 for문 처리 방식1)
	private static void selectData() {
//		데이터 검색: 하나씩 비교 -> 이름 비교해서 전화번호 , 생일까지 출력
//		ArrayList에 저장된 인스턴스의 name필드와 비교 -> 같으면 그 인스턴스의 모든 정보 출력
//		문자열의 비교 : equals(이름);
		
		//데이터가 없다면 검색 과정을 모두 처리할 필요가 없음
		if (pList.size() == 0) {
			//저장된 인스턴스가 없음.
			System.out.println("입력된 데이터가 없음니다.");
			return;	//메소드 중간에서 메소드를 중단하고 다시 돌아가야할 때 'return'사용 
		}
		
		//검색(찾고자 하는) 이름을 입력 받는다.
		System.out.println("검색 이름 : ");
		String sname = scan.nextLine();
		boolean isSearch = false;
		
		//ArrayList의 첫번째 인스턴스의 name 필드부터 마지막 인스턴스의 name 필드와 sname이 같은지 비교
		for (PhoneInfo p : pList) {
			if (sname.equals(p.getName())) {
				//검색 성공 -> 출력
				p.showPhoneInfo();
				isSearch = true;	//검색 결과가 있을 경우 true
				//더 이상 검색할 필요 없음 -> 반복문 종료
				break;
			}
		}
		
		if(isSearch == false) {//검색결과가 있을 경우 출력하지 않음
			System.out.println("검색 결과 없음.");
		}
		
	}
	
//	selectData 메소드 for문 처리 방식2)
//	private static void selectData2() {
//
//		System.out.println("검색 이름 : ");
//		String sname = scan.nextLine();
//		int j;
//		
//		for (int j = 0; j < pList.size(); j++) {
//			PhoneInfo p = pList.get(j);
//			if (sname.equals(p.getName())) {
//				p.showPhoneInfo();
//				break;
//			}
//		}
//		
//		if(j == pList.size()) {//검색결과가 있을 경우 출력하지 않음
//			System.out.println("검색 결과 없음.");
//		}
//		
//	}
	
	
	private static void inputData() {
//		ArrayList에 값을 저장하는 방법
//		1. 저장하고자하는 데이터를 저장하는 인스턴스 생성
		PhoneInfo pInfo = new PhoneInfo();
//		2. 그 인스턴스에 데이터 입력
		System.out.print("이름 : ");
		pInfo.setName(scan.nextLine());
		System.out.print("전화번호 : ");
		pInfo.setPhoneNum(scan.nextLine());
		System.out.print("생일 : ");
		pInfo.setBirth(scan.nextLine());
		//		3. ArrayList 인스턴스를 추가
		pList.add(pInfo);
		
	}
	

}
