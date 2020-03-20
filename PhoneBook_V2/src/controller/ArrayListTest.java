import java.util.ArrayList;

public class ArrayListTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		// 정수 저장용 ArrayList(실수)
		ArrayList<Integer> intArry = new ArrayList<Integer>();
		// 문자열 저장용 ArrayList
		ArrayList<String> strArry = new ArrayList<>();
		
		//ArrayList에 데이터(정보) 추가 : add() 메소드
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
		
		//ArrayList에 저장된 개별 데이터 불러오기 : get(순번);
		System.out.println("1번째 값 : " + intArry.get(1)
				+ ", " + strArry.get(1));
		
		//ArrayList의 크기(저장된 요소의 개수) 구하기: size();
		for(int i = 0; i < intArry.size(); i++) {
			System.out.printf("%d 번째 : %d\n", i, intArry.get(i));
		}
		
		//요소의 삭제 : remove(순번);
		System.out.println("intArry의 두번째 데이터 삭제");
		intArry.remove(1);
		System.out.println(intArry + ": 크기 - " + intArry.size());
		
		//전체 삭제 : clear();
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


//지네릭스(제네릭스, Generics)
//컴파일 시 타입을 체크해서 형변환의 번거로움을 줄여줌.
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
// 8개의 기본 타입에 해당하는 클래스
// boolean -> Boolean
// byte -> Byte
// char -> Character
// short -> Short
// int -> Integer
// long -> Long
// float -> Float
// double -> Double





