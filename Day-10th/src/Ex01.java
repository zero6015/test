
public class Ex01 {

	public static void main(String[] args) {
		//����ȯ ����
	      byte b = 10;
	      char ch = 'A';
	      int i = 100;
	      long l = 1000L;
	      
	      //���� �� ����ȯ �����ڸ� ������ �� �ִ� ����?
	      b = (byte)i;
	      ch = (char)b;
	      short s = (short)ch;
	      float f = l;
	      i = ch;
	      
	      //char ������ ���ڸ� �����ϴ� ��������
	      //������ ����Ǵ� ���� ���ڿ� �ش��ϴ� �ڵ� ����(�ƽ�Ű�ڵ�)�� �����Ѵ�.
	      //���� ���� ������ ���� ���� ���ڸ� ������ �� �ִ�.
	      
	      //for���� �̿��Ͽ� A~Z���� ����ϱ�.
	      for(char a1 = 'A'; a1 <= 'Z'; a1++) {
	         System.out.println(a1);
	      }
	      for(ch = 65;ch <= 90;ch++ ) {
	         //System.out.printf("%c", ch);
	         System.out.print((char)ch);
	      }
	      System.out.println();
	      
	      //���� �غ���
//			for (char i = 'A'; i <= 'Z'; i++) {
//				System.out.printf("%c ",i);
//			}
//	      
	      //0~9������ ����(���ڸ� ���ڷ� ��ȯ�ϴ� ���)
	      char numChar = '0';
	      System.out.println((int)numChar);
	      
//	      int number = (int)numChar;
//	      System.out.println(number);
	      
	      int number = numChar - '0';
	      System.out.println(number);
	      //�ƽ�Ű �ڵ�� ��ȯ�Ǳ� ������ 0�� �ش��ϴ� �ƽ�Ű �ڵ带 ���ش�.
	      //=>���ڸ� ���ڷ� ��°���(���ڸ������� ó������. ���ڴ� �ϳ��� A~Z)
	      //����ȯ���δ� ���ڿ� �ش��ϴ� ���ڷ� ��ȯ�ϴ°� �Ұ���
		
		//0~9������ ���ڹ��ڸ� ���ڷ� ��ȯ�ϴ� ���
//	      ���ۿ�)
//	      int number = (int)numChar;
//	      System.out.println(number);
	      
//		char numChar = '5';
//		System.out.println((int)numChar);
//		���ڸ� ���ڷ� �ٽ� ǥ���Ϸ��� �ƽ�Ű�ڵ�� ���ڸ�ŭ ���̳��� 
//		���ڸ� ���ָ�(���ڸ� '0'���� ���ָ� ����!) 
//		���ڸ� ���ڷ� ��ȯ�� �� �ִ�
//		int number = numChar - '0';
//		System.out.println(number);
//		
//		//1~100�������. 1�ٿ� 10���� ���
//		for (int k = 1; k < 100; k++) {
//			System.out.printf("%3d");
//			//�ٹٲ� ����
//			if (j % 10 == 0) {
//				System.out.println("\n");
//			}
//		
//		}
		
//1	      ������ : ! 
//	      ����1) string ��
	      String str1 = "abc";
	      String str2 = "def";
		
	      if(!str1.equals(str2)) {
	    	  System.out.println("str1�� str2�� ���� �ʴ�.");
	      }
	      
//	      ����2) ���� ��
	      int num1 = 10;
	      int num2 = 20;
	      
	      if(!(num1 == num2)) {
	    	  System.out.println("num1�� num2�� ���� �ʴ�.");
	      }
	      

	      
	}

}
