import java.util.Scanner;

public class MethodCal {

	static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {

//		4Ģ ���� ����
//		���� ����� �޼ҵ� �Ķ����X, ��ȯ��X
//		�ۼ��� �޼ҵ�� �ٸ� �޼ҵ� �ȿ��� ȣ���Ѵ�.
//		1. �Ķ���Ͱ� �ְ� ������� �ִ� �޼ҵ� ȣ���
//		���1)
		int rs = add(1, 2); //add�޼ҵ� ȣ����. �� 1,2�� ���� ����
		System.out.println("1 + 2 = " + rs);	//������ ���� ��ȯ�޾Ƽ� ������ ����ǰ� ������ �����
//		���2)
		System.out.println("3 + 4 = " + add(3, 4));	//��½ÿ� �ٷ� add�޼ҵ� ȣ���ؼ� ����� �����
//		���3)
		int a1, a2;
		a1 = scan.nextInt();
		a2 = scan.nextInt();
		System.out.println(a1 + " + " + a2 + " = " + add(a1, a2)); 
		
//		2.	�Ķ���� O, ��ȯ�� X �޼ҵ�	
		sub(a1, a2);
		
//		3.	�Ķ���� X, ��ȯ�� O �޼ҵ�	 
		rs = mul();
		
//		4. �Ķ���� X, ��ȯ�� X �޼ҵ�	
		div();
		
	}//main �޼ҵ� ��
	
//1	�Ķ���� O, ��ȯ�� O �޼ҵ�
//	�ΰ��� ���� �Է� �޴� �޼ҵ�
//	����� ��ȯ�ϴ� �޼ҵ�
//	�޼ҵ� �̸� �տ� ���̴� �ڷ����� ��ȯ�Ǵ�(���) ���� �ڷ����� ���δ�. -> ��ȯ�� (��1 ����)
	public static int add(int a, int b) {//�Ķ���͸� �����ϱ� ���� ���� : �Ű� ���� (�Լ����� �Է°��� ������ ���� �޴� ����)

		int c, d; //�̷��� �޼ҵ� �ȿ��� ȣ���ϰ� �Ǹ� �Է°��� �ޱ����� �����δ� ��� �Ұ���
		int result = a + b;
		return result;
	}
	
//��1
//	��ȯ���� return�� ������ ���������� ������! (�Է°��� int��� �߰��� float���� ��ȯ������� float���� �ٲ������)
//	public static float divide(int a, int b) {//�Ķ���͸� �����ϱ� ���� ���� : �Ű� ���� (�Լ����� �Է°��� ������ ���� �޴� ����)
//
//		int c, d; //�̷��� �޼ҵ� �ȿ��� ȣ���ϰ� �Ǹ� �Է°��� �ޱ����� �����δ� ��� �Ұ���
//		int result = (float)a / b;
//		return result;
	

//2	�Ķ���� O, ��ȯ�� X �޼ҵ�
	public static void sub(int a, int b) {//return�� ���� ��� ��ȯ���� void ����
		int result = a - b;
		System.out.println(a + " - " + b + " = " + result);
	}


//3	�Ķ���� X, ��ȯ�� O �޼ҵ�
	public static int mul() {
		int a = scan.nextInt();
		int b = scan.nextInt();
		int result = a * b;
		return result;	
	}

//4	�Ķ���� X, ��ȯ�� X �޼ҵ�
	public static void div() {
		int a = scan.nextInt();
		int b = scan.nextInt();
		int result = a / b;
		System.out.println(a + " / " + b + " = " + result);
	}
		
	
}

//call stack�� �޼ҵ带 ȣ���ϱ� ���� ����
//�׷��� call stack���� �׻� main �޼ҵ尡 �������
