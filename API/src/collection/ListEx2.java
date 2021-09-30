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
		list.add("java");    // ArrayList �ȿ��� �ߺ��� �����ϴ�
		System.out.println(list);    //[java, JDBC, Servlet, jsp, java]
		
		list.add(2, "oracle");   // index�� ��ġ �����ϱ�
		System.out.println(list);     // [java, JDBC, oracle, Servlet, jsp, java]
		
		// ����
		list.remove(1);
		System.out.println(list);     // [java, oracle, Servlet, jsp, java]
		
		// ����
		list.sort(Comparator.reverseOrder());  // ��������, naturalOrder() : ��������
		System.out.println(list);      // [oracle, jsp, java, java, Servlet]
		
	}

}
