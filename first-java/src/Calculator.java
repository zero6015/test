import java.util.Scanner;

public class Calculator {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		int number1 = 0;
		int number2 = 0;
		int result = 0;
		
		
		System.out.println("���ڸ� �Է��ϼ���1.");		
		number1 = scan.nextInt();
		
		System.out.println("���ڸ� �Է��ϼ���2.");		
		number2 = scan.nextInt();
		
		result = number1 + number2;
		
		System.out.println("�Է��� ����1 : " + number1);
		System.out.println("�Է��� ����2 : " + number2);
		System.out.println("������� : " + result);
		
		
	
	}

}
