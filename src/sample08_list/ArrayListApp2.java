package sample08_list;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class ArrayListApp2 {
	public static void main(String[] args) {
		
		ArrayList<String> names = new ArrayList<>();
		names.add("김유신");
		names.add("강감찬");
		names.add("이순신");
		names.add("류관순");
		// 외부반복
		System.out.println("### 콜렉션객체(ArrayList객체)에 저장된 값을 외부반복으로 처리");
		for(String name : names) {
			System.out.println(name);
		}
		
		// 변형, 수집
		List<Character> values = new ArrayList<>();
		for(String name : names) {
			values.add(name.charAt(0));
		}
		// 소비
		for(char c : values) {
			System.out.println(c);
		}
		
		// 내부반복
		System.out.println("### 콜렉션객체(ArrayList객체)에 저장된 값을 내부반복으로 처리");
		names.stream().forEach(name -> System.out.println(name));
		
		// stream: ArrayList에 있는 데이터를 순서대로 하나씩 공급하면 forEach가 소비
		
		names.stream()
		.map(name -> name.charAt(0))					// 변형
		.collect(Collectors.toList())					// 모으기
		.forEach(value -> System.out.println(value));	// 소비하기
		
		
	}
}
