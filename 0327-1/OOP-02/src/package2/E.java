package package2;

import package1.A;

public class E {
	public void set() {
		A a = new A();
		a.pri = 1000;//다른 클래스에서는 무조건 접근 불가
		a.def = 2000;//다른 패키지라서 접근 불가
		a.pro = 3000;//다른 패키지이고 상속받지 못해서 접근 불가 (다른 패키지이면 받드시 상속을 받아야만 접근 가능)
		a.pub = 4000;//접근 가능
	}
}
