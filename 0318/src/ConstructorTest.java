
public class ConstructorTest {
	private int num;
	
//1	public ConstructorTest(int num) {
//		this.num = num;	//매개변수와 맴버변수가 이름이 같을 경우 앞에 this를 붙여줌
//	}
//
//	public void setNum(int num) {
//		this.num = num;
//	}
	
	
	//생성자 1 (매개변수 없음) -> 기본 생성자
//	기본생성자
//	1. 매개변수가 없는 생성자
//	2. 개발자가 작성하지 않으면 자동으로 작성(추가)
//	기본 생성자가 아닌 생성자를 작성하면 기본 생성자는 자동으로 추가되지 않는다.
//	
//	
//	public ConstructorTest() {
//		
//	}
//	
//	public ConstructorTest(int num) {
//		this.num = num;
//	}

//2	1. 생성자를 쓰지말자
//	2. 매개변수를 넣어주는 생성자만 쓰자
//	3. 매개변수가 있는 생성자/ 기본생성자 둘다 쓸거면 기본생성자도 다 써줘야함
//	(ConstMain.java 예시1번 참고)
//
//   생성자는 초기화에 사용된다.
//   (초기화가 필요없을 때는 사용하지 않아도 된다. )
//   생성자를 작성하지 않으면 기본 생성자는 (보이진 않지만) 자동으로 추가된다.(컴파일러가 추가한다.)
//   인스턴스를 생성할 때 초기화 하는 경우
//   (즉, 특정 필드에 값을 입력하여 인스턴스를 만들 경우) 매개변수가 있는 생성자를 작성한다.
//   이 때, 컴파일러가 기본 생성자를 추가하지 않기 때문에
//   기본생성자(매개변수가 없는 생성자)도 같이 사용하려면 기본생성자도 같이 작성해야 한다.
//   결론 -> 매개변수가 있는 생성자를 만들 경우, 기본 생성자도 같이 작성하자!


//3	기본 생성자가 아닌 생성자를 작성하면 기본 생성자는 자동으로 추가되지 않는다
	int num1, num2;
	
	public ConstructorTest() {
//		num1 = 1;
//		num2 = 1;
		this(1);	//위 두줄을 this로 표현할 수 있음
					//this 생성자로 같은 이름의 메소드를 호출할 때 this로 호출할 수 있다
	}
	
	public ConstructorTest(int num1) {
//		this.num1 = 1;
//		num2 = 1;
		this(num1, 1);	//위 두줄을 this로 표현할 수 있음
	}
	
	public ConstructorTest(int num1, int num2) {
		this.num1 = 1;
		this.num2 = 1;
	}

}
