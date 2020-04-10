package com.homeminus.view;

import java.util.ArrayList;
import java.util.Scanner;

import com.homeminus.dto.*;

public class ProductView {
	//입력, 출력 작업은 모두 이 클래스에서 처리 
	private Scanner scan = new Scanner(System.in);
	
	//타이틀과 메인 메뉴를 출력하는 메소드 작성
	public void showMainMenu() {
		System.out.println("*** 홈마이너스 마트 제품 관리 프로그램 ***");
		System.out.println("==============================");
		System.out.println("메뉴>");
		System.out.println("1. 제품 등록");
		System.out.println("2. 제품 출력");
		System.out.println("3. 제품 검색");
		System.out.println("4. 제품 수정");
		System.out.println("5. 제품 삭제");
		System.out.println("0.종료");
		System.out.print("선택>");			
	}
	//서브 타이틀과 서브메뉴의 번호를 입력받아서 해당 서브메뉴를 출력한다.
	public void showSubMenu (String title,int m) {
		System.out.println();
		System.out.println(title);
		System.out.println("==============================");
		System.out.println("메뉴>");
		
		switch(m) {
		case 1: //전체 출력
			System.out.println("1.가전제품");
			System.out.println("2.생필품");
			System.out.println("3.식품");
			System.out.println("0.돌아가기");			
			break;
		case 2://출력 서브 메뉴
			System.out.println("1. 전체 출력");
			System.out.println("2. 카테고리별 출력");
			System.out.println("0. 돌아가기");
			break;
		case 3://삭제 서브 메뉴
			System.out.println("1. 전체 삭제");
			System.out.println("2. 부분 삭제");
			System.out.println("0. 돌아가기");
			break;
		}
		
		//모든 서브 메뉴에서 공통으로 출력될 내용.
		System.out.println("==============================");
		System.out.print("선택>>");
	}
	
//	public void showPrintSubTitle () {
//		System.out.println("<<제품 출력>>");
//		System.out.println("==========");
//		System.out.println("1. 전체 출력");
//		System.out.println("2. 카테고리별 출력");
//		System.out.println("0. 돌아가기");
//	}
	

	////////////////////////////////////////////////////////// 여기까지 메뉴처리 부분
	
	public int inputNum() {
		//스캐너의 문제해결을 위해 문자열로 받아서 정수형으로 바꾸었음.
		int num = -1;							//아래이유와 같음.     //num -1 str null
		String str = scan.nextLine();							  //num -1 str "1"
								
		
		if(!str.equals("")){					//공백이 들어왔을때 잘못입력하셨습니다를 호출하기위함
			num=Integer.parseInt(str);							  //num 1  str "1"

		}
		
		return num;												  //num값 리턴

	}
	
	public String inputStr(String str/*검색이름*/) {
		System.out.print(str);    //ex)제품 검색 이름
				
		return scan.nextLine();   //ex)주걱
	}
	
	public void inputProduct(Product p) { //업캐스트 다운캐스트
		//공통부분 입력 처리
		System.out.print("제품명: ");
		p.setName(scan.nextLine());
		System.out.print("가격: ");
		p.setPrice(inputNum());
		System.out.print("수량: ");
		p.setAmount(scan.nextInt());;
		System.out.print("생산국: ");
		p.setMade(scan.nextLine());
		System.out.print("생산일자: ");
		p.setMday(scan.nextLine());
		//각 카테고리 제품별 입력 처리
		if(p instanceof ElectProduct) {
			ElectProduct ep = (ElectProduct)p;  //1
			System.out.println("제조사:");
			ep.setMaker(scan.nextLine());//3
			//((ElectProduct)p).setMaker(scan.nextLine()); //1,3 을 줄여서 만든거
			System.out.println("보증기간: ");
			ep.setGuarantee(scan.nextInt());
			System.out.println("등급: ");
			ep.setEnergyGrade(scan.nextInt());
			
			
		}
		else if(p instanceof LifeProduct) {
			LifeProduct lp = (LifeProduct)p;
			System.out.println("제조사");
			lp.setMaker(scan.nextLine());
			System.out.println("용도");
			lp.setUsage(scan.nextLine());
			System.out.println("재활용");
			String yesno = scan.nextLine();
			if(yesno.equals("y")) {
				lp.setRecycle(true);
			}
			else {
				lp.setRecycle(false);
			}			
		}
		else{
			FoodProduct fp = (FoodProduct)p;
			System.out.println("생산지 유통기한 종류");
			fp.setOrigin(scan.nextLine());
			System.out.println("유통기한");
			fp.setPeriod(scan.nextInt());
			System.out.println("종류");
			fp.setKind(scan.nextLine());
		}
	}
	
	public int updateNum() {
		System.out.println("변경 수량: ");
		
		int uNum = inputNum();
		
		return uNum;
	}
///////////////////////////////////////여기까지 입력 처리 부분
	public void printMsg (int m) {
		
		switch(m) {
		case 0:
			System.out.println("종료합니다.");
			break;
		case 1:
			System.out.println("이전 메뉴로 돌아갑니다.");
			break;
		case 2:
			System.out.println("메뉴입력이 잘못되었습니다.");
			break;
		case 3:
			System.out.println("데이터가 없습니다.");
			break;
		case 4:
			System.out.println("저장이 완료되었습니다.");
			break;
		case 5:
			System.out.println("삭제가 완료되었습니다.");
			break;
		case 6:
			System.out.println("검색결과가 없습니다.");
			break;
		case 7:
			System.out.println("저장에 실패했습니다.");
			break;
		case 8:
			System.out.println("삭제에 실패했습니다.");
			break;
		}
	}
	
	//전체 출력 및 카테고리 출력용 메소드
	//파라미터 : 전체 제품 목록, 카테고리 별 번호
	
	public void printProduct(ArrayList<Product> pList,int c) {
		int cnt =0; //카테고리별 출력 시 제품 개수 카운트

		for(Product p : pList) {
			switch(c) {
			case 0: //전체출력
			case 1:	//가전출력
				if(p instanceof ElectProduct) {
					System.out.println(p);
					cnt++;//카테고리별로 제품이 있나없나 확인하기위한것
				}
				if(c != 0) {  //전체출력일경우 break 스킵.
					break;
				}
			case 2: //생필품출력
				if(p instanceof LifeProduct) {
					System.out.println(p);
					cnt++;
				}
				if(c != 0) {  //전체출력일경우 break 스킵.
					break;
				}
			case 3: //식품출력
				if(p instanceof FoodProduct) {
					System.out.println(p);
					cnt++;
				}
				if(c != 0) {  //전체출력일경우 break 스킵.
					break;
				}
			}

		}

		if(cnt == 0) {
			System.out.println("해당 제품이 없습니다.");
		}
	}
	
	public void printSearchProduct (Product p) {
		System.out.println(p);
	}
	
//	public void ddd (Product p) {
//		p.setAmount(scan.nextInt());
//		//리턴은 내가 그값을 이후에 써야될때 이부분은 단순저장
//	}
}
