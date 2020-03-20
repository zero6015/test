package dto;

//단계별 실습 문제) 연락처 프로그램 구현
//1단계>
//   연락처 정보 저장용 클래스
//      생성자를 사용하여 연락처 정보를 입력한다.
//      연락처 정보 - 이름, 전화번호, 생일
//      이름과 전화번호는 반드시 필요한 정보.
//      생일은 생략 가능.
//   입력한 정보를 출력할 수 있는 메소드 포함   

public class PhoneInfo {
	private String name;//이름
	private String phoneNum;//전화번호(연락
	private String birth;//생일
	
	
//	getter/setter생성 (생성 이유 : 내가 정한 규칙에 맞게 입출력을 하기 위해서)
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
	
	
	
	//기본생성자 -> 아무일도 안함, 없으면 인스턴스 생성이 안되기 때문에 그냥 만들어 준것
	public PhoneInfo() {
	}
	//생일을 생략하고 입력하는 생성자
	public PhoneInfo(String name, String phoneNum) {
		this.name = name;
		this.phoneNum = phoneNum;
	}
	
	//생일까지 입력하는 생성자
	public PhoneInfo(String name, String phoneNum, String birth) {
		this.name = name;
		this.phoneNum = phoneNum;
		this.birth = birth;
	}
	
	//정보 출력용 메소드
	public void showPhoneInfo() {
		System.out.println();
		System.out.println("입력된 정보 출력..");
		System.out.println("이름 : " + name);
		System.out.println("연락처 : " + phoneNum);
		//생일을 입력한 경우 출력
		if (birth != null && !birth.equals("")) {
			System.out.println("생일 : " + birth);
		}
		System.out.println();
		
	}
}
