import java.util.Scanner;

public class ControlTest02 {

	public static void main(String[] args) {
//1		조건문 switch
//		다중 분기를 위해 태어난 제어문 : case, default
//		기타 제어문 : break
		Scanner scan = new Scanner(System.in);
		
//2		//11 - sk, 16 - kt, 19 - LG
		System.out.print("번호 입력 : ");
		int num = scan.nextInt();
		
		switch (num) {
		case 11:
			System.out.println("SK입니다.");
			//추가 명령어 작성
			break;
		case 16:
			System.out.println("KT입니다.");
			//추가 명령어 작성
			break;
		case 19:
			System.out.println("LG입니다.");
			//추가 명령어 작성
			break;
		default:
			System.out.println("기타 등등입니다.");		//위 3가지 케이스에 해당되지 않는 모든 케이스들은 default로 처리됨
			//추가 명령어 작성
			break;
		}
		
//3		학점계산 (switch문)
		System.out.print("점수 입력 : ");
		Scanner scan1 = new Scanner(System.in);
		
		int score = scan1.nextInt();
		String grade="";
		
		switch (score/10) {
		case 10:
			grade = "A";
			break;
		case 9:
			if (score%10 >= 5) { System.out.println("A+");}		//이건 그냥 A+/A0 나눠본거~
			if (score%10 < 5) { System.out.println("A0");}
			grade = "A";
			break;
		case 8:
			grade = "B";
			break;	
		case 7:
			grade = "C";
			break;
		case 6:
			grade = "D";
			break;	
		default:
			grade = "F";
			break;
		}
		
		System.out.println(grade);
		
		
		
	}

}
