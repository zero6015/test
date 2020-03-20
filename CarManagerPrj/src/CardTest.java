
public class CardTest {

	public static void main(String[] args) {
		//static ����� Ŭ���� �̸����� ������ ������
		Card.width = 200;
		Card.height = 300;
		
		Card c1 = new Card();
		c1.kind = "Heart";
		c1.number = 7;
		
		Card c2 = new Card();
		c2.kind = "Spade";
		c2.number = 4;
		
		System.out.println("c1�� " + c1.kind + ", " + c1.number + "�̸�, ũ��� (" + c1.width + ", " + c1.height + ")");
		System.out.println("c2�� " + c2.kind + ", " + c2.number + "�̸�, ũ��� (" + c2.width + ", " + c2.height + ")");
		
		c1.width = 50;
		c1.height = 80;
		
		System.out.println("c1�� " + c1.kind + ", " + c1.number + "�̸�, ũ��� (" + c1.width + ", " + c1.height + ")");
		System.out.println("c2�� " + c2.kind + ", " + c2.number + "�̸�, ũ��� (" + c2.width + ", " + c2.height + ")");	//�̷��� �ϸ� c2�� ���� ����Ǿ� �ִ°� Ȯ���� �� ���� -> width, heigth�� static ������ �� Ŭ�������� �������� ����ϱ� ������ ���� ���� ����ϴ� �Ͱ� ����. 
	
	}

}

class Card{
	//static ���
	public static int width = 100;
	public static int height = 250;
	
	//�ν��Ͻ� ���
	public String kind;
	public int number;
	
}