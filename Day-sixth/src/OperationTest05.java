
public class OperationTest05 {

	public static void main(String[] args) {
//1		�ݺ���
//		while��
//		while(���ǽ�) {...}
//		1~100���� ������ ����
		int i = 1;
		int sum = 0;
		
		while(i <= 100) {
			sum += i;
			i++;
		}
		
		System.out.println("1~100���� ������ " + sum);
		
		//�� while���� for������ �ۼ��غ���
		int sum2 = 0;
		
		for (int j = 1; j <= 100; j++) {
			sum2 += j;
		}
		
		System.out.println("1~100���� ������ " + sum2);
	

//2		����) ������ ���� ��� ����
		System.out.println("***������***");
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
