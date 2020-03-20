import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// ���� ����� ArrayList(�Ǽ�)
		ArrayList<Integer> intArry = new ArrayList<Integer>();
		// ���ڿ� ����� ArrayList
		ArrayList<String> strArry = new ArrayList<>();
		
		//ArrayList�� ������(����) �߰� : add() �޼ҵ�
		intArry.add(1);
		intArry.add(2);
		intArry.add(3);
		intArry.add(2);
		intArry.add(3);
		intArry.add(1, 5);
		
		strArry.add("aaa");
		strArry.add("bbb");
		strArry.add("ccc");
		strArry.add("ddd");
		strArry.add(2,"zzz");
		
		System.out.println(intArry);
		System.out.println(strArry);
		
		//ArrayList�� ����� ���� ������ �ҷ����� : get(����);
		System.out.println("1��° �� : " + intArry.get(1)
				+ ", " + strArry.get(1));
		
		//ArrayList�� ũ��(����� ����� ����) ���ϱ�: size();
		for(int i = 0; i < intArry.size(); i++) {
			System.out.printf("%d ��° : %d\n", i, intArry.get(i));
		}
		
		//����� ���� : remove(����);
		System.out.println("intArry�� �ι�° ������ ����");
		intArry.remove(1);
		System.out.println(intArry + ": ũ�� - " + intArry.size());
		
		//��ü ���� : clear();
		intArry.clear();
		strArry.clear();
		
		System.out.println(intArry);
		System.out.println(strArry);
		
		
		Box<String> b = new Box<>();
		b.setItem("abc");
		
		Box<Integer> b2 = new Box<>();//int
		
		int a;
		Integer c = new Integer(0);
	}

}


//���׸���(���׸���, Generics)
//������ �� Ÿ���� üũ�ؼ� ����ȯ�� ���ŷο��� �ٿ���.
class Box<T> {
	T item;
	
	//setter
	void setItem(T item) {
		this.item = item;
	}
	//getter
	T getItem() {
		return item;
	}
}

//Wrapper class
// 8���� �⺻ Ÿ�Կ� �ش��ϴ� Ŭ����
// boolean -> Boolean
// byte -> Byte
// char -> Character
// short -> Short
// int -> Integer
// long -> Long
// float -> Float
// double -> Double





