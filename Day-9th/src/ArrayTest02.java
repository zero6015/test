import java.util.Scanner;

public class ArrayTest02 {

	public static void main(String[] args) {
//1		배열을 배열에 대입하고 값을 입력하면 같은 메모리공간을 공유하기 때문에 
//		둘중에 하나의 변수에 새로운 값을 대입해주어도 두 배열 모두 수정된 값으로 출력된다
//		int intArr[] = new int[5];
//		int mArr[] = intArr;
//		
//		for(int i = 0; i < 5; i++) {
//			intArr[i] = i;			
//		}
//		
//		for (int j = 0; j < 5; j++) {
//			System.out.println(intArr[j]);
//		}
//		System.out.println("------------");
//		for (int k = 0; k < 5; k++) {
//			System.out.println(mArr[k]);
//		}
//		
//		mArr[2] = 100;
//		System.out.println("------------");
//		for (int k = 0; k < 5; k++) {
//			System.out.println(intArr[k]);
//		}
		
		
//2		5개의 숫자를 입력받아서 가장 큰 수와 가장 작은 수를 출력하시오.
		Scanner scan = new Scanner(System.in);
		
		System.out.println("숫자 5개를 입력하세요.");
		
		int numArr[] = new int[5];
//		
//		//5개 숫자 입력 처리
//		for (int i = 0; i < 5; i++) {
//			numArr[i] = scan.nextInt();
//		}
//		
//		//최대값/최소값 찾기
//		int max = 0, min = 9999;	
//		
//		for (int j = 0; j < 5; j++) {
//			//최대값 비교
//			if(max < numArr[j]) {
//				max = numArr[j];
//			}
//			
//			//최소값 비교
//			if(min > numArr[j]) {
//				min = numArr[j];
//			}
//		}
//		
//		System.out.println("가장 큰 값은 " + max + ", 가장 작은 값은 " + min);
		
		
//		숫자의 오름차순 정렬
//		Swap의 개념
//		변수 a와 변수 b의 값을 서로 교환하려면?
//		변수c를 만들어서 c에 a의 값을 대입, a에 b의 값을 대입, c에 a의 값을 대입.
		
		int num1 = scan.nextInt();
		int num2 = scan.nextInt();
		int temp = 0;
		
		temp = num1;
		num1 = num2;
		num2 = temp;		
		
	}

}
