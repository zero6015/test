import java.util.Scanner;

public class PrintfTest {

	public static void main(String[] args) {
		
		//printf : ������� ���� ���
		//("����� ����", ����..)
		System.out.println("���ڿ�");
		
		/*
		int num = 10;
		
		System.out.println("num ������ ���� 10");			//���α׷� �ۼ��ڸ��� 10�� ���̶��� �� �� �����ϱ�
		System.out.printf("num ������ ���� %d", num);		//������ ȣ���ؼ� �������
		
		
		Scanner scan = new Scanner(System.in);
		//��ü = �ν��Ͻ�(instance)
		//new Ű����� �ν��Ͻ��� �����ϴ� ��ɾ�
				
		int num = 10;
		
		num = scan.nextInt();
		
		System.out.printf("num ������ ���� %d\n", num);
		*/
		//������ 2�� ���
		int dan = 2;
		int m = 1;
		System.out.printf("2��\n"); 	//�ٹٲ� : \n OR %n
		System.out.printf("=============%n");
		System.out.printf("%d * %d = %5d\n", dan, m, dan*m);		//�տ� %d�� 3���� �������� �ڿ� ��ġ�Ǵ� ������ 3���� �;��Ѵ�. (%-5d�� �ڸ��� �ڷ� ä�����°͵� Ȯ���غ���)
		m = m + 1;													//%���� : �ڸ����� ����
		System.out.printf("%d * %d = %5d\n", dan, m, dan*m);
		m = m + 1;
		System.out.printf("%d * %d = %5d\n", dan, m, dan*m);
		m = m + 1;
		System.out.printf("%d * %d = %5d\n", dan, m, dan*m);
		m = m + 1;
		System.out.printf("%d * %d = %5d\n", dan, m, dan*m);
		m = m + 1;
		System.out.printf("%d * %d = %5d\n", dan, m, dan*m);
		m = m + 1;
		System.out.printf("%d * %d = %5d\n", dan, m, dan*m);
		m = m + 1;
		System.out.printf("%d * %d = %5d\n", dan, m, dan*m);
		m = m + 1;
		System.out.printf("%d * %d = %5d\n", dan, m, dan*m);
		m = m + 1;
		System.out.printf("%d * %d = %5d\n", dan, m, dan*m);
		m = m + 1;
		
		
		//�ݾ����
		System.out.printf("��÷ %,d��%n", 100000000);		//õ������ ,���
		//���� ��ü(0����) ���
		System.out.printf("%010d%n", 123);		//������ 0���� ä��� �ڸ����� 10ĭ
		//10���� -> 16���� ���					//octa
		System.out.printf("%x%n", 123);
		//10���� -> 8���� ���					//hexa
		System.out.printf("%o%n", 123);
		
		//�Ǽ� ���
		System.out.printf("%6.3f", 3.3);		//�� 6�ڸ��� ����ϰ� �Ҽ��� �ڿ� 3�ڸ� ����Ѵ�. -> ���� �տ� ��ĭ ���ڸ����� �����ؼ� ��µ�(�Ҽ����� �ڸ����� ����)
				
	}

}
