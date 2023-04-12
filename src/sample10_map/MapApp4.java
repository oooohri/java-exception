package sample10_map;

import java.util.HashMap;
import java.util.Map;

public class MapApp4 {
	public static void main(String[] args) {
		
		// Map객체를 이용해서 변화가 많은 정보를 저장할 수 있다.
		
		// Map객체를 이용해서 다양한 검색조건 정보를 저장할 수 있다.
		/*
		 * Map객체를 이용해서 다양한 정보를 저장한 valueObject처럼 사용하기
		 * 	- 저장할 정보의 항목이 매우 다양하고, 변화가 많은 경우
		 * 	- 하나의 정보를 매우 다양한 형식으로 표현해야 하는 경우	
		 * 
		 * Map객체를 이용할 때 주의할 내용
		 * 	- key값이 문자열인 경우가 많은데, 오탈자가 있을때 체크가 되지 않는다.
		 * 		map.get("seachKeyword");	//오탈자가 있어도 오류발생X, ide의 자동완성 기능 사용X
		 * 		vo.getSearchKeyword(); 		// -> 자동완성됨
		 * 
		 * 	- Value의 타입이 Object인 경우, 값을 조회할 때 클래스형변환이 필요하다.
		 * 		Map<String, Object> map = new HashMap<>();
		 * 		// Key, Value의 상으로 값 저장하기
		 * 		map.put("sort","price");
		 * 		map.put("row",10);
		 * 		// Key값 조회하기 -> 클래스 형변환 필요
		 * 			// Object obj1 = map.get("sort");
		 * 		// Map객체에 처음 저장했던 타입 그대로 조회하기 위해서 클래스 형변환이 필요하다.
		 * 		// Sort의 값인 "price"가 Object타입으로 변환되어서 저장되어 있는데, 이를 String타입
		 * 		String obj1 = (String)map.get("sort");
		 * 		int obj2 = (Integer)map.get("row");
		 * 
		 */
		Map<String, Object> map =new HashMap<>();
		map.put("sort", "price"); 			// 정렬기준
		map.put("row", 20);					// 출력기준
		map.put("search-opt", "title");		// 검색옵션
		map.put("searchKeyword", "토익시험"); 	// 검색키워드
		map.put("minPrice", 15000);			// 최소가격
		map.put("maxPrice", 30000);			// 최대가격
		map.put("pegeNo", 2);				// 요청페이지번호

	
	
	}
}
