
public class Ex01 {

	public static void main(String[] args) {
		//형변환 문제
	      byte b = 10;
	      char ch = 'A';
	      int i = 100;
	      long l = 1000L;
	      
	      //다음 중 형변환 연산자를 생략할 수 있는 것은?
	      b = (byte)i;
	      ch = (char)b;
	      short s = (short)ch;
	      float f = l;
	      i = ch;
	      
	      //char 변수는 문자를 저장하는 변수지만
	      //실제로 저장되는 값은 문자에 해당하는 코드 숫자(아스키코드)를 저장한다.
	      //따라서 증감 연산을 통해 다음 문자를 결정할 수 있다.
	      
	      //for문을 이용하여 A~Z까지 출력하기.
	      for(char a1 = 'A'; a1 <= 'Z'; a1++) {
	         System.out.println(a1);
	      }
	      for(ch = 65;ch <= 90;ch++ ) {
	         //System.out.printf("%c", ch);
	         System.out.print((char)ch);
	      }
	      System.out.println();
	      
	      //내가 해본거
//			for (char i = 'A'; i <= 'Z'; i++) {
//				System.out.printf("%c ",i);
//			}
//	      
	      //0~9까지의 숫자(문자를 숫자로 변환하는 방법)
	      char numChar = '0';
	      System.out.println((int)numChar);
	      
//	      int number = (int)numChar;
//	      System.out.println(number);
	      
	      int number = numChar - '0';
	      System.out.println(number);
	      //아스키 코드로 변환되기 때문에 0에 해당하는 아스키 코드를 빼준다.
	      //=>문자를 숫자로 출력가능(한자리에서만 처리가능. 문자는 하나만 A~Z)
	      //형변환으로는 문자에 해당하는 숫자로 변환하는건 불가능
		
		//0~9까지의 숫자문자를 숫자로 변환하는 방법
//	      나쁜예)
//	      int number = (int)numChar;
//	      System.out.println(number);
	      
//		char numChar = '5';
//		System.out.println((int)numChar);
//		문자를 숫자로 다시 표현하려면 아스키코드상 숫자만큼 차이나는 
//		문자를 빼주면(숫자면 '0'으로 빼주면 간단!) 
//		문자를 숫자로 변환할 수 있다
//		int number = numChar - '0';
//		System.out.println(number);
//		
//		//1~100까지출력. 1줄에 10개씩 출력
//		for (int k = 1; k < 100; k++) {
//			System.out.printf("%3d");
//			//줄바꿈 결정
//			if (j % 10 == 0) {
//				System.out.println("\n");
//			}
//		
//		}
		
//1	      연산자 : ! 
//	      예시1) string 비교
	      String str1 = "abc";
	      String str2 = "def";
		
	      if(!str1.equals(str2)) {
	    	  System.out.println("str1과 str2가 같지 않다.");
	      }
	      
//	      예시2) 숫자 비교
	      int num1 = 10;
	      int num2 = 20;
	      
	      if(!(num1 == num2)) {
	    	  System.out.println("num1과 num2가 같지 않다.");
	      }
	      

	      
	}

}
