package collection;

import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.List;

public class ListEx3 {

	public static void main(String[] args) {
		// 생성
		List<Member> list = new ArrayList<>();
		
		// 추가
		list.add(Member("hong", "hong1234", "홍길동"));
		list.add(Member("hong", "hong12345", "장길동"));
		list.add(Member("hong", "hong12346", "최길동"));
		list.add(Member("hong", "hong12347", "김길동"));
		list.add(Member("hong", "hong12348", "박길동"));
		
		// 가져오기
		System.out.println(list);
		
		System.out.println();
		
		for(Member member:list) {
			System.out.println(member);
		}
		
	}

	private static Member Member(String string, String string2, String string3) {
		// TODO Auto-generated method stub
		return null;
	}

}
