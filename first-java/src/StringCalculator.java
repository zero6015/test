import java.util.Scanner;

public class StringCalculator {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		String str1 = "abc";
		String str2 = "abc"; //String str2 = new String("abc"); 원래는 이런 형식으로 데이터를 만들어주는게 맞지만 String은 많이 쓰이기때문에 new 명령어를 생략할 수 있음
		
		
		
		if(str1 == str2) {
			System.out.println("같다.");			
		}
		else {
			System.out.println("같지않다.");			
		}
		
		//예시1) ==은 정적데이터를 비교하는 연산자이므로 scan받은 값을 비교하면 같지않다로 결과값이 나옴
		//abc라는 똑같은 값을 입력받아서 다시 입력했을 때 결과값이 "같지않다"로 나옴
		str2 = scan.next();
		if(str1 == str2) {
			System.out.println("같다.");			
		}
		else {
			System.out.println("같지않다.");			
		}
		
		//예시2) equals()는 동적데이터를 비교해주어서 scan 받은 값과 비교했을 경우 "같다"로 나옴
		//equals로 비교하고 abc를 입력해서 비교하면 "같다"로 나옴
		str2 = scan.next();
		if(str1.equals(str2)) {
			System.out.println("같다.");			
		}
		else {
			System.out.println("같지않다.");			
		}
		
		
	}

}
