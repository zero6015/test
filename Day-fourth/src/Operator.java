import java.util.Scanner;

public class Operator {

	public static void main(String[] args) {
		
//1		�ݺ���
//		:Ư�� ��ɹ�(��)�� �ݺ�ó�� ���ִ� ���. (for��, while��)
//		
//		1. for��
//		������ Ƚ����ŭ �ݺ��ض�
//		for(�ʱ��;���ǽ�;������) {...}
//		for�� ó�� ���� : �ʱ��->���ǽ�->{...}->������->���ǽ�->{...}->������->~~~�ݺ�~~->���ǽ��� �������� ���ϸ� for�� ������
		
//2		//i�� 1�� ����
//		for(int i = 1; i <= 10; i++) {
//			System.out.println(i);
//		}
//		
//		//i�� 2�� ����
//		for(int i = 1; i <= 10; i += 2) {
//			System.out.println(i);
//		}
		
//3		������ ��� ���α׷�
//3-1		2�� ���
//		for (int i = 1; i < 10; i++) {
//			System.out.printf("2 * %d = %3d%n",i,2 * i);
//		}
		
//3-2	������ ��ü ��� (���� for��) : �Ѵܾ� ������
//		for (int j = 1; j < 10; j++) {
//			System.out.printf("%5d��%n",j);
//			for (int i = 1; i < 10; i++) {
//				System.out.printf("%d * %d = %3d%n", i, j, i * j);
//			}
//			System.out.printf("%n");
//		}
			
//3-3	������ ��ü ��� (���� for��) : ������ ������
//		for (int j = 1; j < 10; j++) {
//			
//			for (int i = 1; i < 10; i++) {
//				System.out.printf("%d * %d = %2d   ", i, j, i * j);
//			}
//			System.out.printf("%n");
//		}
			
		
//3-3	����) 1~100������ �� ���ϱ�
//		1 + 2 + 3 + 4 + 5 + ... + 100 = ?
//		int sum=0;
//		for (int i = 1; i <= 100; i++) {
//			sum += i;
//		}
//		System.out.printf("1 + 2 + 3 + 4 + 5 + ... + 100 =%5d%n", sum);		
		
//4		��ø�� for�� 
//		for (int k = 0; k < 5; k++) {
//			for (int l = 0; l < 5; l++) {
//				System.out.print("*");	
//			}
//			System.out.println();	
//		}
		
		
		System.out.println("���� : ");	
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		//���ڸ� �Է¹޾Ƽ� �ϳ��� �÷��� ����ϱ�
		for (int i = 1 ; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("��");
			}
			System.out.println();	//�ٸ� �ٲ�
		}
		
		//���ڸ� �Է¹޾Ƽ� �ϳ��� �ٿ��� ����ϱ�
		for (int i = num ; i > 0; i--) {
			for (int j = 1; j <= i ; j++) {
				System.out.print("��");
			}
			System.out.println();	
		}
		
	
		
	}

}
