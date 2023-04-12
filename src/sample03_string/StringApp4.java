package sample03_string;

public class StringApp4 {
	public static void main(String[] args) {
		
		// << String의 주요 API의 응용 >>
		// 고객의 이메일주소에서 아이디만 조회해서 출력하기
		String[] emailArr = {"hong@gmail.com", "lee-sushin@naver.com", "kimys@hanmail.net"};
		
		for(String email: emailArr) {
			System.out.println(email.indexOf("@")); // 0부터 @앞까지 
			String id = email.substring(0, email.indexOf("@"));
			System.out.println(id);
		}
		
			// 고객의 이메일주소에서 도메인네임 출력하기
			for(String email : emailArr) {
				
				String domainName = email.substring(email.indexOf("@")+1); // @다음부터 시작~끝까지
				System.out.println(domainName);
			}
		}
	}

