import java.util.Scanner;

public class ArrayTest02 {

	public static void main(String[] args) {
//1		�迭�� �迭�� �����ϰ� ���� �Է��ϸ� ���� �޸𸮰����� �����ϱ� ������ 
//		���߿� �ϳ��� ������ ���ο� ���� �������־ �� �迭 ��� ������ ������ ��µȴ�
//		int intArr[] = new int[5];
//		int mArr[] = intArr;
//		
//		for(int i = 0; i < 5; i++) {
//			intArr[i] = i;			
//		}
//		
//		for (int j = 0; j < 5; j++) {
//			System.out.println(intArr[j]);
//		}
//		System.out.println("------------");
//		for (int k = 0; k < 5; k++) {
//			System.out.println(mArr[k]);
//		}
//		
//		mArr[2] = 100;
//		System.out.println("------------");
//		for (int k = 0; k < 5; k++) {
//			System.out.println(intArr[k]);
//		}
		
		
//2		5���� ���ڸ� �Է¹޾Ƽ� ���� ū ���� ���� ���� ���� ����Ͻÿ�.
		Scanner scan = new Scanner(System.in);
		
		System.out.println("���� 5���� �Է��ϼ���.");
		
		int numArr[] = new int[5];
//		
//		//5�� ���� �Է� ó��
//		for (int i = 0; i < 5; i++) {
//			numArr[i] = scan.nextInt();
//		}
//		
//		//�ִ밪/�ּҰ� ã��
//		int max = 0, min = 9999;	
//		
//		for (int j = 0; j < 5; j++) {
//			//�ִ밪 ��
//			if(max < numArr[j]) {
//				max = numArr[j];
//			}
//			
//			//�ּҰ� ��
//			if(min > numArr[j]) {
//				min = numArr[j];
//			}
//		}
//		
//		System.out.println("���� ū ���� " + max + ", ���� ���� ���� " + min);
		
		
//		������ �������� ����
//		Swap�� ����
//		���� a�� ���� b�� ���� ���� ��ȯ�Ϸ���?
//		����c�� ���� c�� a�� ���� ����, a�� b�� ���� ����, c�� a�� ���� ����.
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int temp = 0;
		
		temp = num1;
		num1 = num2;
		num2 = temp;		
		
	}

}
