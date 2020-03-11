import java.util.Scanner;

public class ArrayTest01 {

	public static void main(String[] args) {
//1		배열(Array)
//		만약에 한 반의 학생이 30명일 때	각 학생의 국어 성적을 저장하고 싶다. 어떻게 하면 좋을까?
//		배열은 같은 자료형끼리만 묶을 수 있음. 예) int형 배열, float형 배열
//		배열이랑 변수의 묶음
		
//2		int score[] = new int[30]; //배열 선언 방식 : score이란 정수형 배열변수를 만들고 배열의 크기는 30으로 지정한다
//3		//배열의 공간 사용(대입)
//		score[0] = 80; //첫번째 배열 칸에 대입(배열은 번호 0부터 시작함)
//		score[10] = 93;	//11번쌔 배열 칸에 대입
//
//		System.out.println(score[1]);	//칸이 비어있으므로 0 출력됨
//		System.out.println(score[10]);	//대입된 값이 있으므로 대입된 값이 출력됨
		
//4		int score[] = new int[5];
//		System.out.println("성적 입력 프로그램");
//		
//		Scanner scan = new Scanner(System.in);
//		
//		for (int i = 0; i < 5; i++) {
//			System.out.print((i + 1) + "번째 학생 성적: ");
//			score[i] = scan.nextInt();
//		}
//		
//		int sum = 0;
//		for (int j = 0; j < 5; j++) {
//			sum += score[j];
//		}
//		System.out.println("총점은 " + sum);
		
//5		//향상된 for문
//		int sum = 0;
//		for(int s : score) {//s라는 변수는 해당 for문에서만 존재함, score라는 배열에 있는 값들을 순차적으로 하나씩 대입시켜줌.
//			sum += s;
//		}

//		내가 입력한 만큼 배열의 크기를 정할 수 있다
		int size = 10;					//배열 선언 방식1) 변수에 크기 값을 넣고 다음에 배열 선언시에 변수로 크기 지정
		int score[] = new int[size];	//c언어에서 배울 땐 배열 크기를 지정할 때 정수로만 크기 지정이 가능했지만 java의 경우 변수의 크기를 결정할 때 변수를 사용해서 지정해줄 수 잇음
		
		String grade[];					//배열 선언 방식2) 배열 먼저 선언만 한 후, 배열에 다시 크기 지정
		grade = new String[size];
		
		int num[] = {1, 2, 3, 4, 5};	//배열 선언 방식3) 배열 선언과 동시에 값 대입
		
	}

}
