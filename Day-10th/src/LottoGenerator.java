import java.util.Random;
import java.util.Scanner;

public class LottoGenerator {

	public static void main(String[] args) {
//		1~45 ������ 6���� ���ڸ� �ڵ����� �����Ѵ�
		Random rand = new Random();
		Scanner scan = new Scanner(System.in);
		
		int lottoNum[] = new int[6];//�ζǹ�ȣ ���� �迭
		int select = 0; //�޴���ȣ ���� ����
		
		while (true) {
			System.out.println("�ζ� ��ȣ ������");
			System.out.println("=================");
			System.out.println("1. �����ϱ�");
			System.out.println("2. �����ϱ�");
			System.out.println("�Է�>");
			select = scan.nextInt();
			
			if (select == 2) {
				System.out.println("�����մϴ�");
			}
			
			for (int i = 0; i < 6; i++) {
				//1~45���� ����
				int num = rand.nextInt(45) + 1;//1�� �����ִ� ���� : rand.nextInt(45) -> 0 ~ 44
				
				lottoNum[i] = num;
				//�ߺ� ����
				for (int j = 0; j < i; j++) {//ù��° ���忡���� i,j �Ѵ� 0�̶� for���� ���� �ʴ´�.
					if(lottoNum[j] == lottoNum[i]) {
						//�ߺ� �߻� �� ó���� ����
						i--;
						break;//�ߺ� Ȯ�� �۾� ����
					}
				}
			}
			for (int n : lottoNum) {
				System.out.print(n + " ");
			}
		    System.out.printf("\n\n");
			
		}

		
	}

}
