import java.util.Scanner;

public class StudentManager {

	public static void main(String[] args) {
//1		학생 관리 프로그램
//		1. 이름
//		2. 학과
//		3. 연락처
//		4. 학번
//		5. 학점
		
		final int MAX = 3;	//
		
		String names[] = new String[MAX];
		String major[] = new String[MAX];	
		String phone[] = new String[MAX];	
		String sNumber[] = new String[MAX];	
		float avg[] = new float[MAX];	
		int select = 0; //메뉴 입력 저장 변수
		
		Scanner scan = new Scanner(System.in);

		System.out.println("-- 학생 관리 프로그램 --");
		
		while(true) {
			
			//아래 출력기능을 하나의 새로운 메소드로 만들어서 호출해줘도 됨. ex) select = printMenu();
			System.out.println("<< 메뉴 >>");
			System.out.println("1. 정보 입력");
			System.out.println("2. 정보 출력");
			System.out.println("3. 종료");
			System.out.print("선택 > ");
			select = scan.nextInt();
//방법2)	String selstr = scan.nextLine();
//			select = Integer.parseInt(selstr); //문자열 -> 정수
			
			
			//먼저 처리할 메뉴 : 종료
			if(select == 3) {
				System.out.println("종료합니다.");
				break;
			}
			
			switch (select) {
			case 1://입력메뉴
				//서브 타이틀 출력
				System.out.println("학생 등록");
			    for (int i = 0; i < MAX; i++) {
			    	System.out.println("--------------------");
			    	scan.nextLine();	//버퍼에 있는 엔터 제거 방법1) 
					System.out.print("이름 : ");
					names[i] = scan.nextLine();
					System.out.print("학과 : ");
					major[i] = scan.nextLine();
					System.out.print("연락처 : ");
					phone[i] = scan.nextLine();
					System.out.print("학번 : ");
					sNumber[i] = scan.nextLine();
					System.out.print("평균 : ");
					avg[i] = scan.nextFloat();
//방법3)			String fStr = scan.nextLine();
//					avg[i] = Float.parseFloat(fStr);  //문자열 -> 실수
				}
				break;
			case 2://출력메뉴
				System.out.println("학생 정보 출력");
			    for (int i = 0; i < MAX; i++) {
			    	System.out.println("--------------------");
					System.out.println("이름 : " + names[i]);
					System.out.println("학과 : " + major[i]);
					System.out.println("연락처 : " + phone[i]);
					System.out.println("학번 : " + sNumber[i]);
					System.out.println("평균 : " + avg[i]);
			    }
				break;				

			default://잘못된 메뉴 입력
				break;
			}
		}
		
		
	}

}

//메소드(방법) - 함수
//함수라는 개념이 java에서 메소드로 쓰임
//함수 -> 일반 처리시에 사용되는 용어
//메소드 -> 객체지향 환경에서는 메소드라고 용어 사용
//
//
//메소드란
//하나 또는 여러가지 기능을 묶어서 독립적으로 사용할 수 있는 프로그램 구성 단위. (모듈이라고도 합니다)
//입력값(파라미터)을 넣어주면 해당 기능을 처리하고 출력값을 되돌려 준다(반환한다).
//
//메소드 특징
//메소드 내부에 메소드 추가 작성 안됨
//메소드는 특정 기능을 수행하기위해 잘라놓은 것
//
//메소드 종류
//1. 파라미터와 반환값이 모두 존재하는 메소드
//2. 파라미터는 존재하나 반환값이 없는 메소드  예) main메소드 : 입력값은 있으나 출력값은 없는 메소드
//3. 파라미터는 없으나 반환값은 존재하는 메소드
//4. 둘다 없는 메소드
//
//
//
//
//












