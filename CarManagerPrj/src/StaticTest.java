import java.awt.im.spi.InputMethod;

public class StaticTest {

	static void add1(int a, int b) {
		System.out.println(a + " + " + b + " = " + (a+b));
	}
	void add2(int a, int b) {
		System.out.println(a + " + " + b + " = " + (a+b));
	}
	
	//main : 콜백 함수
	public static void main(String[] args) {
		StaticTest st = new StaticTest(); //자기자신을 인스턴스로 만듦
		add1(4, 5);
		st.add2(7, 8);
	}

}


class StaticClass {
	//스태틱 변수
	static int cv;
	//인스턴스 변수
	int iv;
	
	//스태틱 메소드
	static void cMethod() {
		cv = 100;
//		iv = 100;	//인스턴스가 아직 안 만들어졌기 때문에 오류남.(iv가 없음)
	}
	
	//인스턴스 메소드
	void iMethod() {
		cv = 300;
		iv = 400;
	}

	static void cMethod2() {//static 메소드에서는 인스턴스 메소드 호출 불가;
		cMethod();
//		iMethod();
	}
	void iMethod2() {//인스턴스 메소드에서는 스테틱,인스턴스메소드 모두 호출가능;                                               
		cMethod();
		iMethod();
	}
	
}

