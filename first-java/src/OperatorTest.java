import java.util.Scanner;

//������ : ���Կ�����/���������/����������/�񱳿�����/��������/���ǿ�����
public class OperatorTest {

	public static void main(String[] args) {
		
		/*
		//1. ��� ������ : +, -, *, /, %
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("������ ����");
		System.out.println("=============");
		
		int num1, num2, result;		//���� ������ Ÿ���� ��� ���ٷ� ���� ����, ���� �ٿ��� ���� �ʱ�ȭ�� ����
		
		System.out.print("ù ��° �� : ");
		num1 = scan.nextInt();
		System.out.print("�� ��° �� : ");
		num2 = scan.nextInt();
		
		result = num1 + num2;
		System.out.println("������� : " + result);

		result = num1 - num2;
		System.out.println(",������� : " + result);

		result = num1 * num2;
		System.out.println("������� : " + result);

		result = num1 / num2;
		System.out.println("��������� : " + result);

		result = num1 % num2;
		System.out.println("��������� : " + result);
		
		*/
		/*
		
		//2. ���� ������ : ++, --, +=, -=
		//++, -- : 1�� ���� �Ǵ� ���� ��Ű�� ������
		//���� �������̱⵵ ��.
		
			
		int i = 0;
		i++;  // i = i + 1; i +=1; �� ���� �ǹ�
		System.out.println(i);
		
		i = 0;
		++i;
		System.out.println(i);
		
		//������, �������� �� - ���������� ���������� ��� ���ϴ��� Ȯ���غ���
		int j = 0, k = 0, l = 0;
		j++;
		k = j++;
		System.out.println("�������� : " + j);		
		j = 0;
		l = ++j;
		System.out.println("�������� : " + j);
		System.out.println(k + ", " + l);
		
		int h = 0;
		h += 2;				//2���� ������
		System.out.println(h);
		
		*/
		
		/*
		//3. �� ������ : ==, !=, >, >=, <, <=
		// == ������ (����� : ��/����)
		// != �ٸ��� (����� : ��/����)
		int n1 = 4, n2 = 5;
		System.out.println(n1 == n2);
		System.out.println(n1 != n2);
		System.out.println(n1 > n2);
		System.out.println(n1 >= n2);
		System.out.println(n1 < n2);
		System.out.println(n1 <= n2);
		boolean b = (n1 == n2);		//�� ����� ������ ����
		System.out.println(b);
		
		
		int year = 0;
		boolean yoon = (year % 4) == 0;
		yoon = (year % 100) != 0;
		yoon = (year % 400) == 0;
		
		*/
//		4. �� ������(����� boolean) : AND, OR, NOT, XOR
//		AND => &&, OR => ||
//		Scanner scan = new Scanner(System.in);
//		int number = scan.nextInt();		//������� �Է°��� �ʱⰪ���� ����ϴ� ����
//		
//		boolean b = false;
//		
//		b = (number > 0) && (number < 5);
//		System.out.println(b);
//		
//		b = (number <= 0) || (number >= 5);
//		System.out.println(b);
//		
//		b = (number > 0) && (number++ < 5); //�̷��� ���� ���̳� ���� ������ �� ������ ������ �ȵ� ���� ������ ����ũ�� ���̱� ���� ������ �񱳽Ŀ��� ������������!
//		b = (number <= 0) || (number++ >= 5);

		
//		�Է��� ���� �������� �������� �Ǻ��ϴ� ���α׷�
//		Scanner scan = new Scanner(System.in);
//		
//		char ch = '\0'; //null ���ڷ� �ʱ�ȭ
//		String str = scan.next();	//���ڿ� �Է¹ޱ�
//		ch = str.charAt(0);		// ���ڿ� -> ���� ��ȯ
//
//		boolean b = ((ch >= 'a') && (ch <= 'z')) || ((ch >= 'A') && (ch <= 'Z'));		//�� ������ �켱���� �켱ó�� ���� �����ֱ� ���ؼ� ��ȣ�� �����ֱ� 
//		System.out.println(b);
		

//		System.out.println("���� ���� \n������ �Է� :  ");
//		Scanner scan = new Scanner(System.in);
//		int year = scan.nextInt();
//		
//		boolean b = (((year % 4) == 0) && ((year % 100) != 0)) || ((year % 400) == 0);
//		System.out.println(b);
		

//		5. ���ǿ�����
//		(����/����/���ͷ��� ������ ����)���׿�����
//		(���ǽ�) ? A : B; -> ���ǽ��� true �� ��� A ����, ���ǽ��� false�� ��� B ����
//
//		���밪 ���ϱ� (-10 -> 10)
//		System.out.print("���밪 ���ϱ� : ");
//		int x = -10;
//		int absX = 0;	//���밪 ���� ����
//		absX = (x >= 0) ? x : -x;
//		System.out.println(absX);

//		Scanner scan = new Scanner(System.in);
//		int gr = scan.nextInt();
//		
//		String grade = (gr >= 60) ? "pass" : "fail";
//		System.out.println(grade);
//		
//		String grade2 = (gr >= 90) ? "A" : (gr >= 60) ? "B" : "C";
//		System.out.println(grade2);
		
		
	}
	
}
