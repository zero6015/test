import java.util.Scanner;

//연산자 : 대입연산자/산술연산자/증감연산자/비교연산자/논리연산자/조건연산자
public class OperatorTest {

	public static void main(String[] args) {
		
		/*
		//1. 산술 연산자 : +, -, *, /, %
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("간단한 계산기");
		System.out.println("=============");
		
		int num1, num2, result;		//같은 데이터 타입일 경우 한줄로 선언 가능, 같은 줄에서 각각 초기화도 가능
		
		System.out.print("첫 번째 수 : ");
		num1 = scan.nextInt();
		System.out.print("두 번째 수 : ");
		num2 = scan.nextInt();
		
		result = num1 + num2;
		System.out.println("덧샘결과 : " + result);

		result = num1 - num2;
		System.out.println(",뺄샘결과 : " + result);

		result = num1 * num2;
		System.out.println("곱샘결과 : " + result);

		result = num1 / num2;
		System.out.println("나눗샘결과 : " + result);

		result = num1 % num2;
		System.out.println("나머지결과 : " + result);
		
		*/
		/*
		
		//2. 증감 연산자 : ++, --, +=, -=
		//++, -- : 1씩 증가 또는 감소 시키는 연산자
		//단항 연산자이기도 함.
		
			
		int i = 0;
		i++;  // i = i + 1; i +=1; 과 같은 의미
		System.out.println(i);
		
		i = 0;
		++i;
		System.out.println(i);
		
		//전위형, 후위형의 비교 - 전위로할지 후위로할지 어떻게 변하는지 확인해보기
		int j = 0, k = 0, l = 0;
		j++;
		k = j++;
		System.out.println("후위연산 : " + j);		
		j = 0;
		l = ++j;
		System.out.println("전위연산 : " + j);
		System.out.println(k + ", " + l);
		
		int h = 0;
		h += 2;				//2값씩 증가함
		System.out.println(h);
		
		*/
		
		/*
		//3. 비교 연산자 : ==, !=, >, >=, <, <=
		// == 같으냐 (결과값 : 참/거짓)
		// != 다르냐 (결과값 : 참/거짓)
		int n1 = 4, n2 = 5;
		System.out.println(n1 == n2);
		System.out.println(n1 != n2);
		System.out.println(n1 > n2);
		System.out.println(n1 >= n2);
		System.out.println(n1 < n2);
		System.out.println(n1 <= n2);
		boolean b = (n1 == n2);		//비교 결과값 변수에 저장
		System.out.println(b);
		
		
		int year = 0;
		boolean yoon = (year % 4) == 0;
		yoon = (year % 100) != 0;
		yoon = (year % 400) == 0;
		
		*/
//		4. 논리 연산자(결과는 boolean) : AND, OR, NOT, XOR
//		AND => &&, OR => ||
//		Scanner scan = new Scanner(System.in);
//		int number = scan.nextInt();		//사용자의 입력값을 초기값으로 사용하는 변수
//		
//		boolean b = false;
//		
//		b = (number > 0) && (number < 5);
//		System.out.println(b);
//		
//		b = (number <= 0) || (number >= 5);
//		System.out.println(b);
//		
//		b = (number > 0) && (number++ < 5); //이러면 앞이 참이나 거짓 때문에 뒷 조건이 실행이 안될 수도 있으니 리스크를 줄이기 위해 논리연산 비교식에는 증감하지말기!
//		b = (number <= 0) || (number++ >= 5);

		
//		입력한 값이 숫자인지 문자인지 판별하는 프로그램
//		Scanner scan = new Scanner(System.in);
//		
//		char ch = '\0'; //null 문자로 초기화
//		String str = scan.next();	//문자열 입력받기
//		ch = str.charAt(0);		// 문자열 -> 문자 변환
//
//		boolean b = ((ch >= 'a') && (ch <= 'z')) || ((ch >= 'A') && (ch <= 'Z'));		//논리 연산자 우선순위 우선처리 순서 정해주기 위해서 괄호로 묶어주기 
//		System.out.println(b);
		

//		System.out.println("윤년 계산기 \n연도를 입력 :  ");
//		Scanner scan = new Scanner(System.in);
//		int year = scan.nextInt();
//		
//		boolean b = (((year % 4) == 0) && ((year % 100) != 0)) || ((year % 400) == 0);
//		System.out.println(b);
		

//		5. 조건연산자
//		(수식/변수/리터럴이 세개가 들어가는)삼항연산자
//		(조건식) ? A : B; -> 조건식이 true 일 경우 A 실행, 조건식이 false일 경우 B 실행
//
//		절대값 구하기 (-10 -> 10)
//		System.out.print("절대값 구하기 : ");
//		int x = -10;
//		int absX = 0;	//절대값 저장 변수
//		absX = (x >= 0) ? x : -x;
//		System.out.println(absX);

//		Scanner scan = new Scanner(System.in);
//		int gr = scan.nextInt();
//		
//		String grade = (gr >= 60) ? "pass" : "fail";
//		System.out.println(grade);
//		
//		String grade2 = (gr >= 90) ? "A" : (gr >= 60) ? "B" : "C";
//		System.out.println(grade2);
		
		
	}
	
}
