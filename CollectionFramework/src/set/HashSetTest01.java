//package set;
//import java.util.*;
//
//public class HashSetTest01 {
//
//	public static void main(String[] args) {
//		Set<Integer> iSet = new HashSet<>();
//		List<Integer> iList = new ArrayList<>(); 
//		
//		
////		iSet.add(1);
////		iSet.add(1);
////		iSet.add(1);
////		iSet.add(1);
////		iSet.add(1);
//		
//		iSet.add(1);
//		iSet.add(2);
//		iSet.add(3);
//		iSet.add(4);
//		iSet.add(5);
//		
//		iList.add(1);
//		iList.add(2);
//		iList.add(3);
//		iList.add(2);
//		iList.add(5);
//		
//		System.out.println(iSet);
//		System.out.println(iList);
//		
//		System.out.println(iList.get(4));//set은 이론상 순서없이 값이 저장되기때문에(비순차 구조) 순서를 지정해줘서 값을 출력하는게 불가
//		
////		Iterator로 변환하여 순서를 지정해서 하나씩 사용할 수 있음
////		Iterator는 3개의 메소드를 갖는 클래스임
////		boolean hasNext(); :처리할 요소가 있는지 확인
////		object next(); : 해당 순번의 요소를 가지고 오는 메소드
////		void remove(); : 가지고 온 요소를 삭제
////		Collection 클래스들을 순차 구조로 변환하여 처음부터 마지막까지 순서를 가지고 사용하기 위한 구조 클래스
//		Iterator<Integer> iter = iSet.iterator();//iset에 비순차적으로 저장된 값들을 iterator메소드를 사용해서 순차적으로 iter에 저장
//		while (iter.hasNext()) {
//			int i = iter.next();
//			System.out.println(i);
//		}
//		
////		Iterator<Integer> iterList = iList.iterator();
////		while (iterList.hasNext()) {
////			int j = iterList.next();
////			System.out.println(j);
////		}
//		
//		//forEach로 삭제 - remove와 forEach는 같이 쓸 수 없다. 왜냐면 arraylist의 크기가 변경되면 exception 발생
////		for (int k : iList) {
////			if(k == 2) {
////				iList.remove(k);
////			}
////			System.out.println(k);
////		}
//		
////		//for로 삭제
////		int size = iList.size();
////		
////		for (int i = 0; i < iList.size(); i++) {
////			int k = iList.get(i);
////			if (iList.get(i) == 2) {
////				iList.remove(i);                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               nst.remove(i);
////			}
////		}
////		System.out.println(iList);
//		
//		
//		
//		//iterator로 삭제
//		
//		Iterator<Integer> iterList = iList.iterator();
//		while (iterList.hasNext()) {
//			if (iterList.next() == 2) {
//				iterList.remove();                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                               nst.remove(i);
//			}
//		}
//		System.out.println(iList);
//	}
//
//}
