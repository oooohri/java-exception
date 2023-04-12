package sample03_string;

public class StringApp3 {
	public static void main(String[] args) {
		// String의 주요 API (2)
		
		// 1. 기본자료형값을 문자열로 반환하기
		// 불린, 정수, 실수, 객체, 문자, 문자배열을 전달받아서 String으로 변환해서 반환한다.
		// true -> "true"
			// String text = Stirng.valueOf(true);
		// 'A' -> "A"
			// String text = String.valueOf('A');
		// {'안', '녕', '하', '세', '요'} -> "안녕하세요"
		// 3.14 -> "3.14"
			// String text = String.valueOf(3.14);
		// 10000 -> "10000"
			// String text = String.valueOf(10000);
		// 1000000000L: -> "1000000000"
			// String text = String.valueOf(1000000000L);
		
		// static String valueOf(boolean value)
		// static String valueOf(char value)
		// static String vlaueOf(char[] arr, int offset, int length)
		// static String vlaueOf(double d)
		// static String vlaueOf(int i)
		// static String vlaueOf(long value)
		// static String vlaueOf(object obj)
		
		// 2. 문자열을 기본자료형값으로 변환하기 (위에와 반대)
		// "true" -> true
			// boolean result = Boolean.parseBoolean("true");
		// "ABC" -> 'A'
			// char result = "ABC".charAt(0);
		// "3.14" -> 3.14
			// double value = Double.parseDouble("3.14");
		// "10000" -> 10000
			// int value = Integer.parseInt("10000");
		// "1000000000" -> 1000000000L
			// long value = Long.parseLong("1000000000");
		
		
		// 임의의 정수에 대하여 정수의 각 자리값을 더한 결과를 출력하기
		// 정수 : 110293
		// 출력값 : 16 = 1+1+2+9+3
		
		int number = 110293;
		String text = String.valueOf(number); // 110293 -> "110293"
		String[] values = text.split("");	  // "110293" -> {"1", "1", "0", "2", "9", "3"}
		
		int total = 0;
		for(String value : values) {
			int num = Integer.parseInt(value); // "1" -> 1
			total += num;
		}
		
		System.out.println("자릿수의 합 -> " +total );
		
		
		

	}
}
