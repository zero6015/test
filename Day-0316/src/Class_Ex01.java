
public class Class_Ex01 {//파일 이름과 같은 이름의 클래스 앞에만 public 붙일 수 있음

	public static void main(String[] args) {
		//인스턴스 만들기. 인스턴스 참조 변수
		Tv myTv = new Tv();
		
		//Tv 켜기 - power 값 변경
		myTv.power = true;
		myTv.power = false;
		myTv.size = 80;
		
		Tv yourTv = new Tv();
		yourTv.power = true;
		yourTv.channel = 11;
		yourTv.volumn = 15;
		
		//인스턴스의 메소드 사용방법 예시
		myTv.onOff();
		myTv.channelChange(3);
		myTv.volumnUp();
		myTv.volumnUp();
		myTv.volumnUp();
		myTv.volumnDown();
		
		//한사람 정보 저장용 인스턴스
		PersonInfo p1 = new PersonInfo();
		p1.name = "홍길동";
		p1.age = 26;
		p1.phoneNum = "010-1234-5678";
		p1.birth = "2000-03-16";
		p1.gender = "남";
	    p1.address= "인천시 미추홀구";
	    
	    //10명의 정보를 저장하는 인스턴스 배열
	    PersonInfo person[] = new PersonInfo[10];
	    person[0].name = "전우치";
	    person[0].age = 25;
	    person[0].phoneNum = "010-9876-5432";
	    person[0].birth = "2001-05-15";
	    person[0].gender = "남";
	    person[0].address = "인천시 부평구";
	    
	    //2번째 사람 정보 - 나머지 배열에는 null값이 들어가게 됨.
	    person[0].name = "아무개";
	    person[0].phoneNum = "010-9999-9999";
	    person[0].address = null; // '\0' : 0에 해당하는 값으로 초기화 가능
	
	}

}

//여기에 클래스를 만들어 봅시다.
//1.) TV
//상태, 데이터 - on/off 상태, 체널, 볼륨 조절, 크기
//상태(state)는 데이터를 저장하는 필드(field)라고 함.
//필드는 고유값을 저장하는 필드와 기능 처리 시 필요한 가변값을 저장하는 필드가 있음.
class Tv {//앞에 접근제한이 생락되어있을 경우 default가 생략된것!
	//가변 필드 변수
	boolean power;	//데이터형을 뭐로 지정하던 상관없고(정수형이나 다른 자료형으로 변수 만들어줘도 됨) 이런 상태를 저장할 수 있는 변수를 선언해주는 것이 중요!
	int channel; 
	int volumn;
	//고유 필드 변수
	int size;
	String maker;
	
	public void onOff() {
		//Tv의 power를 변경할 수 잇는 방법을 제공
//		if(power == true) {
//			power = false;
//		}
//		else {
//			power = true;
//		}
		
		power = !power;	//위의 if문을 한줄로 간단하게 표현할 수 있음.
	}
	
	//번호를 받아서 채널 변경
	public void channelChange(int num) {
		channel = num;
		System.out.println("채널 변경 : " + channel);
	}
	
	//볼륨 변경. 한번 누르면 1씩 증감.
	public void volumnUp() {
		volumn++;
		System.out.println("볼륨 : " + volumn);
	}
	public void volumnDown() {
		volumn--;
		System.out.println("볼륨 : " + volumn);
	}
}

//Tv처럼 에어컨, 의자, 책 class를 정의해 보자.
class Aircon{
	//가변 필드
	boolean power;
	int windpower;
	int winddirection;
	int now_temperature, set_temperature;
	//고유 필드
	String maker;
	int size;
}

class Chair{
	int lheight, lwidth, lvertical;
	int bheight, bwidth, bvertical;
	int mheight, mwidth, mvertical;
	int wheel,rwheel;
	String meterial;
}

class Book{
	//고유 필드
	String title;
	String text;
	String genre;//장르
	String author;
	String publisher;
	String ISBN; //책 고유번호
	//가변 필드
	int chapter;
	int price;
}


//2.)객체의 종류
//1. 완성품에 해당하는 객체 = 프로그램
//2. 부품에 해당하는 객체
//3. 정보를 저장하는 객체
//
//NEXT) 사람의 class를 정의해 보자.
//연락처 프로그램의 정보 처리용
//Data Transfer Object(DTO)
class PersonInfo{
	//고유필드
	String name;
	String phoneNum;
	String birth;
	String gender;
	String address;
	int age;
	
}
//NEXT) 자동차 class를 정의해 보자.
















