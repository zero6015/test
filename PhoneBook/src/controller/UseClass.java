package controller;

import java.util.Scanner;

import dto.PhoneInfo;

public class UseClass {

	public static void main(String[] args) {
//1		//2��� ����ó �Է�
//		PhoneInfo pInfo1 = new PhoneInfo("ȫ�浿", "1111-2222", "90/08/30");
//		PhoneInfo pInfo2 = new PhoneInfo("����ġ", "2222-3333");
//		
//		//���
//		pInfo1.showPhoneInfo();
//		pInfo2.showPhoneInfo();

//2		//2����� ������ �Է¹޾Ƽ� ����
//		Scanner scan = new Scanner(System.in);
//		//ù��° ��� ����
//		String name = scan.nextLine();
//		String phoneNum = scan.nextLine();
//		String birth = scan.nextLine();
//		
//		PhoneInfo pInfo3 = new PhoneInfo(name, phoneNum, birth);
//		
//		//�ι�° ��� ����
//		name = scan.nextLine();
//		phoneNum = scan.nextLine();
//		
//		PhoneInfo pInfo4 = new PhoneInfo(name, phoneNum);
//		
//		System.out.println("-----------------------------");
//		pInfo3.showPhoneInfo();
//		System.out.println("-----------------------------");
//		pInfo4.showPhoneInfo();
		
//3 �������� ��Ű�� ��ȭ��ȣ�� ������(showPhoneInfo �޼ҵ� ���� getter/setter�� �ڵ��غ���)
		while(true) {

			bodyPrint();
			
			Scanner scan = new Scanner(System.in);
			int input = scan.nextInt();

			//���α׷� ����
			if (input == 2) {
				System.out.println("���α׷��� ����Ǿ����ϴ�.");
				break;
			}
			else if(input == 1) {
				scan.nextLine();
				System.out.print("�̸�: ");
				String name = scan.nextLine();
				System.out.print("��ȭ��ȣ: ");
				String phoneNum = scan.nextLine();
				System.out.print("�������: ");
				String birth = scan.nextLine();
				
				PhoneInfo pInfo = new PhoneInfo();
				
				pInfo.setName(name);
				pInfo.setPhoneNum(phoneNum);
				pInfo.setBirth(birth);
				
//				pInfo.showPhoneInfo();
				System.out.println();
				System.out.println("name : " + pInfo.getName());
				System.out.println("phone : " + pInfo.getPhoneNum());
				System.out.println("birth : " + pInfo.getBirth());
				System.out.println();
			}
		}
	}
	
	public static void bodyPrint() {
		System.out.println("�޴��� �����ϼ���.");
		System.out.println("----------------");
		System.out.println("1.������ �Է�");
		System.out.println("2.���α׷� ����");
		System.out.println("----------------");
		System.out.print("����: ");
	}
	
	
	
}

























