package controller;

import java.util.Scanner;

import dto.PhoneInfo;

//��ȭ��ȣ�� ������ �������̶� ���� �غ���2222 - �����ε� Ȱ���ؼ� UseClass2 �����غ���
public class UseClass2_1 {

	private static PhoneInfo pInfo = new PhoneInfo();
	private static Scanner scan = new Scanner(System.in);

	public static void main(String[] args) {
		PhoneInfo pInfo2 = new PhoneInfo();
		
		while (true) {
			System.out.println("�޴��� �����ϼ���.");
			System.out.println("----------------");
			System.out.println("1.������ �Է�");
			System.out.println("2.������ �Է�(���޹��)");
			System.out.println("0.���α׷� ����");
			System.out.println("----------------");
			System.out.print("����: ");
			

			
			int menu = Integer.parseInt(scan.nextLine());
			
			//���� ó��
			if (menu == 0) {
				System.out.println("���α׷��� ����Ǿ����ϴ�.");
				break;
			}
			
			switch (menu) {
			case 1://�Է�ó��
				inputData();
				break;
			case 2://���� �ν��Ͻ��� �����Ͽ� �Է�ó�� 
				inputData(pInfo2);
				break;
			default://1,2���� �ƴ� ��ȣ�� ������ ��� ó��
				System.out.println("�߸� �Է��ϼ̽��ϴ�.");
				break;
			}			
		}
		
	}//���� �޼ҵ� ��
	
	private static void inputData() {
		//�Է� �ޱ�
		System.out.print("�̸�: ");
		pInfo.setName(scan.nextLine());
		System.out.print("��ȭ��ȣ : ");
		pInfo.setPhoneNum(scan.nextLine());
		System.out.print("������� : ");
		pInfo.setBirth(scan.nextLine());
		
		//�Է� ���� ����ϱ�
		System.out.println("�Էµ� ���� ���...");
		pInfo.showPhoneInfo();
	}
	
	//�����ε� : ���� �̸��� �޼ҵ带 ������ ����.
	private static void inputData(PhoneInfo p) {

		System.out.print("�̸� : ");
		pInfo.setName(scan.nextLine());
		System.out.print("��ȭ��ȣ : ");
		pInfo.setPhoneNum(scan.nextLine());
		System.out.print("������� : ");
		pInfo.setBirth(scan.nextLine());
		
		//���
		System.out.println("�Էµ� ���� ���...");
		System.out.println("name : " + p.getName());
		System.out.println("phone : " + p.getPhoneNum());
		System.out.println("birth : " + p.getBirth());
		
	}

}//Ŭ���� ��























