package com;

public class StringMethodTest02 {

	public static void main(String[] args) {
		String name[] = new String[10];

		name[0] = "유상민";
		name[1] = "노희원";
		name[2] = "백길현";
		name[3] = "김철수";
		name[4] = "안철수";
		name[5] = "김민철수";
		name[6] = "김백수";
		name[7] = "나철수";
		name[8] = "홍길현";
		name[9] = "홍길민";


		//김씨만 출력
		String nStr = "김";

		for (String n : name) {
			if (n.startsWith(nStr)) {
				System.out.println(n);
			}
		}
		System.out.println();

		//이름 2번째 글자가 "철"인 이름 출력
		nStr = "철";
		for (String n : name) {
			if (n.startsWith(nStr, 1)) {
				System.out.println(n);
			}
		}
		System.out.println();
		
		//이름 3번째 글자가 "철"인 이름 출력
		for (String n : name) {
			if (n.startsWith(nStr, 2)) {
				System.out.println(n);
			}
		}
		System.out.println();
		
		//이름에 "철"이 들어가는 모든 이름 출력
		for (String n : name) {
			if (n.indexOf(nStr) > -1) {//index는 값이 없을 경우 -1을 반환하기때문에 값이 들어있으면 -1보다 크다 조건을 충족한다
				System.out.println(n);
			}
		}
		System.out.println();

		//끝이 "민"으로 끝나는 이름 출력
		nStr = "민";
		for (String n : name) {
			if (n.endsWith(nStr)) {
				System.out.println(n);
			}
		}
		System.out.println();
		
		//equals 비교 순서 예시
		String cn = "aaa";
		
		if (cn.equals("aaa")) {
			//cn에 저장된 값이 aaa라면 참.
			
		}
		if ("aaa".equals(cn)) {//"aaa"자체가 인스턴스이기때문에 equals 비교할 때 순서가 바뀌어도 상관없음!!
			//aaa에 저장된 값이 cn라면 참.
			
		}
		
	}

}
