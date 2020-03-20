package controller;

import java.sql.Array;
import java.util.ArrayList;
import java.util.Scanner;

import dto.PhoneInfo;

public class UseClass {
	
	//���� ����(�ʵ�) : ����ó ���� ����
	//�÷��� �����ӿ�ũ �� ArrayList ��� -> ũ�� ������ ����(���ϴ� ��ŭ �Է� ����)
//	���1)
	private static ArrayList<PhoneInfo> pList = new ArrayList<PhoneInfo>();
//	���2)
//	private static PhoneInfo pListArr[] = new PhoneInfo[10];
//	���3)
//	private static ArrayList<String> strArr = new ArrayList<String>();
	
	//Array ����� ����
	//ArrayList<��ü> �̸� = new ArrayList<��ü>()��;
	
	//�Է�, ���
	private static Scanner scan = new Scanner(System.in);
	
	public static void main(String[] args) {
//		������ �ϴ� ��
//		1. Ÿ��Ʋ ���
//		2. �޴� ���
//		3. �޴����� �б� ó��
//		1~3���� ���ᰡ �Ǳ� ������ �ݺ�.
		int menu = 0;
		
		while (true) {
			System.out.println();
			System.out.println("����ó ���α׷�");
			System.out.println("�޴��� �����ϼ���");
			System.out.println("---------------------");
			System.out.println("1. ������ ���");
			System.out.println("2. ������ �˻�");
			System.out.println("3. ������ ����");
			System.out.println("0. ����");
			System.out.println("---------------------");
			System.out.print("���� : ");
			menu = Integer.parseInt(scan.nextLine());
			
			//���� ó��
			if(menu == 0) {
				System.out.println("���α׷� ����");
				break;
			}
			
			switch (menu) {
			case 1://�������Է� ��� -> �޼ҵ�� ����
				inputData();
				break;
			case 2://�����Ͱ˻� ��� -> �޼ҵ�� ����
				selectData();
				break;
			case 3://�����ͻ��� ��� -> �޼ҵ�� ����
				
				break;

			default:
				break;
			}
			
			
			
			
			
			
		}
	}

//	selectData �޼ҵ� for�� ó�� ���1)
	private static void selectData() {
//		������ �˻�: �ϳ��� �� -> �̸� ���ؼ� ��ȭ��ȣ , ���ϱ��� ���
//		ArrayList�� ����� �ν��Ͻ��� name�ʵ�� �� -> ������ �� �ν��Ͻ��� ��� ���� ���
//		���ڿ��� �� : equals(�̸�);
		
		//�����Ͱ� ���ٸ� �˻� ������ ��� ó���� �ʿ䰡 ����
		if (pList.size() == 0) {
			//����� �ν��Ͻ��� ����.
			System.out.println("�Էµ� �����Ͱ� �����ϴ�.");
			return;	//�޼ҵ� �߰����� �޼ҵ带 �ߴ��ϰ� �ٽ� ���ư����� �� 'return'��� 
		}
		
		//�˻�(ã���� �ϴ�) �̸��� �Է� �޴´�.
		System.out.println("�˻� �̸� : ");
		String sname = scan.nextLine();
		boolean isSearch = false;
		
		//ArrayList�� ù��° �ν��Ͻ��� name �ʵ���� ������ �ν��Ͻ��� name �ʵ�� sname�� ������ ��
		for (PhoneInfo p : pList) {
			if (sname.equals(p.getName())) {
				//�˻� ���� -> ���
				p.showPhoneInfo();
				isSearch = true;	//�˻� ����� ���� ��� true
				//�� �̻� �˻��� �ʿ� ���� -> �ݺ��� ����
				break;
			}
		}
		
		if(isSearch == false) {//�˻������ ���� ��� ������� ����
			System.out.println("�˻� ��� ����.");
		}
		
	}
	
//	selectData �޼ҵ� for�� ó�� ���2)
//	private static void selectData2() {
//
//		System.out.println("�˻� �̸� : ");
//		String sname = scan.nextLine();
//		int j;
//		
//		for (int j = 0; j < pList.size(); j++) {
//			PhoneInfo p = pList.get(j);
//			if (sname.equals(p.getName())) {
//				p.showPhoneInfo();
//				break;
//			}
//		}
//		
//		if(j == pList.size()) {//�˻������ ���� ��� ������� ����
//			System.out.println("�˻� ��� ����.");
//		}
//		
//	}
	
	
	private static void inputData() {
//		ArrayList�� ���� �����ϴ� ���
//		1. �����ϰ����ϴ� �����͸� �����ϴ� �ν��Ͻ� ����
		PhoneInfo pInfo = new PhoneInfo();
//		2. �� �ν��Ͻ��� ������ �Է�
		System.out.print("�̸� : ");
		pInfo.setName(scan.nextLine());
		System.out.print("��ȭ��ȣ : ");
		pInfo.setPhoneNum(scan.nextLine());
		System.out.print("���� : ");
		pInfo.setBirth(scan.nextLine());
		//		3. ArrayList �ν��Ͻ��� �߰�
		pList.add(pInfo);
		
	}
	

}
