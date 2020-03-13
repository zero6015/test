
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



//1. 기획 의도
//커피 머신이 사기엔 너무 비싸고 대여기간도 다른 사이트의 경우 너무 길어서(3년 이상) 보증금을 받고 좀 더 짧은 기간동안 대여할 수 있는 사이트를 구축
//2. 벤치마크
//http://www.dgcafe.co.kr/sub/product/product_list.asp?s_cate=1110
//	
//3. 기획한 쇼핑몰 소개
//기능)
//머신 대여 - 머신 종류별 화면에 배치 -> 상품 선택시 대여 페이지로 넘어감 -> 수량 입력, 옵션 선택에서 대여 기간 선택 -> 결제 페이지
//머신 구매 - 머신 종류별 화면에 배치 -> 상품 선택시 구매 페이지로 넘어감 -> 수량 입력 -> 결제 페이지
//원두 구매 - 원두 종류별 화면에 배치 -> 상품 선택시 구매 페이지로 넘어감 -> 수량 입력 -> 결제 페이지
//커뮤니티 - QnA, 구매후기, 공지사항, 이벤트, AS 신청