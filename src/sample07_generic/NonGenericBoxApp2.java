package sample07_generic;

public class NonGenericBoxApp2 {
	public static void main(String[] args) {
		
		// 문자열을 저장하는 box객체 생성하기 
		NoneGenericBox box1 = new NoneGenericBox();
//		box1.setItem("홍길동");
		box1.setItem(100);	// box객체 생성목적과 맞지 않는 객체가 저장될 수 있다.(문자열저장 객체인데 정수 들어갈 수 있음)
							// 오토박싱에 의해 int 100이 Integer타입의 100으로 형변환되고 setItem에 Object item에 전달 가능한것이다.
		
		// 문자열을 저장하는 box객체 생성하기
		NoneGenericBox box2 = new NoneGenericBox();
		box2.setItem("홍길동");

		// ClassCastException 오류
		int value = (Integer)box2.getItem(); // 잘못된 형변환 오류가 코딩과정에서 체크되지 않는다.
		System.err.println(value);
	}
}
