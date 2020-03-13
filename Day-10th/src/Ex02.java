import java.util.Scanner;

public class Ex02 {

	public static void main(String[] args) {
//		입력한 금액을 5만원, 만원, 5천원, 천원, 백원으로 분리하기.
//		(금액단위별 숫자 구하기.)
//		예) 788300원 입력
//			5만원 : 15장
//			만원 : 3장
//			오천원 : 1장
//			천원 : 3장
//			오백원 : 0개
//			백원 : 3개
		
		Scanner scan = new Scanner(System.in);
		
		int input = scan.nextInt();
		
		int fiftyth, tenth, fiveth, thousand, fivehd, hundred;
		int change;
		
		fiftyth = input / 50000;
		change = input % 50000;
		tenth = change / 10000;
		change = change % 10000;
		fiveth = change / 5000;
		change = change % 5000;
		thousand = change / 1000;
		change  = change % 1000;
		fivehd = change / 500;
		change  = change % 500;
		hundred = change / 100;

		System.out.printf("5만원 : %d장\n만원 : %d장\n5천원 : %d장\n천원 : %d장\n500원 : %d개\n100원 : %d개\n",fiftyth, tenth, fiveth, thousand, fivehd, hundred);
		
	}

}
