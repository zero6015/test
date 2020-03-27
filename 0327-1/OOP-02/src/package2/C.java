package package2;

import package1.A;

public class C extends A {
	public void set() {
		pri = 10;//다른 패키지이기도 하고 자손 클래스는 접근 불가
		def = 20;//다른 패키지라서 접근 불가
		pro = 30;
		pub = 40;
	}
}
