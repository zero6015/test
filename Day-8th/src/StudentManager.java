import java.util.Scanner;

public class StudentManager {

	public static void main(String[] args) {
//1		�л� ���� ���α׷�
//		1. �̸�
//		2. �а�
//		3. ����ó
//		4. �й�
//		5. ����
		
		final int MAX = 3;	//
		
		String names[] = new String[MAX];
		String major[] = new String[MAX];	
		String phone[] = new String[MAX];	
		String sNumber[] = new String[MAX];	
		float avg[] = new float[MAX];	
		int select = 0; //�޴� �Է� ���� ����
		
		Scanner scan = new Scanner(System.in);

		System.out.println("-- �л� ���� ���α׷� --");
		
		while(true) {
			
			//�Ʒ� ��±���� �ϳ��� ���ο� �޼ҵ�� ���� ȣ�����൵ ��. ex) select = printMenu();
			System.out.println("<< �޴� >>");
			System.out.println("1. ���� �Է�");
			System.out.println("2. ���� ���");
			System.out.println("3. ����");
			System.out.print("���� > ");
			select = scan.nextInt();
//���2)	String selstr = scan.nextLine();
//			select = Integer.parseInt(selstr); //���ڿ� -> ����
			
			
			//���� ó���� �޴� : ����
			if(select == 3) {
				System.out.println("�����մϴ�.");
				break;
			}
			
			switch (select) {
			case 1://�Է¸޴�
				//���� Ÿ��Ʋ ���
				System.out.println("�л� ���");
			    for (int i = 0; i < MAX; i++) {
			    	System.out.println("--------------------");
			    	scan.nextLine();	//���ۿ� �ִ� ���� ���� ���1) 
					System.out.print("�̸� : ");
					names[i] = scan.nextLine();
					System.out.print("�а� : ");
					major[i] = scan.nextLine();
					System.out.print("����ó : ");
					phone[i] = scan.nextLine();
					System.out.print("�й� : ");
					sNumber[i] = scan.nextLine();
					System.out.print("��� : ");
					avg[i] = scan.nextFloat();
//���3)			String fStr = scan.nextLine();
//					avg[i] = Float.parseFloat(fStr);  //���ڿ� -> �Ǽ�
				}
				break;
			case 2://��¸޴�
				System.out.println("�л� ���� ���");
			    for (int i = 0; i < MAX; i++) {
			    	System.out.println("--------------------");
					System.out.println("�̸� : " + names[i]);
					System.out.println("�а� : " + major[i]);
					System.out.println("����ó : " + phone[i]);
					System.out.println("�й� : " + sNumber[i]);
					System.out.println("��� : " + avg[i]);
			    }
				break;				

			default://�߸��� �޴� �Է�
				break;
			}
		}
		
		
	}

}

//�޼ҵ�(���) - �Լ�
//�Լ���� ������ java���� �޼ҵ�� ����
//�Լ� -> �Ϲ� ó���ÿ� ���Ǵ� ���
//�޼ҵ� -> ��ü���� ȯ�濡���� �޼ҵ��� ��� ���
//
//
//�޼ҵ��
//�ϳ� �Ǵ� �������� ����� ��� ���������� ����� �� �ִ� ���α׷� ���� ����. (����̶�� �մϴ�)
//�Է°�(�Ķ����)�� �־��ָ� �ش� ����� ó���ϰ� ��°��� �ǵ��� �ش�(��ȯ�Ѵ�).
//
//�޼ҵ� Ư¡
//�޼ҵ� ���ο� �޼ҵ� �߰� �ۼ� �ȵ�
//�޼ҵ�� Ư�� ����� �����ϱ����� �߶���� ��
//
//�޼ҵ� ����
//1. �Ķ���Ϳ� ��ȯ���� ��� �����ϴ� �޼ҵ�
//2. �Ķ���ʹ� �����ϳ� ��ȯ���� ���� �޼ҵ�  ��) main�޼ҵ� : �Է°��� ������ ��°��� ���� �޼ҵ�
//3. �Ķ���ʹ� ������ ��ȯ���� �����ϴ� �޼ҵ�
//4. �Ѵ� ���� �޼ҵ�
//
//
//
//
//












