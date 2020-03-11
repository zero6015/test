
public class OperatorTest07 {

	public static void main(String[] args) {
//1		break, continue 문 
//		단독으로 사용이 불가능한 제어문
//		if문에 사용되고 break문의 경우 switch문에서도 사용됨.

//2		continue
//		1~100까지 짝수의 합
		int sum = 0;
		for (int i = 1; i < 100; i++) {
//2-1		짝수 합 구하기
//			if (i % 2 == 0) {
//				continue;
//				sum += i;
//			}
			
//2-2		continue사용해서 짝수 합 구하기
//			if (i % 2 != 0) {
//				continue;	//홀수면 continue : 뒤에 오는 처리문 생략하라.				
//			}	
//			sum += i;
			
//3			break문 사용하면 for문 멈춤
//			if (i % 2 != 0) {
//				break;	// 홀수면 브레이크 걸려서 for문 나옴
//			}	
//			sum += i;

			
		}
		
	}

}
