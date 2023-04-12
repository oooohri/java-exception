package sample03_string;

import java.util.StringJoiner;

public class StringJoinerApp2 {
	public static void main(String[] args) {
		
		String[] names = {"김유신","강감찬","이순신"};
		
		// 조이너 안쓰면 내가 마지막 컴마가 붙어버리는 것을 따로 내가 처리를 해줘야됨
		
		StringJoiner joiner = new StringJoiner(",");
		for(String x : names) {
			joiner.add(x);
		}
		String text = joiner.toString();
		System.out.println(text);
	}
}
