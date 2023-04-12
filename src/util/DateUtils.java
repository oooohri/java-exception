package util;

import java.text.SimpleDateFormat;
import java.util.Date;

// Utils: 유용한 기능. static로 만든다.
// BankApplication에서 사용가능
public class DateUtils {
	
	// static메소드에서 쓰기위해 스테틱변수 선언
	private static final SimpleDateFormat YYYYMMDD = new SimpleDateFormat("yyyy-MM-dd");
	
	/**
	 * 날짜를 'yyyy-MM-dd'형식의 텍스트로 변환해서 반환한다.
	 * @param date 날짜
	 * @return 지정된 포맷의 문자열
	 */
	public static String toText(Date date) {
		if (date == null) {
			return "";
		}
		String formattedText = YYYYMMDD.format(date); // 날짜객체를 전달받으면 특정형식의 문자열로 반환
		return formattedText;
	}
}
