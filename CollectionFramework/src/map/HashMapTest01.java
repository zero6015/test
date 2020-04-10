package map;

import java.util.*;

public class HashMapTest01 {

	public static void main(String[] args) {
		Map<String, String> dictionary =  new HashMap<String, String>();
		
		dictionary.put("apple", "사과");
		dictionary.put("ship", "배");
		dictionary.put("grape", "포도");
		
		//key값 받아서 연관된 데이터 출력하기
		String kor = dictionary.get("apple");
		System.out.println("apple의 뜻은 " + kor);
		
		//키가 중복이 될 경우 : 마지막에 넣은 데이터만 남게되고 이전에 들어간 데이터는 사라진
		dictionary.put("ship", "돗단배");
		kor = dictionary.get("ship");
		System.out.println("ship의 뜻은 " + kor);
		
		//키가 다르고 같은 값이 들어가는건 상관없음
		dictionary.put("snow", "눈");
		dictionary.put("eye", "눈");
		
		kor = dictionary.get("snow");
		System.out.println("snow의 뜻은 " + kor);
		kor = dictionary.get("eye");
		System.out.println("eye의 뜻은 " + kor);
	
		//키 목록을 구할 때 사용하느 메소드 : keySet();
		Set<String> keyList = dictionary.keySet();
		System.out.println(keyList);
		
		//값 목록을 구할 때 사용하느 메소드 : values();
		Collection<String> valueList = dictionary.values();
		System.out.println(valueList);
		
		//찾고자 하는 키가 있는지 : containsKey();
		System.out.println("apple이 있나요? " + dictionary.containsKey("apple"));
		
		//찾고자 하는 값이 있는지 : containsValue();
		System.out.println("배가 있나요? " + dictionary.containsValue("배"));
		System.out.println("돗단배가 있나요? " + dictionary.containsValue("돗단배"));
		
		//키로 값을 삭제 (키도 같이 삭제 됨)
		dictionary.remove("ship");
		System.out.println(dictionary);
		
		//맵의 크기 구하기 : size()
		int mapsize = dictionary.size();
		System.out.println(mapsize);

		//전체 삭제 : clear();
		dictionary.clear();
		System.out.println(dictionary);
		
		//value부분에 정수를 저장하는 Map
		Map<String, Integer> menu = new HashMap<String, Integer>();
		menu.put("apple", 500);//입력 예
	}

}
