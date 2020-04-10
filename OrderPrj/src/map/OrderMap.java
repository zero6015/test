package map;

import java.util.*;

public class OrderMap {

	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
		
		Map<String, Integer> dictionary =  new HashMap<String, Integer>();

		dictionary.put("플레인 와플", 2500);
		dictionary.put("크림 와플", 3500);
		dictionary.put("사과잼 와플", 4000);
		dictionary.put("아메리카노", 1800);
		dictionary.put("카페라떼", 2500);
		dictionary.put("레몬에이드", 3000);
		dictionary.put("크림 추가", 500);
		dictionary.put("사과잼 추가", 500);
		dictionary.put("감자튀김", 2000);
		
		Integer select = dictionary.get("플레인 와플");
		System.out.println("플레인 와플 가격 : " + select);
		
		while (true) {
			PrintMenu();
			int menu = scan.nextInt();
			
			//종료처리
			if(menu == 0) {
				break;
			}
			
			PrintSubMenu(menu);
			String smenu = scan.next();
			
			
			
		}
		
		

	}

	private static void PrintMenu() {
		System.out.println("====와플 주문기====");
		System.out.println("1. 와플 선택");
		System.out.println("2. 음료 선택");
		System.out.println("3. 사이드 선택");
		System.out.println("0. 종료");
		System.out.print("메뉴 선택 : ");		
	}
	
	private static void PrintSubMenu(int m) {
		System.out.println();

		switch (m) {
		case 1:
			System.out.println();
			System.out.println("====와플 선택====");
			System.out.println("1. 플레인 와플");
			System.out.println("2. 크림 와플");
			System.out.println("3. 사과잼 와플");
			System.out.println("0. 종료");
			System.out.print("와플 선택 : ");	
			break;
		case 2:
			System.out.println();
			System.out.println("====음료 선택====");
			System.out.println("1. 아메리카노");
			System.out.println("2. 카페라떼");
			System.out.println("3. 레몬에이드");
			System.out.print("음료 선택 : ");
			break;
		case 3:
			System.out.println();
			System.out.println("====사이드 선택====");
			System.out.println("1. 크림 추가");
			System.out.println("2. 사과잼 추가");
			System.out.println("3. 감자튀김");
			System.out.print("사이드 선택 : ");	
			break;
		default:
			System.out.println("잘못 입력하셨습니다.");
			return;
		}
		
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	private static void PrintWaffleMenu() {
		System.out.println("====와플 선택====");
		System.out.println("1. 플레인 와플");
		System.out.println("2. 크림 와플");
		System.out.println("3. 사과잼 와플");
		System.out.print("와플 선택 : ");	
	}
	
	private static void PrintDrinkMenu() {
		System.out.println("====음료 선택====");
		System.out.println("1. 아메리카노");
		System.out.println("2. 카페라떼");
		System.out.println("3. 레몬에이드");
		System.out.print("음료 선택 : ");	
	}
	
	private static void PrintSideMenu() {
		System.out.println("====음료 선택====");
		System.out.println("1. 아메리카노");
		System.out.println("2. 카페라떼");
		System.out.println("3. 레몬에이드");
		System.out.print("음료 선택 : ");	
	}
}

