package sample01;

import java.io.FileWriter;
import java.io.IOException;

public class ExceptionApp1 {
	public static void main(String[] args) {
		
		// 예외처리
		/*
		 * try~catch 구문을 사용해서 예외처리하기
		 * 	
		 * 	형식 
		 * 		catch블록안에 부모가 항상 아래쪽에 있어야함. 자식예외는 위쪽에 
		 * 		catch블록 하나가 실행되면 다음 catch블록은 실행되지 않는다.
		 * 		try {
		 *  		예외 발생이 예상되는 수행문;
		 *  		예외 발생이 예상되는 수행문;
		 * 		} catch (예외클래스명1 변수명1) {
		 * 			예외처리수행문1;
		 * 			예외처리수행문1;
		 * 		} catch (예외클래스명2 변수명2) {
		 * 			예외처리수행문2;
		 * 			예외처리수행문2;
		 * 		} catch (Exception 변수명3) {
		 * 			예외처리수행문3;
		 * 			예외처리수행문3;
		 * 		}
		 * 
		 * 		- try블록의 수행문에서 예외클래스명1에 해당되는 예외가 발생하면 
		 * 		  첫번째 catch 블록에서 해당 예외를 가로채고 변수명1에 대입한 다음,
		 * 		  예외처리수행문1을 실행한다. 
		 * 		- try블록의 수행문에서 예외클래스명2에 해당되는 예외가 발생하면 
		 * 		  두번째 catch 블록에서 해당 예외를 가로채고 변수명2에 대입한다음,
		 * 		  예외처리수행문2를 실행한다.
		 * 		- try블록의 수행문에서 예상하지 못한 예외가 발생하면 
		 * 		  세번째 catch 블록에서 해당 예외를 가로채고 변수명3에 대입한 다음,
		 * 		  예외처리수행문3을 실행한다.
		 */
		
		// Checked Exception이 발생하는 수행문 실행하고, try catch블록을 이용해 예외처리하기
		try {
			FileWriter writer = new FileWriter("src/sample01/sample01.txt");
			writer.write("예외처리 실습해보기");
			writer.close();
		} catch (IOException ex) {
			System.out.println("IOException이 발생하였습니다.");
		}
		
		
	}
}
