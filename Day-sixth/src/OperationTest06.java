import java.util.Scanner;

public class OperationTest06 {

	public static void main(String[] args) {
//1		����) -1�� �Էµ� ������ �ݺ������� ������ �Է¹޾Ƽ� ����� ��´� ���α׷�
//		1.��ĳ�� �����
//		2. ����� ���� �����
//			���� �Է¿� ����
//			��� ���� ����
//			���� ���� ����
//			ī��Ʈ ����
//		3. ���� �Է�
//			-1�̶��/�ƴ϶��.. 
//			-1�� �ƴ϶�� ������ �Է��� ���� ���ϱ�.(�ݺ�)
//			-1�̶�� ������ ī��Ʈ ���� �������Ͽ� ��� ���.
//		4. ��� ���
		

		Scanner scan = new Scanner(System.in);
		
		int inNum = 0, total = 0, cnt = 0;
		double avg = 0.0f; //����� �Ҽ������� ���� �� �����ϱ�

//1-1		while�� Ȱ���ؼ� ���� Ǯ���			
//		inNum = scan.nextInt();
//
//		while(inNum != -1) {
//			total += inNum;
//			cnt++;	//
//			inNum = scan.nextInt(); //�ٽ� ���ο� �Է°��� �޾ƾ��ϴϱ� scan �ٽ� ����
//		}	
//		
//		avg = (double)total/cnt;	//����ȯ)���� ����. -> �Ǽ� ����
//		System.out.println(cnt + "�� ����� " + avg);
				
//1-2  	do while�� Ȱ���ؼ� ���� Ǯ���
		cnt = -1;
		//do ���� �ϴ� ��ó���� �ݵ�� �ѹ� ����ȴ�.
		do {
			total += inNum;
			cnt++;	
			inNum = scan.nextInt();
		} while (inNum != -1);	//do while�� ����� �� ������ : ���� ';' �� ����ֱ�
	}



//	���� �ߴ� ����
//	1. ��Ÿ
//	2. ';' �̽�
//	 if(���ǽ�);{ }
//	 switch(������);{ }
//	 for(�ʱ��;���ǽ�;������);{ } 
//	 while(���ǽ�);{ }
	 
	
}
