package sample09_set;

import java.util.Objects;
// implements Comparable<Book> : 비교가능해지게 된것.
public class Book implements Comparable<Book> {

	private int no;
	private String title;
	private String writer;
	private int price;
	
	public Book(int no, String title, String writer, int price) {
		this.no = no;
		this.title = title;
		this.writer = writer;
		this.price = price;
	}
	
	// 해시코드, equals 재정의
	@Override
	public int hashCode() {
		return Objects.hash(no);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Book other = (Book) obj;
		return no == other.no;
	}

	public int getNo() {
		return no;
	}

	public String getTitle() {
		return title;
	}

	public String getWriter() {
		return writer;
	}

	public int getPrice() {
		return price;
	}

	// 책번호를 기준으로 오름차순 정렬시킨다.
//	// compareTo 메소드 재정의
//	@Override
//	public int compareTo(Book other) {
//		return no - other.no;
//	}
	
	// 제목 기준으로 오름차순 정렬시킨다.
	// title.compareTo인 이유: title은 Book의 인스턴스변수. Book은 comparable을 구현함
	//						 즉, Book은 compareTo메소드를 가져야한다.
	
	@Override
	public int compareTo(Book o) {
		return title.compareTo(o. title);
	}

}

