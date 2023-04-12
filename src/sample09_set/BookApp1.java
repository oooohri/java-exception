package sample09_set;

import java.util.HashSet;

public class BookApp1 {
	public static void main(String[] args) {
		
		HashSet<Book> books = new HashSet<>();
		
		// HashSet객체에 Book객체 저장하기
		// 		해시코드값이 같은지 확인 -> 같으면 같은객체, 다르면 다른객체로 판단해서 중복값은 나오지 않는다.
		// String, Wrapper클래스는 hashCode,equals재정의해서 내용이 같은 값이면 같다 여기고, 해시코드 똑같지만
		//						내용이 다른 값이면 다르게 여기고 해시코드가 다르게 나온다.
		//						(재정의를 안했다면, 안의 내용이 같아도 다른 객체이므로 다른 해시코드가 나오고 다른 것으로 여기게 된다.따라서 내용중복되는게 나오는것.)
		// 		--> 따라서 Book객체에 hashCode, equals 재정의해서 출력하면 중복값이 안나온다.
		
		// 동일한 책번호를 가진 책정보는 같은 객체로 보고 저장되지 않게 하자.
		// -> Book 클래스에서 hashCode()와 equals(Object o) 메소드를 재정의한다.
		books.add(new Book(100, "자바의 정석", "남궁성", 35000));
		books.add(new Book(100, "자바의 정석", "남궁성", 35000));
		books.add(new Book(100, "자바의 정석", "남궁성", 35000));
		books.add(new Book(100, "자바의 정석", "남궁성", 35000));
		books.add(new Book(100, "자바의 정석", "남궁성", 35000));
		books.add(new Book(101, "이것이 자바다", "신용권", 32000));
		books.add(new Book(102, "생각하는 프로그래밍", "김창준", 29000));
		
		// HashSet객체에 저장된 책정보 출력하기
		for(Book book : books) {
			System.out.println("해시코드: " + book.hashCode());
			System.out.println("번호: "+ book.getNo());
			System.out.println("제목: "+ book.getTitle());
			System.out.println("저자: "+ book.getWriter());
			System.out.println("가격: "+ book.getPrice());
			System.out.println();
		}
		
	}
}
