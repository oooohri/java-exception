package sample05_date;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeFormatApp2 {
	public static void main(String[] args) throws ParseException {
		
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd");
		
		// 지정된 패턴형식의 문자열을 해석해서 Date객체를 생성하기
		// --> 특정날짜 정보를 갖고 Date객체를 만들 수 있다.
		Date date1 = sdf1.parse("1999-01-17");
		System.out.println(date1);
		
		// 시스템의 현재 날짜와 시간정보를 표현하는 Date객체를 생성하기
		Date now = new Date();
		
		long nowUnixtime = now.getTime();
		long dateUnixtime = date1.getTime();
	
		long days = (nowUnixtime - dateUnixtime)/(60*60*24*1000);
		System.out.println("경과일자 : "+days);
	}
}
