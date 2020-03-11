import java.util.Scanner;

public class InfiniteLoop {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int menu = 0;
		
		System.out.println("메뉴 출력");
		
		//항상 참인걸로 간주 for 또는 while문
		//for (;;) {
		while(true) {	
			System.out.println("1. 입력하기");
			System.out.println("2. 불러오기");
			System.out.println("3. 저장하기");
			System.out.println("4. 출력하기");
			System.out.println("5. 종료하기");
			System.out.println("입력 > ");
			menu = scan.nextInt();
			
			if (menu == 5) {
				break;	//반복문을 종료해라! if문은 해당되지 않고 이외에 switch나 for문을 break하는 역할(break의 영향을 받지않는 유일한 제어문은 if문)
			}
			//if문이 switch문보다 나중에 오는 이유는 5번 입력될 경우 반복문이 실행됨
			switch (menu) {
			case 1:
				System.out.println("입력하기 처리");
				break;
			case 2:
				System.out.println("불러오기 처리");
				break;
			case 3:
				System.out.println("저장하기 처리");
				break;
			case 4:
				System.out.println("출력하기 처리");
				break;
			default:
				System.out.println("입력오류");
				break;
			}
		
		}
		
		
	}

}
