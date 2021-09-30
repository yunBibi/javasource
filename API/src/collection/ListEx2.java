package collection;

import java.util.ArrayList;
import java.util.Comparator;

public class ListEx2 {

	public static void main(String[] args) {
		ArrayList<String> list = new ArrayList();
		
		list.add("java");
		list.add("JDBC");
		list.add("Servlet");
		list.add("jsp");
		list.add("java");    // ArrayList 안에는 중복이 가능하다
		System.out.println(list);    //[java, JDBC, Servlet, jsp, java]
		
		list.add(2, "oracle");   // index로 위치 지정하기
		System.out.println(list);     // [java, JDBC, oracle, Servlet, jsp, java]
		
		// 삭제
		list.remove(1);
		System.out.println(list);     // [java, oracle, Servlet, jsp, java]
		
		// 정렬
		list.sort(Comparator.reverseOrder());  // 내림차순, naturalOrder() : 오름차순
		System.out.println(list);      // [oracle, jsp, java, java, Servlet]
		
	}

}
