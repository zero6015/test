import java.util.Scanner;

public class ControlTest01 {

	public static void main(String[] args) {

//1		���ǹ� if
//		���� true��� ó��, false��� �Ѿ.
//		if(���ǽ�)
//			ó������(��ɹ�);
		
//2		�Է°��� ¦������ �Ǵ��ϴ� ���α׷�
		Scanner scan = new Scanner(System.in);
//		int num  = 0;
//		System.out.print("���� �Է� : ");
//		num = scan.nextInt();
//		//¦���Ǻ� ����1
//		if(num % 2 == 0) {
//			System.out.println("¦���Դϴ�.");
//		}
//		//¦���Ǻ� ����2
//		if(num % 2 != 1) {
//			System.out.println("¦���Դϴ�.");
//		}
//		//Ȧ���Ǻ� ���ǽ�1
//		if(num % 2 == 1) {
//			System.out.println("Ȧ���Դϴ�.");
//		}
//		//������ �������� �ʴ� �ٸ� ��� ��� ���
//		else {
//			System.out.println("Ȧ���Դϴ�.");
//		}
//		System.out.println("�����մϴ�");
		
//3		��ǻ�ʹ� ���� �ۿ� ����.
//		->��ǻ�Ͱ� ���⸦ ó�����ֱ����ؼ��� ���������� ���
//		����: 1�Ǻ���->2�Ǻ����� ����
//		���ϱ�: ���� ��������
//		������: ���� ��������->����(1�Ǻ���->2�� ����)
//		�̷������� �ᱹ ��� �������� ó������
		
//4		���� �б� : else if
//		if(���ǽ�1) {...}
//		else if(���ǽ�2) {...}
//		else if(���ǽ�3) {...}
//		[else {...}]		//[](���ȣ)�� ���°� ���������ϴٴ� ��, else if ������ ���� else���� �� �� �ʿ�� ����
				
//5		���� ��ȯ ���α׷�
//		���� -> ����
//		90�� �̻� : A
//		80�� �̻� : B
//		70�� �̻� : C
//		60�� �̻� : D
//		������ ����: F
//		System.out.print("���� �Է� : ");
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
//		System.out.println("���� : " + grade);
		
//6		if�� ��ø
		System.out.print("���� �Է� : ");
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
		System.out.println("���� : " + grade);
		
		
	}

}
