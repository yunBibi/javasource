package collection;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;

/* Set : 중복 허용하지 않음, 순서가 없음, 
 *     : 구현 클래스 - HashSet, Treeset
 */

public class SetEx1 {
	public static void main(String[] args) {
		
		
		Set<String> set1 = new HashSet<String>();
		HashSet set2 = new HashSet<String>();
		
		set1.add("java");
		set1.add("jsp");
		set1.add("oracle");
		set1.add("html");
		
		System.out.println(set1);   // [java, oracle, jsp, html]  set은 순서가 없기 때문에 담은 순으로 나오진 않는다.
		
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
		
		System.out.println(set2);   // [1, 2, 3, 4] set은 중복 허용하지 않기 때문에 1은 한 번만 나옴
	}

}
