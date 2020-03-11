import java.util.Scanner;

public class Calculator2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		//변수 선언
		int num1 = 0, num2 =0, result = 0;
		String op = "";
		
		System.out.println("*** 계산기 ***");	//타이틀 출력
		System.out.print("수1 : ");
		num1 = scan.nextInt();
		System.out.print("수2 : ");
		num2 = scan.nextInt();
		
		System.out.print("연산 : ");
		//문자열 입력 처리
		op = scan.next(); //scan.nextLine();
		
		
//1		//입력한 연산 문자로 분기.
//		switch (op) {
//		case "+":
//			result = num1 + num2;
//			break;	//각 case별로 분리
//		case "-":
//			result = num1 + num2;
//			break;
//		case "*":
//			result = num1 + num2;
//			break;
//		case "/":
//			result = num1 + num2;
//			break;
//		case "%":
//			result = num1 + num2;
//			break;
//		default:
//			System.out.println("잘못된 연산자 입력!");
//			result = 0;	//생략해도 됨
//			break;
//		}//switch 끝
//		
//		System.out.println("계산 결과 : " + result);
		
//2		if문으로 계산기 처리해보기 (switch -> if 변환)
//		나쁜예) 
//		if(op == "+") {
//			result = num1 + num2;
//		}
//		else if(op == "-") {
//			result = num1 + num2;
//		}
//		else if(op == "*") {
//			result = num1 + num2;
//		}
//		else if(op == "/") {
//			result = num1 + num2;
//		}
//		else if(op == "%"){
//			result = num1 + num2;
//		}
//		else{
//			System.out.println("잘못된 연산자 입력!");
//			result = 0;	//생략해도 됨
//		}
//		System.out.println("계산 결과 : " + result);
		
//3		//동적데이터 비교를 위해서는 .equals()를 사용해야함
//		if(op.equals("+")) {
//			result = num1 + num2;
//		}
//		else if(op.equals("-")) {
//			result = num1 + num2;
//		}
//		else if(op.equals("*")) {
//			result = num1 + num2;
//		}
//		else if(op.equals("/")) {
//			result = num1 + num2;
//		}
//		else if(op.equals("%")){
//			result = num1 + num2;
//		}
//		else{
//			System.out.println("잘못된 연산자 입력!");
//			result = 0;	//생략해도 됨
//		}
//		System.out.println("계산 결과 : " + result);
		
//		switch -> if 변환 
//		주의사항: 문자열의 비교
//		문자열은 비교연산자를 사용할 수 없음
//		1형: 문자열변수.equals("비교문자열");
//		2형: 문자열변수1.equal(비교문자열변수2);
//		3형: "비교문자열".equals(문자열변수);  -> 꼭 변수를 문자열과 비교 안하고 문자열을 변수와 비교해도 됨
		
		
		
	}//main 끝

}//class 끝
//중괄호 끝에 주석으로 표시해두면 편함
