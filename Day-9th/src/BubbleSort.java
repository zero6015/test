
public class BubbleSort {

	public static void main(String[] args) {

		int numArr[] = { 8, 23, 100, 26, 1};
		
		System.out.println("���� �� : ");
		for (int n : numArr) {
			System.out.print(n + " ");
		}
		System.out.println();//�ٹٲ� ó��
		
		
		int temp = 0;
//		�迭�� ũ�⸦ ���ϴ� Ű���� : �迭�̸�.length
		System.out.println("�迭�� ũ��: " + numArr.length);

//		���� ���� (ù ���� ������ �� �ڿ� ���� ū���� ���� ���� ����� �Ѿ
		for (int i = 0; i < numArr.length; i++) {//���� Ƚ��
			for (int j = 0; j < numArr.length - i - 1; j++) { //���ǽĿ��� -i���ְ� -1���� ���ִ� ������ if ������ numArr[j + 1]���� ���ؾ��ؼ� �迭��ȣ�� �ʰ����� �ʵ��� �������ذ�.
				if(numArr[j] > numArr[j + 1]) {
					//1���� : 0���� 1�� ��, 1���� 2�� ��, 2���� 3�� ��, 3���� 4�� �� 
					//2���� : 0���� 1�� ��, 1���� 2�� ��, 2���� 3�� ��
					//3���� : 0���� 1�� ��, 1���� 2�� ��
					//4���� : 0���� 1�� ��
					temp = numArr[j];
					numArr[j] = numArr[j+1];
					numArr[j+1] = temp;
				}
			}
		}
		
		System.out.println("���� ���� �� : ");
		for (int i = 0; i < numArr.length; i++) {
			System.out.printf(numArr[i] + " ");
		}
		//��� for�� �Ʒ� for��ó���� �� �� ����
		for (int n : numArr) {
			System.out.printf(n + " ");
		}
		
		
		
//		���� ����
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
		System.out.println("���� ���� �� : ");
		for (int n : numArr) {
			System.out.printf(n + " ");
		}
		
	}

}
