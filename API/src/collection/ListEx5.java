package collection;

import java.util.ArrayList;
import java.util.List;

/* ArrayList vs LinkedList
 * - 순차적으로 추가/삭제 시 ArrayList가 더 빠르다.   => size를 크게 잡는게 중요
 * - 중간 데이터를 추가/삭제 시 LinkedList가 좀 더 빠르다.
 */

public class ListEx5 {
	public static void main(String[] args) {
		List<String> arrayList = new ArrayList<String>(200000000);
		List<String> linkedList = new ArrayList<String>();

		System.out.println("***** 순차적 추가 *****");
		System.out.println("ArrayList 걸린 시간 : " + add1(arrayList) + "ms");
		System.out.println("LinkedList 걸린 시간 : " + add1(linkedList) + "ms");
		add1(arrayList);
		add1(linkedList);

		System.out.println();

		System.out.println("***** 중간에서 추가 *****");
		System.out.println("ArrayList 걸린 시간 : " + add2(arrayList) + "ms");
		System.out.println("LinkedList 걸린 시간 : " + add2(linkedList) + "ms");
		add1(arrayList);
		add1(linkedList);

		System.out.println();

		System.out.println("***** 중간에서 삭제 *****");
		System.out.println("ArrayList 걸린 시간 : " + remove1(arrayList) + "ms");
		System.out.println("LinkedList 걸린 시간 : " + remove1(linkedList) + "ms");
		add1(arrayList);
		add1(linkedList);

		System.out.println();

		System.out.println("***** 순차적으로 삭제 *****");
		System.out.println("ArrayList 걸린 시간 : " + remove1(arrayList) + "ms");
		System.out.println("LinkedList 걸린 시간 : " + remove1(linkedList) + "ms");
		add1(arrayList);
		add1(linkedList);

	}

	// 순차적인 추가
	public static long add1(List<String> list) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 10000000; i++) {
			list.add(i + "");
		}
		long end = System.currentTimeMillis();
		return end - start;
	}

	// 중간에서 추가
	public static long add2(List<String> list) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			list.add(500 + "X");
		}
		long end = System.currentTimeMillis();
		return end - start;
	}

	// 중간에서 삭제
	public static long remove1(List<String> list) {
		long start = System.currentTimeMillis();
		for (int i = 0; i < 10000; i++) {
			list.remove(i);
		}
		long end = System.currentTimeMillis();
		return end - start;
	}

	// 순차적인 삭제
	public static long remove2(List<String> list) {
		long start = System.currentTimeMillis();
		for (int i = list.size() - 1; i < 0; i--) {
			list.remove(i);
		}
		long end = System.currentTimeMillis();
		return end - start;
	}

}
