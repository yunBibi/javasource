package collection;

import java.lang.reflect.Member;
import java.util.ArrayList;
import java.util.List;

public class ListEx3 {

	public static void main(String[] args) {
		// ����
		List<Member> list = new ArrayList<>();
		
		// �߰�
		list.add(Member("hong", "hong1234", "ȫ�浿"));
		list.add(Member("hong", "hong12345", "��浿"));
		list.add(Member("hong", "hong12346", "�ֱ浿"));
		list.add(Member("hong", "hong12347", "��浿"));
		list.add(Member("hong", "hong12348", "�ڱ浿"));
		
		// ��������
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
