
public class ConstMain {

//1	public static void main(String[] args) {
//
//		ConstructorTest ct = new ConstructorTest();
//		ConstructorTest ct2 = new ConstructorTest(5);
//		
//	}
	
//2	public void div(int a, int b) {
//		//결과값이 정수인 나눗셈 메소드
//		System.out.println(a + "/" + b + "=" + (a/b));
//	}

	//매개변수 개수가 다른 이름이 같은 메소드
//	public void div(int a) {
//		float b = 5.0f;
//		float r = a / b;
//		System.out.println(a + "/" + b + "=" + r);
//	}
//	
	//타입이 다른 이름이 같은 메소드
//	public void div(float a, int b) {
//		float r = (float)a/b;
//		System.out.println(a + "/" + b + "=" + r);
//	}
	
	//반환형은 판별기준이 되지 못한다 이유는 어떤 메소드를 실행할지 정하는 시점에서는 같은 메소드가 2개있는 것과 동일하기 때문에
	public int div(int a) {
		return a;
	}
	
	
//2-1	//타입이 다른 이름이 같은 메소드 print로 예시)
//	public static void main(String[] args) {
//		boolean b = true;
//		byte by = 1;
//		char ch = 'A';
//		short s = 10;
//		int i = 100;
//		long l = 1000L;
//		float f = 1.5f;
//		double d = 3.14;
//		
//		//같은 메소드 같아 보이지만 들어오는 데이터(매개변수)에 따라서 해당메소드가 실해되는 것임!!
//		System.out.println(b);
//		System.out.println(by);
//		System.out.println(ch);
//		System.out.println(s);
//		System.out.println(i);
//		System.out.println(l);
//		System.out.println(f);
//		System.out.println(d);
//
//	}
	
	
	
	
	
}
