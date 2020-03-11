
public class Hello {
//접근제한이 없는 클래스 이름은 Hello	
	public static void main(String[] args) {
		
		//주석 종류 
				//1. 한 줄 주석
				/* 
				 * 2. 여러 줄을 주석 처리
				 */
		
		/*
		 * 데이터의 종류
		 * 1. 숫자
		 * 	1) 정수(integer) - 소수점이 없는 숫자 : %d
		 * 	2) 실수(float) - 소수점이 있는 숫자(부동소수점) :%f	
		 * 2. 문자(character)
		 * 3. 문자열(string)
		 * 4. 진리값(true/false)
		 * 
		 */
		
		/*
		 * 메모리에서 모든 프로그램은 동작함.
		 * 데이터도 모두 메모리에 저장되어야 함.
		 * 데이터를 저장하는 공간을 변수라고 함.		 * 
		 */
		
		/*
		 * 자료형(데이터타입)의 종류 - 메모리를 할당할 때 데이터의 크기를 미리 지정해서 한번에 처리하기 위해서 데이터타입을 미리 지정
		 * <기본 자료형> : 메모리 크기 변경 불가, 남은 메모리 부분은 그냥 비워둠
		 * 1. 진리값 자료형 boolean - 1bit
		 * 2. 문자형 자료형 char - 2byte
		 * 3. 정수형 자료형
		 * 	1) short -2byte 
		 * 	2) int - 4byte (예전에는 2byte였다가 컴퓨터 성능이 좋아지면서 기본 4byte로 변경됐음)
		 * 	3) long - 4byte 
		 * 	4) long long - 8byte
		 * 4. 실수형 자료형
		 * 	1) float - 4byte
		 * 	2) double - 8byte
		 * 	3) long double - 16byte
		 * <참조 자료형> : 문자열을 다룰 때 사용
		 * 5. 참조 자료형
		 * 	1) 문자열 - string
		 */
		 
		/*
		 * 프로그램을 작성할 때 생각해야 할 일
		 * 1. 어떠한 데이터가 입력/출력되는가
		 * 	-> 데이터를 처리할 공간이 필요하다.
		 * 	-> 해당 데이터의 변수를 만들어야 한다.
		 */
		
		/*
		 * 변수를 만드는 방법
		 * 자료형 이름;
		 * 진리값 저장 변수
		 */
		// 초기값 설정
		boolean b = false;				// true : 0(false)가 아니면 참
		byte bb = 0;
		char ch = '\0';
		short s = 0;
		int i = 0;
		long l = 0L;
		float f = 0.0f;
		double d = 0.0f;
		//>>모든 변수를 0(null)로 초기화
		
		//string 변수 null로 초기화
		String str1 = "";
		String str2 = null;
		
		
		
		
		
		System.out.print("Hello World!");					//줄바꿈 없이 출력됨
		System.out.print("자기소개 프로그램\n");					// \n : 줄바꿈  -> 원하는 만큼 줄을 바꿔줄 수 있다는 장점
		System.out.println("=============");				//println : 줄 바꿔주는 명령어
		System.out.println("이름 : 강은경");
		System.out.println("취미 : 전시 보기\n\n");
		System.out.printf("%f + %d = %f", 1.5,2,1.5+2);				//printf (format), d : decimal(십진수 정수), f : float

		
	}

}
