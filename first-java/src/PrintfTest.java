import java.util.Scanner;

public class PrintfTest {

	public static void main(String[] args) {
		
		//printf : 출력형식 지정 명령
		//("출력할 형식", 값들..)
		System.out.println("문자열");
		
		/*
		int num = 10;
		
		System.out.println("num 변수의 값은 10");			//프로그램 작성자만이 10의 값이란걸 알 수 있으니까
		System.out.printf("num 변수의 값은 %d", num);		//변수를 호출해서 출력해줌
		
		
		Scanner scan = new Scanner(System.in);
		//객체 = 인스턴스(instance)
		//new 키워드는 인스턴스를 생성하는 명령어
				
		int num = 10;
		
		num = scan.nextInt();
		
		System.out.printf("num 변수의 값은 %d\n", num);
		*/
		//구구단 2단 출력
		int dan = 2;
		int m = 1;
		System.out.printf("2단\n"); 	//줄바꿈 : \n OR %n
		System.out.printf("=============%n");
		System.out.printf("%d * %d = %5d\n", dan, m, dan*m);		//앞에 %d가 3개가 쓰였으면 뒤에 매치되는 값또한 3개가 와야한다. (%-5d로 자릿수 뒤로 채워지는것도 확인해보기)
		m = m + 1;													//%숫자 : 자릿수를 지정
		System.out.printf("%d * %d = %5d\n", dan, m, dan*m);
		m = m + 1;
		System.out.printf("%d * %d = %5d\n", dan, m, dan*m);
		m = m + 1;
		System.out.printf("%d * %d = %5d\n", dan, m, dan*m);
		m = m + 1;
		System.out.printf("%d * %d = %5d\n", dan, m, dan*m);
		m = m + 1;
		System.out.printf("%d * %d = %5d\n", dan, m, dan*m);
		m = m + 1;
		System.out.printf("%d * %d = %5d\n", dan, m, dan*m);
		m = m + 1;
		System.out.printf("%d * %d = %5d\n", dan, m, dan*m);
		m = m + 1;
		System.out.printf("%d * %d = %5d\n", dan, m, dan*m);
		m = m + 1;
		System.out.printf("%d * %d = %5d\n", dan, m, dan*m);
		m = m + 1;
		
		
		//금액출력
		System.out.printf("당첨 %,d원%n", 100000000);		//천단위로 ,찍기
		//공백 대체(0으로) 출력
		System.out.printf("%010d%n", 123);		//공백을 0으로 채우고 자릿수는 10칸
		//10진수 -> 16진수 출력					//octa
		System.out.printf("%x%n", 123);
		//10진수 -> 8진수 출력					//hexa
		System.out.printf("%o%n", 123);
		
		//실수 출력
		System.out.printf("%6.3f", 3.3);		//총 6자릿수 사용하고 소수점 뒤에 3자리 사용한다. -> 따라서 앞에 빈칸 한자리까지 포함해서 출력됨(소수점도 자릿수에 포함)
				
	}

}
