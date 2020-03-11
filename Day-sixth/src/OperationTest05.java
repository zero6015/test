
public class OperationTest05 {

	public static void main(String[] args) {
//1		반복문
//		while문
//		while(조건식) {...}
//		1~100까지 숫자의 총합
		int i = 1;
		int sum = 0;
		
		while(i <= 100) {
			sum += i;
			i++;
		}
		
		System.out.println("1~100까지 총합은 " + sum);
		
		//위 while문을 for문으로 작성해보기
		int sum2 = 0;
		
		for (int j = 1; j <= 100; j++) {
			sum2 += j;
		}
		
		System.out.println("1~100까지 총합은 " + sum2);
	

//2		문제) 구구단 가로 출력 예시
		System.out.println("***구구단***");
		int k = 1, l = 1;
		
		while(k <= 10) {
			while(l <= 10) {
				System.out.printf("%2d * %2d = %-7d", l,k,k*l);
				l++;
			}
			System.out.println();
			k++;
			l = 1;
		}
		
	}


	
}
