package com;

public class StringMethodTest03 {

	public static void main(String[] args) {
		String s1 = "백길현";
		
		String s2 = s1.replace("현", "따라 이백리 외로운 섬하나 새들의 고향");//a를 z로 변경하겠다.

		System.out.println("s1 : " + s1);
		System.out.println("s2 : " + s2);
		
		String s3 = s1.replace("c", "zz");
		System.out.println("s1 : " + s1);
		System.out.println("s2 : " + s3);	
		
		String s4 = s1.replace("ab", "-");
		System.out.println("s1 : " + s1);
		System.out.println("s2 : " + s2);	
		
		//대소문자 변경 : 대문자 -> 소문자로 - toLowerCase
		//			  소문자 -> 대문자로 - toUpperCase
		String oriStr = "HELLO";
		String tarStr = oriStr.toLowerCase();
		
		System.out.println("oriStr : " + oriStr);
		System.out.println("tarStr : " + tarStr);
		
		String oriStr2 = "Hello";
		String tarStr2 = oriStr2.toLowerCase();
		String tarStr3 = oriStr2.toUpperCase();
		System.out.println("oriStr2 : " + oriStr2);
		System.out.println("tarStr2 : " + tarStr2);
		System.out.println("tarStr3 : " + tarStr3);
		
		//앞뒤에 공백을 제거해주는 메소드
		String oriStr3 = "			Hello world			";
		String trimStr = oriStr3.trim();
		System.out.println("oriStr3 : " + oriStr3);
		System.out.println("trimStr : " + trimStr);
		
		//substring : 문자열에서 문자열을 추출하자
		String longStr = "Hello Java Programming World!!";
		int stIdx = longStr.indexOf("Pro");
		int endIdx = longStr.indexOf(" Wo");
		String subStr = longStr.substring(stIdx, endIdx);//stIdx부터 endIdx전까지 넣어줌
		System.out.println(subStr);
		System.out.println("전체 길이 : " + longStr.length() + ", stIdx : " + stIdx + ", endIdx : " + endIdx);
		
		//longStr을 각 단어로 분할해 보자. (A부터 B까지 추출한다)
		longStr = "Hello Java Programming World!!";
		String sub1 = longStr.substring(0, longStr.indexOf(" "));
		System.out.println("처음부터 첫 공백까지 출력(첫단어 출력) : " + sub1);
		String longStr1 = longStr.substring(longStr.indexOf("J"));//값을 하나만 넣어줄 경우 해당 문자열부터 시작해서 끝까지 출력됨
		System.out.println(longStr1);
		
		//split을 사용하여 각 단어로 분할하자 (분할해서 배열에 저장해줌)
		longStr = "Hello Java Programming World!!";
		String sub[] = longStr.split(" ");//자르고 싶은 구분자를 설정해줌
		for(String s: sub) {
			System.out.println(s);
		}
		System.out.println();
		
		String sub2[] = longStr.split(" ", 3);//분할해서 뒤에 숫자(n)개로 만들어라) : 분할 개수를 제한하는 limit인자
		for(String s: sub2) {
			System.out.println(s);
		}
		System.out.println();
	}

}
