import java.util.Scanner;

public class ControlTest02 {

	public static void main(String[] args) {
//1		���ǹ� switch
//		���� �б⸦ ���� �¾ ��� : case, default
//		��Ÿ ��� : break
		Scanner scan = new Scanner(System.in);
		
//2		//11 - sk, 16 - kt, 19 - LG
		System.out.print("��ȣ �Է� : ");
		int num = scan.nextInt();
		
		switch (num) {
		case 11:
			System.out.println("SK�Դϴ�.");
			//�߰� ��ɾ� �ۼ�
			break;
		case 16:
			System.out.println("KT�Դϴ�.");
			//�߰� ��ɾ� �ۼ�
			break;
		case 19:
			System.out.println("LG�Դϴ�.");
			//�߰� ��ɾ� �ۼ�
			break;
		default:
			System.out.println("��Ÿ ����Դϴ�.");		//�� 3���� ���̽��� �ش���� �ʴ� ��� ���̽����� default�� ó����
			//�߰� ��ɾ� �ۼ�
			break;
		}
		
//3		������� (switch��)
		System.out.print("���� �Է� : ");
		Scanner scan1 = new Scanner(System.in);
		
		int score = scan1.nextInt();
		String grade="";
		
		switch (score/10) {
		case 10:
			grade = "A";
			break;
		case 9:
			if (score%10 >= 5) { System.out.println("A+");}		//�̰� �׳� A+/A0 ��������~
			if (score%10 < 5) { System.out.println("A0");}
			grade = "A";
			break;
		case 8:
			grade = "B";
			break;	
		case 7:
			grade = "C";
			break;
		case 6:
			grade = "D";
			break;	
		default:
			grade = "F";
			break;
		}
		
		System.out.println(grade);
		
		
		
	}

}
