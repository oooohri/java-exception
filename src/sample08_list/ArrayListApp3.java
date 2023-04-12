package sample08_list;

import java.util.ArrayList;
import java.util.List;

public class ArrayListApp3 {
	public static void main(String[] args) {
		
		// ArrayList객체의 주요 API
		
		// List객체 생성하기 
		// 제네릭클래스만 상,하위가 안되는 것일뿐 ArrayList와 List는 가능
		ArrayList<String> list1 = new ArrayList<>();
		List<String> list2 = new ArrayList<>();
		List<String> list3 = List.of("john", "eddy", "adam", "jane", "liz"); // 수정불가
//		ArrayList<String> list4 = List.of("박정아", "문정원", "배유나"); //오류. 부모타입의 객체를 자식타입의 객체에 담을 수 X
																   // List<String>타입의 객체를 ArrayList<String>타입의 참조변수에 대입X
		
		// List객체에 객체 추가하기
		list1.add("김유신");
		list1.add("강감찬");
		list1.add("강감찬");
		list1.add("이순신");
		list1.add("강감찬");
		list1.add("류관순");
		list1.add("안중근");
		
		// List객체에 객체 추가하기
//		list3.add("alexsandra"); // java.lang.UnsupportedOperationException오류.
								// List.of()로 생성한 List객체는 수정할 수 없다.
		
		// List객체에 저장된 객체의 갯수를 조회하기
		int len = list1.size();
		System.out.println("List객체에 저장된 객체의 갯수 -> " + len);
	
		// List객체가 비어있는지 조회하기
		boolean empty1 = list1.isEmpty();
		boolean empty2 = list2.isEmpty();
		System.out.println("첫번째 List객체 비어있는가? -> "+empty1);
		System.out.println("두번째 List객체 비어있는가? -> "+empty2);
		
		// List객체의 모든 객체 삭제하기
		System.out.println("첫번째 List객체의 모든 객체 삭제하기");
		list1.clear();
		System.out.println("List객체에 저장된 객체의 갯수 -> "+ list1.size());
	}
}
