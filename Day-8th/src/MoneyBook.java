import java.util.Scanner;

public class MoneyBook {

	public static void main(String[] args) {
//		팀 과제
//
//		가계부 프로그램 만들기
//		배열을 사용하여 가계부 프로그램을 만듭니다.
//		10개 내역을 작성하기
//		수입, 지출
//
//		잔액, 전체 수입 금액, 전체 지출 금액이 출력되도록.
//		전체 내역 출력(마지막에 잔액 출력)
//
//		입력 데이터
//		날짜, 금액, 수입/지출, (내역)
//
//		메뉴
//		1. 내역 등록
//		2. 전체 출력
//		3. 수입 출력
//		4. 지출 출력
//		5. 종료
		
		final int MAX = 2;
		
		String date[] = new String[MAX];
		int money[] = new int[MAX];	
		int inMoney[] = new int[MAX];	
		int outMoney[] = new int[MAX];	
		String List[] = new String[MAX];
		int balance = 0;
		int totalInMoney = 0;
		int totalOutMoney = 0;
		String totalList[] = new String[MAX];
		
		int select = 0; //메뉴 입력 저장 변수
		int input;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("-- 가계부 프로그램 --");
		
		while(true) {
			
			System.out.println("<< 메뉴 >>");
			System.out.println("1. 내역 등록");
			System.out.println("2. 전체 출력");
			System.out.println("3. 수입 출력");
			System.out.println("4. 지출 출력");
			System.out.println("5. 종료");
			System.out.print("선택 > ");
			select = scan.nextInt();
			
			
			if(select == 5) {
				System.out.println("종료합니다.");
				break;
			}
			
			
			switch (select) {//		날짜, 금액, 수입/지출, (내역)
			case 1:
				System.out.println("내역 등록");
			    for (int i = 0; i < MAX; i++) {
			    	System.out.println("--------------------");
			    	scan.nextLine();	//버퍼에 있는 엔터 제거 방법1) 
					System.out.print("날짜 : ");
					date[i] = scan.nextLine();
					System.out.print("금액 : ");
					money[i] = scan.nextInt();
					System.out.print("수입: 1번입력 /지출: 2번입력 : ");
					input = scan.nextInt();
					if(input == 1){
						inMoney[i] = money[i];
						totalInMoney += inMoney[i];
					}
					else if(input == 2){
						outMoney[i] = money[i];
						totalOutMoney += outMoney[i];
					}
//					System.out.print("수입 : ");
//					inMoney[i] = scan.nextInt();
//					System.out.print("지출 : ");
//					outMoney[i] = scan.nextInt();
					System.out.print("내역 : ");
					List[i] = scan.next();
			    }
				break;
				
			case 2:
				System.out.println("전체 출력");
			    for (int i = 0; i < MAX; i++) {
			    	System.out.println("--------------------");
					System.out.println("날짜 : " + date[i]);
				//	System.out.println("금액 : " + money[i]);
					System.out.printf("금액 : %,d원%n", money[i]);
				//	System.out.println("수입 : " + inMoney[i]);
					System.out.printf("지출 : %,d원%n", money[i]);
				//	System.out.println("지출 : " + outMoney[i]);
					System.out.printf("지출 : %,d원%n", money[i]);
					System.out.println("내역 : " + List[i]);
					System.out.println(); 
			    }
			    break;
			 case 3:
				 System.out.println();
				 System.out.println("수입 출력");
				 for (int i = 0; i < MAX; i++) {
					 System.out.printf("수입 금액 : %,d원%n", money[i]);
					 
				 }
				 System.out.println("전체 수입 금액 : " + totalInMoney);
				 break;
			 case 4:
				 System.out.println();
				 System.out.println("지출 출력");
				 for (int i = 0; i < MAX; i++) {
					 System.out.printf("지출 금액 : %,d원%n", outMoney[i]);
					 
				 }
				 System.out.printf("전체 지출 금액 : %,d원%n", totalOutMoney);
				 break;
			 case 5:
				 System.out.println("내역 출력");
				 for (int i = 0; i < MAX; i++) {
					 System.out.println("내역 출력 : "+ i + " " + totalList[i]);
				 }
				 break;
			default:
				break;
				
			}
			

			balance = totalInMoney - totalOutMoney;
			System.out.printf("잔액 : %,d원%n", balance);
			
			
		}
		
	}

}
