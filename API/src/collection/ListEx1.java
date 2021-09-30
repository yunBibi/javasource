package collection;

import java.util.ArrayList;
import java.util.List;

/* 컬렉션 프레임워크
 * - 여러 데이터들을 저장하는 클래스들을 표준화한 설계방식
 *  같은 타입을 담기 위해 표준화 시킨 것이다.
 *   Collection -> List, Set
 *   Map
 * 
 *  List(인터페이스)
 *  1) 순서가 있다
 *  2) 데이터의 중복이 가능하다
 *  
 *  List는 인터페이스이기 때문에 new를 써서 시행시킬 수 없다. 
 *  Vector, ArrayList, LinkedList, Stack.. 등을 사용하여 실행한다.
 *  배열과 같은 개념인데 향상시킨 구조
 *  
 *  배열의 문제점
 *  - 저장할 수 있는 객체 수가 배열을 생성할 때 겨렁
 *  불특정 다수의 객체를 저장하기에는 문제
 *  - 객체 삭제했을 때 해당 인덱스가 비게 됨. 낱알빠진 옥수수 같은 배열
 *  객체를 저장하려면 어디가 비어 있는지 확인해야 한다.
 *
 * E, T, K, V : 객체 타입을 지정하라는 말  ->  담을 객체 타입을 지정해라 
 * List<E> list1 = new ArrayList<E>();
	ArrayList<E> list2 = new ArrayList<E>();
 *
 * 기본 타입, int 등.. 그대로 사용 불가. 그래서 기본타입을 객체 타입으로 바꿔줄 수 있는 'Wrapper'클래스를 사용
 * int => Integer, float => Float, double => Double, char => Character, boolean => Boolean
 *
 */

// extends, implements 객체 생성 2가지 방법
// 부모 = new 자식()
// 자식 = new 자식()

public class ListEx1 {
	public static void main(String[] args) {
		// 객체 생성
		List<String> list1 = new ArrayList<String>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		
		// 데이터 추가 => add()
		list1.add("사과");
		list1.add("배");
		list1.add("복숭아");
		list1.add("딸기");
		list1.add("수박");
		list1.add("바나나");
		
		// 데이터 가져오기
		for (String str:list1) {
			System.out.println(str);  
		}
		System.out.println();
		
		System.out.println(list1);   // [사과, 배, 복숭아, 딸기, 수박, 바나나] toString()이 오버라이딩 되어있음 
		
		System.out.println();
		
		for (int i = 0; i < list1.size(); i++) {   // length()대신 size()를 사용
			System.out.println(list1.get(i));
		}
		
		System.out.println();
		
		list2.add(10);
		list2.add(20);
		list2.add(30);
		list2.add(40);
		list2.add(50);
		list2.add(60);
		
		for(Integer i:list2) {
			System.out.println(i);
		}
		
		// 합계 구하기
		int sum = 0;
		for (Integer i:list2) {
			sum += i;
		}
 	}

}
