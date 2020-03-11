import java.util.Scanner;

public class Operator {

	public static void main(String[] args) {
		
//1		반복문
//		:특정 명령문(들)을 반복처리 해주는 명령. (for문, while문)
//		
//		1. for문
//		지정된 횟수만큼 반복해라
//		for(초기식;조건식;증감식) {...}
//		for문 처리 순서 : 초기식->조건식->{...}->증감식->조건식->{...}->증감식->~~~반복~~->조건식을 만족하지 못하면 for문 나오기
		
//2		//i는 1씩 증가
//		for(int i = 1; i <= 10; i++) {
//			System.out.println(i);
//		}
//		
//		//i는 2씩 증가
//		for(int i = 1; i <= 10; i += 2) {
//			System.out.println(i);
//		}
		
//3		구구단 출력 프로그램
//3-1		2단 출력
//		for (int i = 1; i < 10; i++) {
//			System.out.printf("2 * %d = %3d%n",i,2 * i);
//		}
		
//3-2	구구단 전체 출력 (이중 for문) : 한단씩 나오기
//		for (int j = 1; j < 10; j++) {
//			System.out.printf("%5d단%n",j);
//			for (int i = 1; i < 10; i++) {
//				System.out.printf("%d * %d = %3d%n", i, j, i * j);
//			}
//			System.out.printf("%n");
//		}
			
//3-3	구구단 전체 출력 (이중 for문) : 여러단 나오기
//		for (int j = 1; j < 10; j++) {
//			
//			for (int i = 1; i < 10; i++) {
//				System.out.printf("%d * %d = %2d   ", i, j, i * j);
//			}
//			System.out.printf("%n");
//		}
			
		
//3-3	예제) 1~100까지의 합 구하기
//		1 + 2 + 3 + 4 + 5 + ... + 100 = ?
//		int sum=0;
//		for (int i = 1; i <= 100; i++) {
//			sum += i;
//		}
//		System.out.printf("1 + 2 + 3 + 4 + 5 + ... + 100 =%5d%n", sum);		
		
//4		중첩된 for문 
//		for (int k = 0; k < 5; k++) {
//			for (int l = 0; l < 5; l++) {
//				System.out.print("*");	
//			}
//			System.out.println();	
//		}
		
		
		System.out.println("숫자 : ");	
		Scanner scan = new Scanner(System.in);
		int num = scan.nextInt();
		
		//숫자를 입력받아서 하나씩 늘려서 출력하기
		for (int i = 1 ; i <= num; i++) {
			for (int j = 1; j <= i; j++) {
				System.out.print("♬");
			}
			System.out.println();	//줄만 바꿈
		}
		
		//숫자를 입력받아서 하나씩 줄여서 출력하기
		for (int i = num ; i > 0; i--) {
			for (int j = 1; j <= i ; j++) {
				System.out.print("♬");
			}
			System.out.println();	
		}
		
	
		
	}

}
