
public class BubbleSort {

	public static void main(String[] args) {

		int numArr[] = { 8, 23, 100, 26, 1};
		
		System.out.println("정렬 전 : ");
		for (int n : numArr) {
			System.out.print(n + " ");
		}
		System.out.println();//줄바꿈 처리
		
		
		int temp = 0;
//		배열의 크기를 구하는 키워드 : 배열이름.length
		System.out.println("배열의 크기: " + numArr.length);

//		버블 정렬 (첫 라운드 끝나면 맨 뒤에 제일 큰수가 들어가고 다음 라운드로 넘어감
		for (int i = 0; i < numArr.length; i++) {//라운드 횟수
			for (int j = 0; j < numArr.length - i - 1; j++) { //조건식에서 -i해주고 -1까지 해주는 이유는 if 문에서 numArr[j + 1]으로 비교해야해서 배열번호가 초과되지 않도록 조절해준것.
				if(numArr[j] > numArr[j + 1]) {
					//1라운드 : 0번과 1번 비교, 1번과 2번 비교, 2번과 3번 비교, 3번과 4번 비교 
					//2라운드 : 0번과 1번 비교, 1번과 2번 비교, 2번과 3번 비교
					//3라운드 : 0번과 1번 비교, 1번과 2번 비교
					//4라운드 : 0번과 1번 비교
					temp = numArr[j];
					numArr[j] = numArr[j+1];
					numArr[j+1] = temp;
				}
			}
		}
		
		System.out.println("버블 정렬 후 : ");
		for (int i = 0; i < numArr.length; i++) {
			System.out.printf(numArr[i] + " ");
		}
		//출력 for문 아래 for문처럼도 쓸 수 있음
		for (int n : numArr) {
			System.out.printf(n + " ");
		}
		
		
		
//		선택 정렬
		for (int i = 0; i < numArr.length; i++) {
			for (int j = numArr.length-1; j < numArr.length - i - 1; j++) {
				if(numArr[j] > numArr[j]) {
					temp = numArr[j];
					numArr[j] = numArr[j+1];
					numArr[j+1] = temp;
				}
			}
		}
		System.out.println();
		System.out.println("선택 정렬 후 : ");
		for (int n : numArr) {
			System.out.printf(n + " ");
		}
		
	}

}
