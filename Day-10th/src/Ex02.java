import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
//		�Է��� �ݾ��� 5����, ����, 5õ��, õ��, ������� �и��ϱ�.
//		(�ݾ״����� ���� ���ϱ�.)
//		��) 788300�� �Է�
//			5���� : 15��
//			���� : 3��
//			��õ�� : 1��
//			õ�� : 3��
//			����� : 0��
//			��� : 3��
		
		Scanner scan = new Scanner(System.in);
		
		int input = scan.nextInt();
		
		int fiftyth, tenth, fiveth, thousand, fivehd, hundred;
		int change;
		
		fiftyth = input / 50000;
		change = input % 50000;
		tenth = change / 10000;
		change = change % 10000;
		fiveth = change / 5000;
		change = change % 5000;
		thousand = change / 1000;
		change  = change % 1000;
		fivehd = change / 500;
		change  = change % 500;
		hundred = change / 100;

		System.out.printf("5���� : %d��\n���� : %d��\n5õ�� : %d��\nõ�� : %d��\n500�� : %d��\n100�� : %d��\n",fiftyth, tenth, fiveth, thousand, fivehd, hundred);
		
	}

}
