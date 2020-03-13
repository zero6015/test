import java.util.Random;
import java.util.Scanner;

public class LottoGenerator {

	public static void main(String[] args) {
//		1~45 사이의 6개의 숫자를 자동으로 생성한다
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		
		int lottoNum[] = new int[6];//로또번호 저장 배열
		int select = 0; //메뉴번호 저장 변수
		
		while (true) {
			System.out.println("로또 번호 생성기");
			System.out.println("=================");
			System.out.println("1. 생성하기");
			System.out.println("2. 종료하기");
			System.out.println("입력>");
			select = scan.nextInt();
			
			if (select == 2) {
				System.out.println("종료합니다");
			}
			
			for (int i = 0; i < 6; i++) {
				//1~45까지 생성
				int num = rand.nextInt(45) + 1;//1을 더해주는 이유 : rand.nextInt(45) -> 0 ~ 44
				
				lottoNum[i] = num;
				//중복 제거
				for (int j = 0; j < i; j++) {//첫번째 라운드에서는 i,j 둘다 0이라서 for문을 돌지 않는다.
					if(lottoNum[j] == lottoNum[i]) {
						//중복 발생 시 처리할 내용
						i--;
						break;//중복 확인 작업 종료
					}
				}
			}
			for (int n : lottoNum) {
				System.out.print(n + " ");
			}
		    System.out.printf("\n\n");
			
		}

		
	}

}
