import java.util.Scanner;

public class ControlTest01 {

	public static void main(String[] args) {

//1		조건문 if
//		만약 true라면 처리, false라면 넘어감.
//		if(조건식)
//			처리문장(명령문);
		
//2		입력값이 짝수인지 판단하는 프로그램
		Scanner scan = new Scanner(System.in);
//		int num  = 0;
//		System.out.print("숫자 입력 : ");
//		num = scan.nextInt();
//		//짝수판별 조건1
//		if(num % 2 == 0) {
//			System.out.println("짝수입니다.");
//		}
//		//짝수판별 조건2
//		if(num % 2 != 1) {
//			System.out.println("짝수입니다.");
//		}
//		//홀수판별 조건식1
//		if(num % 2 == 1) {
//			System.out.println("홀수입니다.");
//		}
//		//조건을 만족하지 않는 다른 모든 경우 출력
//		else {
//			System.out.println("홀수입니다.");
//		}
//		System.out.println("종료합니다");
		
//3		컴퓨터는 덧셈 밖에 못함.
//		->컴퓨터가 빼기를 처리해주기위해서는 보수개념을 사용
//		빼기: 1의보수->2의보수로 덧셈
//		곱하기: 덧셈 연속으로
//		나누기: 빼기 연속으로->빼기(1의보수->2의 보수)
//		이런식으로 결국 모두 덧셈으로 처리해줌
		
//4		다중 분기 : else if
//		if(조건식1) {...}
//		else if(조건식2) {...}
//		else if(조건식3) {...}
//		[else {...}]		//[](대괄호)로 묶는건 생략가능하다는 뜻, else if 까지만 쓰고 else문은 꼭 쓸 필요는 없음
				
//5		학점 변환 프로그램
//		성적 -> 학점
//		90점 이상 : A
//		80점 이상 : B
//		70점 이상 : C
//		60점 이상 : D
//		나머지 성적: F
//		System.out.print("점수 입력 : ");
//		String grade;
//		int score = scan.nextInt();
//		
//		if(score >= 90) {
//			grade = "A";
//		}
//		else if(score >= 80 && score < 90) {
//			grade = "B";
//		}
//		else if(score >= 70 && score < 80) {
//			grade = "C";
//		}
//		else if(score >= 60 && score < 70) {
//			grade = "D";
//		}
//		else {
//			grade = "F";
//		}
//
//		System.out.println("학점 : " + grade);
		
//6		if문 중첩
		System.out.print("점수 입력 : ");
		String grade = "";
		int score = scan.nextInt();
		
		if(score >= 90) {
			if(score >= 95) {
				grade = "A+";
			}
			else {
				grade = "A0";
			}
		}
		else if(score >= 80 && score < 90) {
			if(score >= 85) {
				grade = "B+";
			}
			else {
				grade = "B0";
			}
		}
		else if(score >= 70 && score < 80) {
			if(score >= 75) {
				grade = "C+";
			}
			else {
				grade = "C0";
			}
		}
		else if(score >= 60 && score < 70) {
			if(score >= 65) {
				grade = "D+";
			}
			else {
				grade = "D0";
			}
		}
		else {
			grade = "F";
		}
		System.out.println("학점 : " + grade);
		
		
	}

}
