package collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/* Set : �ߺ� ������� ����, ������ ����, 
 *     : ���� Ŭ���� - HashSet, Treeset
 */

public class SetEx1 {
	public static void main(String[] args) {
		
		
		Set<String> set1 = new HashSet<String>();
		HashSet set2 = new HashSet<String>();
		
		set1.add("java");
		set1.add("jsp");
		set1.add("oracle");
		set1.add("html");
		
		System.out.println(set1);   // [java, oracle, jsp, html]  set�� ������ ���� ������ ���� ������ ������ �ʴ´�.
		
		System.out.println();
		
		for (String str:set1) {
			System.out.println(str);
		}
		
		System.out.println();
		
		set2.add("1");
		set2.add("2");
		set2.add("3");
		set2.add("4");
		set2.add("1");
		
		System.out.println(set2);   // [1, 2, 3, 4] set�� �ߺ� ������� �ʱ� ������ 1�� �� ���� ����
	}

}
