package controller;

import java.util.Scanner;

import dto.PhoneInfo;

//��ȭ��ȣ�� ������ �������̶� ���� �غ���
public class UseClass2_0 {
	//�� �ν��Ͻ� ���� �޼ҵ忡�� ���� ���� ��� 1) ���� �޼ҵ忡�� �ν��Ͻ��� ����ؾ��ϱ⶧���� Ŭ���� ��, �޼ҵ� �ۿ� static��� ��������
	private static PhoneInfo pInfo = new PhoneInfo();//��������: �����ڴ� �Ϲ������� �ٸ� ��Ű������ ����ϱ� ������ ������ �տ��� public �����ڸ� �ٿ��ִ°��� ����
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		
		while (true) {
			System.out.println("�޴��� �����ϼ���.");
			System.out.println("----------------");
			System.out.println("1.������ �Է�");
			System.out.println("2.���α׷� ����");
			System.out.println("----------------");
			System.out.print("����: ");
			
			//*********�뻧�߿�**********
			//���ڿ� -> ���� ��ȯ ���
			// ���� : Integer.parseInt("���ڿ�:)
			
			int menu = Integer.parseInt(scan.nextLine());
			//Scanner�� ����: ����(����,�Ǽ�) �Է� �Ŀ� ���ڿ��� ���� �� ����.
			//���ڿ��� �ޱ� ���� ���� �Է� �� scan.nextLine()�� �ѹ� ����Ѵ�.
			//�Ǵ� ��� �Է��� ���ڿ��� �Է¹ް� �ش� �����ͷ� ��ȯ�Ѵ�
			
			//���� ó��
			if (menu == 2) {
				System.out.println("���α׷��� ����Ǿ����ϴ�.");
				break;
			}
			
			switch (menu) {
			case 1://�Է�ó��
				inputData();
				break;

			default://1,2���� �ƴ� ��ȣ�� ������ ��� ó��
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				break;
			}			
		}
		
	}//���� �޼ҵ� ��
	
	//�Է� ó���� ���� �޼ҵ� (static�� �ٿ��ִ� ���� : main���� �� �޼ҵ带 ȣ���ؼ� ����Ҳ��� ������ static�ɹ��� static����� ȣ���� �� �ִ�.
	//��, static �޼ҵ�� static ����� ����� �� �ֱ� ������ static�� main�޼ҵ忡�� ȣ���Ϸ��� static �޼ҵ尡 �Ǿ����.
	private static void inputData() {
		//�Է� �ޱ�
		System.out.print("�̸� : ");
//		String name = scan.nextLine();
//		pInfo.setName(name);
		//�� ������ ���ļ� �Ʒ� ���� ó�� �ٿ��� �� �ִ�!!
		pInfo.setName(scan.nextLine());
		System.out.print("��ȭ��ȣ : ");
//		String phoneNum = scan.nextLine();
		pInfo.setPhoneNum(scan.nextLine());
		System.out.print("������� : ");
//		String birth = scan.nextLine();
		pInfo.setBirth(scan.nextLine());
		
		//�Է� ���� ����ϱ�
		System.out.println("�Էµ� ���� ���...");
		pInfo.showPhoneInfo();
	}
	

}//Ŭ���� ��
























