package dto;

public class PhoneInfo {
	//���⼭ ����� �ʵ尡 �Է� �۾��� ���� �¿���~
//	�̸� ��ȭ��ȣ �������
	private String name;
	private String phoneNum;
	private String birth;
	
	public PhoneInfo() {}//�⺻������
	


	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getPhoneNum() {
		return phoneNum;
	}

	public void setPhoneNum(String phoneNum) {
		this.phoneNum = phoneNum;
	}

	public String getBirth() {
		return birth;
	}

	public void setBirth(String birth) {
		this.birth = birth;
	}

	//���� ��¿� �޼ҵ�
	public void showPhoneInfo() {
		System.out.println();
		System.out.println("�Էµ� ���� ���..");
		System.out.println("�̸� : " + name);
		System.out.println("����ó : " + phoneNum);
		System.out.println("���� : " + birth);
		System.out.println();
		
	}
	
}//Ŭ���� ��