import java.util.Scanner;

public class MethodCal {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {

//		4칙 연산 계산기
//		덧셈 연산용 메소드 파라미터X, 반환값X
//		작성한 메소드는 다른 메소드 안에서 호출한다.
//		1. 파라미터가 있고 결과값이 있는 메소드 호출법
//		방법1)
		int rs = add(1, 2); //add메소드 호출함. 값 1,2도 같이 보냄
		System.out.println("1 + 2 = " + rs);	//위에서 값을 반환받아서 변수에 저장되고 변수를 출력함
//		방법2)
		System.out.println("3 + 4 = " + add(3, 4));	//출력시에 바로 add메소드 호출해서 결과값 출력함
//		방법3)
		int a1, a2;
		a1 = scan.nextInt();
		a2 = scan.nextInt();
		System.out.println(a1 + " + " + a2 + " = " + add(a1, a2)); 
		
//		2.	파라미터 O, 반환값 X 메소드	
		sub(a1, a2);
		
//		3.	파라미터 X, 반환값 O 메소드	 
		rs = mul();
		
//		4. 파라미터 X, 반환값 X 메소드	
		div();
		
	}//main 메소드 끝
	
//1	파라미터 O, 반환값 O 메소드
//	두개의 값을 입력 받는 메소드
//	결과를 반환하는 메소드
//	메소드 이름 앞에 붙이는 자료형은 반환되는(결과) 값의 자료형을 붙인다. -> 반환형 (예1 참고)
	public static int add(int a, int b) {//파라미터를 저장하기 위한 변수 : 매개 변수 (함수가에 입력값이 들어오면 값을 받는 역할)

		int c, d; //이렇게 메소드 안에서 호출하게 되면 입력값을 받기위한 변수로는 사용 불가함
		int result = a + b;
		return result;
	}
	
//예1
//	반환형은 return할 변수의 데이터형을 적어줌! (입력값이 int였어도 중간에 float으로 변환됐을경우 float으로 바꿔줘야함)
//	public static float divide(int a, int b) {//파라미터를 저장하기 위한 변수 : 매개 변수 (함수가에 입력값이 들어오면 값을 받는 역할)
//
//		int c, d; //이렇게 메소드 안에서 호출하게 되면 입력값을 받기위한 변수로는 사용 불가함
//		int result = (float)a / b;
//		return result;
	

//2	파라미터 O, 반환값 X 메소드
	public static void sub(int a, int b) {//return이 없는 경우 반환형에 void 써줌
		int result = a - b;
		System.out.println(a + " - " + b + " = " + result);
	}


//3	파라미터 X, 반환값 O 메소드
	public static int mul() {
		int a = scan.nextInt();
		int b = scan.nextInt();
		int result = a * b;
		return result;	
	}

//4	파라미터 X, 반환값 X 메소드
	public static void div() {
		int a = scan.nextInt();
		int b = scan.nextInt();
		int result = a / b;
		System.out.println(a + " / " + b + " = " + result);
	}
		
	
}

//call stack은 메소드를 호출하기 위한 계층
//그래서 call stack에는 항상 main 메소드가 들어있음
