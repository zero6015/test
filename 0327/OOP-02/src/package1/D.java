package package1;

public class D {
	public void set() {//인스턴스로 접근할 경우 접근 제한
		A a = new A();
		a.pri = 100;//접근 불가
		a.def = 200;//같은 패키지라서 접근 가능
		a.pro = 300;//같은 패키지라서 접근 가능
		a.pub = 400;
	}
}
