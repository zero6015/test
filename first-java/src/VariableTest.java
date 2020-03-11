/*
		 * 1. 명명규칙
		 * 권장사항
		  1. 클래스 이름의 첫 글자는 항상 대문자로 한다. -변수와 메서드 이름의 첫 글자는 항상 소문자로 한다
		  2. 여러 단어 이름은 단어의 첫 글자를 대문자로 한다. -ex) lastIndexOf, StringBuffer
		  3. 상수의 이름은 대문자로 한다. 단어는 '_'로 구분한다 - PI 
		  
		  2. 
		  변수 - 하나의 값을 저장하기 위한 공간
		  상수 - 한번만 값을 저장할 수 있는 공간
		  변수는 값을 계속 바꿔 줄 수 있지만 상수는 한번 값이 삽입되면 이후에 변경이 불가하다
		  리터럴 - 그 자체로 값을 의미하는 것
		  ex) int score = 100;
		   		score = 200;
		   		char ch = 'A';
		   		String str = "abc";
		   		final int MAX = 100; //상수 선언할 때 앞에 final을 붙여주고 변수와 상수 구분하기 위해 대문자로 작성
		   		= 오른쪽에 있는 값 자체를 리터럴이라함.
		  
		  
		 */
public class VariableTest {
	
	public static void main(String[] args) {
		//변수
		int num = 100;		 
		num = 200;			//변수 선언/값을 대입 시에 변수에 노란줄 뜨는 이유 : 변수를 사용하지 않아서 (변수 안에 있는 값을 가져올 때가 변수를 사용한다는 의미) 
		char ch = 'A';		//char ch = ''; - 빈칸으로 초기화 불가 -> char ch = '\0'; 으로 빈칸 초기화 가능		//char ch = ' ';  - 스페이스도 문자이므로 공백문자로 초기화 가능 
		char ch2 = '한';
		//char ch3 = 'abc';  //char는 문자형이므로 여러문자 삽입 불가
		String str = ""; //변수는 선언 및 빈칸으로 초기화
		String str2 = null;
		
		//상수
		final float PI;
		PI = 4.0f;
		//PI = 3.14f;
		
		int a = 10;
		float f = a; 
		
		System.out.println(f);
		
		float realNumber = 3.14f;		//문법이라서 외워야함) float 변수에 실제 값을 입력할 때는 항상 접미사를 붙여야함 - 접미사 종류는 Hello.java (4. 자료형(데이터타입)의 종류) 참고 
		System.out.println(realNumber);
		
		//System.out.printf("%f", realNumber);
		
		//부호 + , - (참고 - https://m.blog.naver.com/PostView.nhn?blogId=ansdbtls4067&logNo=220886567257&proxyReferer=https%3A%2F%2Fwww.google.com%2F)
		
		//(자료)형변환 - 캐스트연산자
		//자동형변환 - (암시적/묵시적)형변환
		//강제형변환 - 명시적형변환
		int n1 = 5;
		int n2 = 2;
		
		System.out.println(n1/n2);		//정수형이므로 나눗셈을 할 경우 소수점 이하의 값은 소실됨.
		
	/*	float f1 = 3.145f;		//자료형이 큰거에서 작은 걸로 변환될 경우 오류 발생
		int nf =f1;
		*/
		
		float f1 = 3.145f;
		int nf = (int)f1;		//자료형을 임의로 바꿔주면 오류 해결, 변수가 변하는 것이 아니라 변수 안에 있는 값이 변수에서 꺼내져서 형변환되어 사용되는 것
		
		System.out.println((float)n1/n2);		//형변환 순서 : n1을 float으로 형변환 -> n2가 자동으로 float으로 형변환 -> 계산값이 출력됨
		//다른 자료형 간의 연산
		//n1 = 5.0f; // 변수의 타입이 변환하지는 않는다.
		
		//정수 < 실수 < 문자열
		//숫자의 문자열 변환 
	/*	String str3 = "";
		int ntoa = 10;
		str3 = (String)ntoa;		//이렇게 숫자에서 문자형으로는 변환 불가
		*/
		
		String str3 = "abc";
		int ntoa = 10;
		str3 = ntoa + "";		//String 으로 형변환 하는 방법!! - 정수 + "" 이렇게 모두 묶어서 string으로 변환되고 string 변수에 저장됨
		System.out.println(str3);
		
		/*문제
		 다음 중 캐스트연산자의 생략이 가능한 문장은?
		 int num1 = 10;
		 1. byte로 변환 : byte b = (byte)num1;
		 2. double로 변환 : double d = num1;
		 3. short로 변환 : short s = (short)num1;
		 4. long로 변환 : long l = num1;
		 정답)2.4번 - 데이터형의 크기가 더 크기때문에 따로 명시할 필요 없음
		 */
	
		//오버플로우/언더플로우
		 byte b = 127;
		 b++;			//오버플로우가 됨 - 자바에서는 기본  'signed char 데이터 형'
		 System.out.println(b);	
		 
	}
}
