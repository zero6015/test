package com.homeminus;

import com.homeminus.controller.MainController01;
import com.homeminus.dto.*;

public class HomeMain {

	public static void main(String[] args) {
		// 하는일 없음. 컨트롤러 호출만 실행.
//		Product product = new Product();
		MainController01 mainController = new MainController01();
		
		mainController.controll();
		

	}

}
