import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int number1 = 0;
		int number2 = 0;
		int result = 0;
		
		
		System.out.println("숫자를 입력하세요1.");		
		number1 = scan.nextInt();
		
		System.out.println("숫자를 입력하세요2.");		
		number2 = scan.nextInt();
		
		result = number1 + number2;
		
		System.out.println("입력한 숫자1 : " + number1);
		System.out.println("입력한 숫자2 : " + number2);
		System.out.println("덧셈결과 : " + result);
		
		
	
	}

}
