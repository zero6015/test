
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);

		int a = 1, b = 1;
		
//		if(a == 0 && b == 0) {
//			System.out.println();
//		}
		
		
		while (a != 0 && b != 0) {
			a = scan.nextInt();
			b = scan.nextInt();
			System.out.println(a + b);
			
		}
		
		
		
	}

}



//1. ��ȹ �ǵ�
//Ŀ�� �ӽ��� ��⿣ �ʹ� ��ΰ� �뿩�Ⱓ�� �ٸ� ����Ʈ�� ��� �ʹ� ��(3�� �̻�) �������� �ް� �� �� ª�� �Ⱓ���� �뿩�� �� �ִ� ����Ʈ�� ����
//2. ��ġ��ũ
//http://www.dgcafe.co.kr/sub/product/product_list.asp?s_cate=1110
//	
//3. ��ȹ�� ���θ� �Ұ�
//���)
//�ӽ� �뿩 - �ӽ� ������ ȭ�鿡 ��ġ -> ��ǰ ���ý� �뿩 �������� �Ѿ -> ���� �Է�, �ɼ� ���ÿ��� �뿩 �Ⱓ ���� -> ���� ������
//�ӽ� ���� - �ӽ� ������ ȭ�鿡 ��ġ -> ��ǰ ���ý� ���� �������� �Ѿ -> ���� �Է� -> ���� ������
//���� ���� - ���� ������ ȭ�鿡 ��ġ -> ��ǰ ���ý� ���� �������� �Ѿ -> ���� �Է� -> ���� ������
//Ŀ�´�Ƽ - QnA, �����ı�, ��������, �̺�Ʈ, AS ��û