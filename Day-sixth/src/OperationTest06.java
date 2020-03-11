import java.util.Scanner;

public class OperationTest06 {

	public static void main(String[] args) {
//1		문제) -1이 입력될 때까지 반복적으로 점수를 입력받아서 평균을 출력는 프로그램
//		1.스캐너 만들기
//		2. 사용할 변수 만들기
//			점수 입력용 변수
//			평균 저장 변수
//			총점 저장 변수
//			카운트 변수
//		3. 점수 입력
//			-1이라면/아니라면.. 
//			-1이 아니라면 총점에 입력한 점수 더하기.(반복)
//			-1이라면 총점을 카운트 변수 나눗셈하여 평균 계산.
//		4. 평균 출력
		

		Scanner scan = new Scanner(System.in);
		
		int inNum = 0, total = 0, cnt = 0;
		double avg = 0.0f; //평균은 소수점으로 나올 수 있으니까

//1-1		while문 활용해서 문제 풀어보기			
//		inNum = scan.nextInt();
//
//		while(inNum != -1) {
//			total += inNum;
//			cnt++;	//
//			inNum = scan.nextInt(); //다시 새로운 입력값을 받아야하니까 scan 다시 써줌
//		}	
//		
//		avg = (double)total/cnt;	//형변환)정수 연산. -> 실수 연산
//		System.out.println(cnt + "명 평균은 " + avg);
				
//1-2  	do while문 활용해서 문제 풀어보기
		cnt = -1;
		//do 문은 일단 맨처음에 반드시 한번 실행된다.
		do {
			total += inNum;
			cnt++;	
			inNum = scan.nextInt();
		} while (inNum != -1);	//do while문 사용할 때 유의점 : 끝에 ';' 꼭 찍어주기
	}



//	에러 뜨는 이유
//	1. 오타
//	2. ';' 미스
//	 if(조건식);{ }
//	 switch(정수식);{ }
//	 for(초기식;조건식;증감식);{ } 
//	 while(조건식);{ }
	 
	
}
