
public class CardTest {

	public static void main(String[] args) {
		//static 멤버는 클래스 이름으로 접근이 가능함
		Card.width = 200;
		Card.height = 300;
		
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;
		
		System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height + ")");
		System.out.println("c2은 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + ", " + c2.height + ")");
		
		c1.width = 50;
		c1.height = 80;
		
		System.out.println("c1은 " + c1.kind + ", " + c1.number + "이며, 크기는 (" + c1.width + ", " + c1.height + ")");
		System.out.println("c2은 " + c2.kind + ", " + c2.number + "이며, 크기는 (" + c2.width + ", " + c2.height + ")");	//이렇게 하면 c2도 같이 변경되어 있는걸 확인할 수 있음 -> width, heigth는 static 변수라서 한 클래스에서 공통으로 사용하기 때문에 같은 변수 사용하는 것과 같다. 
	
	}

}

class Card{
	//static 멤버
	public static int width = 100;
	public static int height = 250;
	
	//인스턴스 멤버
	public String kind;
	public int number;
	
}