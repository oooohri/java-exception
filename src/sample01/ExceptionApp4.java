package sample01;

import java.io.FileWriter;
import java.io.IOException;

public class ExceptionApp4 {
	
	// unchecked 예외처리
	public static void test2(String str) {
		test1(str);	// 예외 전달받았는데 예외처리 안돼서 메인메서드의 test2()로 전달 
	}
	
	
	public static void test1(String str) {
		int number = Integer.parseInt(str); // 1234오 입력시 여기서 처음 예외발생 -> 10번째라인으로 전달하고
		System.out.println("number -> "+number);
	}
	
	
	// checked 예외처리 - 매우 귀찮음
//	public static void test1() throws IOException, ClassNotFoundException {
//		System.out.println("예외처리 위임하기 연습");
//		test2();
//	}
//	
//	public static void test2() throws IOException, ClassNotFoundException {
//		System.out.println("예외처리 위임하기 연습");
//		test3();
//	}
//	
//	public static void test3() throws IOException, ClassNotFoundException {
//		System.out.println("예외처리 위임하기 연습");
//		test4();
//		
//		Class.forName("java.io.String");
//	}
//	
//	public static void test4() throws IOException {
//		FileWriter writer = new FileWriter("src/sample01/sample04.txt");
//		writer.write("파일쓰기 연습");
//		writer.close();
//	}
	
	// 메인메서드에서만 예외처리 하면 됨. throws를 넣을 필요가 없다.
	public static void main(String[] args) {
		try {
			test1("1234");
			test2("1234오");
		}catch(NumberFormatException ex) { // 받은 예외처리를 잡아서 출력
			System.out.println("유효한 숫자형식의 문자열이 아닙니다.");
		}
	}
	
}
