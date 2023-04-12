package sample02;

public class ExceptionApp1 {

	/**
	 * 문자열을 전달받아서 정수로 변환해서 반환한다.
	 * @param text 숫자로 구성된 문자열
	 * @return 정수값
	 */
	public static int toInt(String text) {
		int number = Integer.parseInt(text);
		return number;
	}
	
	
	public static void main(String[] args) {
		
		try {
			int value = toInt("1234가");
			System.out.println(value);
		} catch (NumberFormatException ex) {
//			String errorMessge = ex.getMessage();
//			System.out.println("오류메시지: " +errorMessge);
//			String text = ex.toString();
//			System.out.println("toString() -> " + text);
			
			//printStackTrace는 위의 정보를 모두 담고있으므로 꼭 적어주는 것이 좋다.
			ex.printStackTrace(); // 개발단계에서 꼭 적어주기 (오류내용 파악하기 위해)
		}
	}	
}
