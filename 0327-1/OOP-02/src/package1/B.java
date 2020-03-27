package package1;

public class B extends A {
	public void set() {
		pri = 1;//private 맴버는 자손 클래스에서 접근 불가
		def = 2;//같은 패키지여서 접근 가능
		pro = 3;//같은 패키지이거나 상속을 받은 경우 접근 가능
		pub = 4;//제한 없음
	}
}
