package com;

public class VarArgsTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		printStr();
		printStr("one");
		printStr("one", "two");
		printStr("one", "two", "three");
		printStr("one", "two", "three", "four");

		//printStrWith();//가변인자와 일반 매개변수를 함께 쓰는 경우 일반 매개변수를 하나이상 전달해줘야함. 아래줄과 같이 써줘야함
		printStrWith(":");
		printStrWith(":", "one");
		printStrWith(":", "one","two");
		printStrWith(":", "one","two","three");
		printStrWith(":", "one","two","three","four");

		//인자들의 합을 구하는 메소드를 작성하시오.
		sub();
		sub(1, 2);
		sub(1, 2, 3);
		sub(1, 2, 3, 4);
		sub(1, 2, 3, 4, 5);

		computeInt("+", 3000, 1000000, 10000, 100000);
		computeInt("-", 1113000, 5000, 3000, 1000);

	}//메인끝



	//가변 인자 메소드(매개 변수 배열)
	//자동으로 인자의 개수만큼의 크기를 갖는 배열을 생성.
	public static void printStr(String...str) {//(...)을 사용하여 배열로 쓸 수 있음
		for(String s : str) {
			System.out.println(s);//인자들 출력
		}
		System.out.println();//줄바꿈
	}

	//가변 인자와 다른 매개변수 병용
	//이 경우 가변인자의 순서는 마지막으로 잡아줌
	public static void printStrWith(String s, String...strs) {
		for(String st : strs) {
			System.out.print(s + st);
		}
		System.out.println();//줄바꿈
	}

	private static void sub(int...itg) {
		int sum = 0;
		for(int i : itg) {
			sum += i;

		}
		System.out.println();
		System.out.print("합: " + sum);
	}

	public static void computeInt(String op, int...nums) {
		int sum = nums[0];

		switch (op) {
		case "+":
			for (int i = 1; i < nums.length; i++) {
				sum += nums[i];
			}
			break;
		case "-":
			for (int i = 1; i < nums.length; i++) {
				sum -= nums[i];
			}
			break;
		}
		System.out.println();
		System.out.println("잔액 : " + sum);
	}

}//클래스 끝
