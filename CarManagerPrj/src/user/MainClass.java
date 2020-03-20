package user;

import com.*;

public class MainClass {

	public static void main(String[] args) {
		CarClass myCar = new CarClass();
//		myCar.modelName = "그랜져";  //다른 패키지에 존재해서 에러남
		
//		패키지는 자바파일을 묶어주는 폴더 역할
		Dealer d1 = new Dealer();
	}

}
