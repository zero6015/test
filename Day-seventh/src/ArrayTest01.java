import java.util.Scanner;

public class ArrayTest01 {

	public static void main(String[] args) {
//1		�迭(Array)
//		���࿡ �� ���� �л��� 30���� ��	�� �л��� ���� ������ �����ϰ� �ʹ�. ��� �ϸ� ������?
//		�迭�� ���� �ڷ��������� ���� �� ����. ��) int�� �迭, float�� �迭
//		�迭�̶� ������ ����
		
//2		int score[] = new int[30]; //�迭 ���� ��� : score�̶� ������ �迭������ ����� �迭�� ũ��� 30���� �����Ѵ�
//3		//�迭�� ���� ���(����)
//		score[0] = 80; //ù��° �迭 ĭ�� ����(�迭�� ��ȣ 0���� ������)
//		score[10] = 93;	//11���� �迭 ĭ�� ����
//
//		System.out.println(score[1]);	//ĭ�� ��������Ƿ� 0 ��µ�
//		System.out.println(score[10]);	//���Ե� ���� �����Ƿ� ���Ե� ���� ��µ�
		
//4		int score[] = new int[5];
//		System.out.println("���� �Է� ���α׷�");
//		
//		Scanner scan = new Scanner(System.in);
//		
//		for (int i = 0; i < 5; i++) {
//			System.out.print((i + 1) + "��° �л� ����: ");
//			score[i] = scan.nextInt();
//		}
//		
//		int sum = 0;
//		for (int j = 0; j < 5; j++) {
//			sum += score[j];
//		}
//		System.out.println("������ " + sum);
		
//5		//���� for��
//		int sum = 0;
//		for(int s : score) {//s��� ������ �ش� for�������� ������, score��� �迭�� �ִ� ������ ���������� �ϳ��� ���Խ�����.
//			sum += s;
//		}

//		���� �Է��� ��ŭ �迭�� ũ�⸦ ���� �� �ִ�
		int size = 10;					//�迭 ���� ���1) ������ ũ�� ���� �ְ� ������ �迭 ����ÿ� ������ ũ�� ����
		int score[] = new int[size];	//c���� ��� �� �迭 ũ�⸦ ������ �� �����θ� ũ�� ������ ���������� java�� ��� ������ ũ�⸦ ������ �� ������ ����ؼ� �������� �� ����
		
		String grade[];					//�迭 ���� ���2) �迭 ���� ���� �� ��, �迭�� �ٽ� ũ�� ����
		grade = new String[size];
		
		int num[] = {1, 2, 3, 4, 5};	//�迭 ���� ���3) �迭 ����� ���ÿ� �� ����
		
	}

}
