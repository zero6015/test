import java.util.Scanner;

public class MoneyBook {

	public static void main(String[] args) {
//		�� ����
//
//		����� ���α׷� �����
//		�迭�� ����Ͽ� ����� ���α׷��� ����ϴ�.
//		10�� ������ �ۼ��ϱ�
//		����, ����
//
//		�ܾ�, ��ü ���� �ݾ�, ��ü ���� �ݾ��� ��µǵ���.
//		��ü ���� ���(�������� �ܾ� ���)
//
//		�Է� ������
//		��¥, �ݾ�, ����/����, (����)
//
//		�޴�
//		1. ���� ���
//		2. ��ü ���
//		3. ���� ���
//		4. ���� ���
//		5. ����
		
		final int MAX = 2;
		
		String date[] = new String[MAX];
		int money[] = new int[MAX];	
		int inMoney[] = new int[MAX];	
		int outMoney[] = new int[MAX];	
		String List[] = new String[MAX];
		int balance = 0;
		int totalInMoney = 0;
		int totalOutMoney = 0;
		String totalList[] = new String[MAX];
		
		int select = 0; //�޴� �Է� ���� ����
		int input;
		
		Scanner scan = new Scanner(System.in);
		
		System.out.println("-- ����� ���α׷� --");
		
		while(true) {
			
			System.out.println("<< �޴� >>");
			System.out.println("1. ���� ���");
			System.out.println("2. ��ü ���");
			System.out.println("3. ���� ���");
			System.out.println("4. ���� ���");
			System.out.println("5. ����");
			System.out.print("���� > ");
			select = scan.nextInt();
			
			
			if(select == 5) {
				System.out.println("�����մϴ�.");
				break;
			}
			
			
			switch (select) {//		��¥, �ݾ�, ����/����, (����)
			case 1:
				System.out.println("���� ���");
			    for (int i = 0; i < MAX; i++) {
			    	System.out.println("--------------------");
			    	scan.nextLine();	//���ۿ� �ִ� ���� ���� ���1) 
					System.out.print("��¥ : ");
					date[i] = scan.nextLine();
					System.out.print("�ݾ� : ");
					money[i] = scan.nextInt();
					System.out.print("����: 1���Է� /����: 2���Է� : ");
					input = scan.nextInt();
					if(input == 1){
						inMoney[i] = money[i];
						totalInMoney += inMoney[i];
					}
					else if(input == 2){
						outMoney[i] = money[i];
						totalOutMoney += outMoney[i];
					}
//					System.out.print("���� : ");
//					inMoney[i] = scan.nextInt();
//					System.out.print("���� : ");
//					outMoney[i] = scan.nextInt();
					System.out.print("���� : ");
					List[i] = scan.next();
			    }
				break;
				
			case 2:
				System.out.println("��ü ���");
			    for (int i = 0; i < MAX; i++) {
			    	System.out.println("--------------------");
					System.out.println("��¥ : " + date[i]);
				//	System.out.println("�ݾ� : " + money[i]);
					System.out.printf("�ݾ� : %,d��%n", money[i]);
				//	System.out.println("���� : " + inMoney[i]);
					System.out.printf("���� : %,d��%n", money[i]);
				//	System.out.println("���� : " + outMoney[i]);
					System.out.printf("���� : %,d��%n", money[i]);
					System.out.println("���� : " + List[i]);
					System.out.println(); 
			    }
			    break;
			 case 3:
				 System.out.println();
				 System.out.println("���� ���");
				 for (int i = 0; i < MAX; i++) {
					 System.out.printf("���� �ݾ� : %,d��%n", money[i]);
					 
				 }
				 System.out.println("��ü ���� �ݾ� : " + totalInMoney);
				 break;
			 case 4:
				 System.out.println();
				 System.out.println("���� ���");
				 for (int i = 0; i < MAX; i++) {
					 System.out.printf("���� �ݾ� : %,d��%n", outMoney[i]);
					 
				 }
				 System.out.printf("��ü ���� �ݾ� : %,d��%n", totalOutMoney);
				 break;
			 case 5:
				 System.out.println("���� ���");
				 for (int i = 0; i < MAX; i++) {
					 System.out.println("���� ��� : "+ i + " " + totalList[i]);
				 }
				 break;
			default:
				break;
				
			}
			

			balance = totalInMoney - totalOutMoney;
			System.out.printf("�ܾ� : %,d��%n", balance);
			
			
		}
		
	}

}
