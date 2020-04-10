package com;

public class StringMethodTest01 {

	public static void main(String[] args) {
		//charAt메소드 사용
		String str = "Hello world";
		
		System.out.println("5번째 문자 : " + str.charAt(4));//순번은 0부터 시작하니까 항상 유념하기
		System.out.println("6번째 문자 : " + str.charAt(5));//공백도 문자이기 때문에 빈칸 출력됨(빈칸도 ASCII코드 값 있음)
		
		//
		String order = "01100";
		
		for (int i = 0; i < order.length(); i++) {
			if (order.charAt(i) == '0') {//charAt을 사용하여 문자열에서 가져오게되면 문자형으로 바껴서 '=='사용 가능
				System.out.println("전원을 끕니다");
			}
			else if (order.charAt(i) == '1') {
				System.out.println("전원을 켭니다");
			}
		}

		//
		String s1 = "Hello";
		String s2 = "Hello";
		String s3 = "AHello";
		String s4 = "ZHello";
		String s5 = "Haello";//첫번째 문자 같아서 두번째 문자로 비교
		
		int r = s1.compareTo(s2);
		System.out.println("s1과 s2 비교 결과 : " + r);
		
		r = s1.compareTo(s3);
		System.out.println("s1과 s3 비교 결과 : " + r);
		
		r = s1.compareTo(s4);
		System.out.println("s1과 s4 비교 결과 : " + r);
		
		r = s1.compareTo(s5);
		System.out.println("s1과 s5 비교 결과 : " + r);
	}

}
