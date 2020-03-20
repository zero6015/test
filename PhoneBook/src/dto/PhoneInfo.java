package dto;

//�ܰ躰 �ǽ� ����) ����ó ���α׷� ����
//1�ܰ�>
//   ����ó ���� ����� Ŭ����
//      �����ڸ� ����Ͽ� ����ó ������ �Է��Ѵ�.
//      ����ó ���� - �̸�, ��ȭ��ȣ, ����
//      �̸��� ��ȭ��ȣ�� �ݵ�� �ʿ��� ����.
//      ������ ���� ����.
//   �Է��� ������ ����� �� �ִ� �޼ҵ� ����   

public class PhoneInfo {
	private String name;//�̸�
	private String phoneNum;//��ȭ��ȣ(����
	private String birth;//����
	
	
//	getter/setter���� (���� ���� : ���� ���� ��Ģ�� �°� ������� �ϱ� ���ؼ�)
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
	
	
	
	//�⺻������ -> �ƹ��ϵ� ����, ������ �ν��Ͻ� ������ �ȵǱ� ������ �׳� ����� �ذ�
	public PhoneInfo() {
	}
	//������ �����ϰ� �Է��ϴ� ������
	public PhoneInfo(String name, String phoneNum) {
		this.name = name;
		this.phoneNum = phoneNum;
	}
	
	//���ϱ��� �Է��ϴ� ������
	public PhoneInfo(String name, String phoneNum, String birth) {
		this.name = name;
		this.phoneNum = phoneNum;
		this.birth = birth;
	}
	
	//���� ��¿� �޼ҵ�
	public void showPhoneInfo() {
		System.out.println();
		System.out.println("�Էµ� ���� ���..");
		System.out.println("�̸� : " + name);
		System.out.println("����ó : " + phoneNum);
		//������ �Է��� ��� ���
		if (birth != null && !birth.equals("")) {
			System.out.println("���� : " + birth);
		}
		System.out.println();
		
	}
}
