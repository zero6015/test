
public class OperatorTest04 {

	public static void main(String[] args) {
		
//1		��� ����
//		for, if�� ����
//		
//		����) 1~100������ ¦���� �� ���ϱ�
		int sum = 0;
		for (int i = 1; i <= 100; i++) {
			if(i % 2 == 0) {
				sum += i;
			}
		}
		System.out.printf("%d",sum);
		
	}

}
