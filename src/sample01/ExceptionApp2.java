package sample01;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class ExceptionApp2 {
	public static void main(String[] args) {
		
		// 예외처리방법 1. try~catch 블록
		// 예외 발생했을 때 그부분 이후의 try 블록을 건너뛰고 바로 catch블록으로 간다.
		try {
		FileReader reader = new FileReader("src/sample01/sample.txt"); //
		BufferedReader br = new BufferedReader(reader);
		String text =br.readLine();
		System.out.println(text);
		br.close();
		} catch (FileNotFoundException ex) {
			System.out.println("지정된 파일을 찾을 수 없습니다.");
		} catch (IOException ex) {
			System.out.println("읽기 작업 중 오류가 발생하였습니다.");
		} // IOException, FileNotFoundException 를 순서대로 해야함. IOE가 부모기 때문.
	}
}
