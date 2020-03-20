package dto;

public class PhoneInfo {
	//여기서 만드는 필드가 입력 작업의 양을 좌우함~
//	이름 전화번호 생년월일
	private String name;
	private String phoneNum;
	private String birth;
	
	public PhoneInfo() {}//기본생성자
	


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

	//정보 출력용 메소드
	public void showPhoneInfo() {
		System.out.println();
		System.out.println("입력된 정보 출력..");
		System.out.println("이름 : " + name);
		System.out.println("연락처 : " + phoneNum);
		System.out.println("생일 : " + birth);
		System.out.println();
		
	}
	
}//클래스 끝