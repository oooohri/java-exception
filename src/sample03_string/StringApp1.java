package sample03_string;

public class StringApp1 {
	public static void main(String[] args) {
		
	
		// String 객체 생성하기
	
		// 1. 문자열 리터럴을 이용해서 String객체를 생성하고 초기화한다.	
		String str1 = "홍길동";
		String str2 = "홍길동";
		
		// 2. new 키워드를 이용해서 String객체를 생성하고, 생성자 메소드로 초기화한다.
		String str3 = new String("홍길동");
		String str4 = new String("홍길동");
		
		// 생성된 객체의 주소값 비교하기
		// ==: 동일성비교 - 주소값비교
		System.out.println(str1==str2); // true. str1,str2에는 리터럴이 있고 그 값이 똑같기 때문이다.
		System.out.println(str1);
		System.out.println(str3==str4); // false str3,str4는 주소값이 있고 그 주소값이 다르기 때문이다.
		
		// 생성된 객체의 문자열 내용 비교하기
		// 동등성비교 - 내용비교 ->우리가 더 자주사용!!!
		// object를 상속받은 String은 object에 있는 equals를 사용가능.
		System.out.println(str1.equals(str2));	// true
		System.out.println(str3.equals(str4));	// true
		System.out.println(str1.equals(str3));	// true
	}
}