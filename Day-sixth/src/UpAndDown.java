import java.util.Random;
import java.util.Scanner;

public class UpAndDown {

//	UP & DOWN 게임
//	랜덤으로 생성된 숫자를 몇번에 맞추는가!
//
//	범위 : 1부터 100 사이의 숫자
//	조건
//	  생성된 숫자보다 큰 숫자가 입력되면 "UP" 출력.
//	  생성된 숫자보다 작은 숫자가 입력되면 "DOWN" 출력.
//	  입력 제한 횟수는 10번.
//	결과 출력
//	  입력한 횟수를 저장하고 있다가 정답을 맞추게 되면
//	  "시도 횟수 0번 성공" 출력
//	  10번을 모두 입력했으나 정답을 못 맞출 경우
//	  "실패! 정답 00" 출력
//
//	기타
//	  배운것만 활용하세요.
//	  (switch를 사용하지 않을 경우 break 사용 금지.)
//
//	참고 사항
//	  Random 객체 사용법
//	  Random rand = new Random();
//	  int num = rand.nextInt(100);//0~99사이의 난수 생성
//	  //1~100 사이의 수를 생성하려면?
//
//
//	출력 예시(실패)
//	--------------------
//	입력> 5
//	UP!
//	입력> 10
//	UP!
//	입력> 20
//	UP!
//	입력> 30
//	UP!
//	입력> 40
//	UP!
//	입력> 50
//	UP!
//	입력> 60
//	UP!
//	입력> 70
//	UP!
//	입력> 80
//	UP!
//	입력> 90
//	UP!
//	실패! 정답 96
//
//	====================
//	출력 예시(성공)
//	--------------------
//	입력> 50
//	UP!
//	입력> 60
//	UP!
//	입력> 90
//	UP!
//	입력> 95
//	UP!
//	입력> 99
//	DOWN!
//	입력> 98
//	DOWN!
//	입력> 97
//	DOWN!
//	입력> 96
//	시도 횟수 7번 성공!
	
	
	public static void main(String[] args) {
		//입력 인스턴스 생성
		Scanner scan = new Scanner(System.in);
		//난수 인스턴스 생성
		Random rand = new Random();
		
		//성공/실패 저장 변수
		boolean success = false;
		
		//맞출 번호 생성(1~100 사이의 값 생성)
		int num = rand.nextInt(100) + 1; //int num = rand.nextInt(100); 이렇게 100으로 설정할 경우 0~99 사이의 수만 생성됨. 따라서 뒤에 +1을 해주어야 1~100으로 됨.
//		int num = (rand.nextInt(100) + 1) * 10; //10~1000 사이의 십단위 숫자만 출력 
		
		//사용자 입력값 저장 변수
		int inNum = 0;
				
		//사용자 입력 값과 생성값 비교 후 판단 출력
		for(int i = 1; i <= 10; i++) {
			//입력 안내
			System.out.println("입력 > ");
			inNum = scan.nextInt();
			
			//비교 판정
			if(num == inNum) {
				//결과 출력
				System.out.println("시도 횟수 " + i + "번 성공!");
				//반복 종료 처리
				i = 10;		//break;로 대체 가능
				//성공/실패 여부 저장
				success = true;
				
				
			}
			else if(num > inNum) {
				System.out.println("UP!");
			}
			else if(num < inNum) {
				System.out.println("DOWN!");
			}
			
		}
		if(success == false) {
			//10번 시도 실패 후 게임 종료
			//정답 알려주기
			System.out.println("실패! 정답 " + num);
		}
		
	}//메인 끝

}//클래스 끝
