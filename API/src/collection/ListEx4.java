package collection;

import java.util.LinkedList;
import java.util.List;

/* ArrayList vs LinkedList
 * - ���������� �߰�/���� �� ArrayList�� �� ������.
 * - �߰� �����͸� �߰�/���� �� LinkedList�� �� �� ������.
 * ���� ��Ŀ� ���̰� �ֱ� ������
 */

public class ListEx4 {

	public static void main(String[] args) {
		List<String> list = new LinkedList<String>();
		
		list.add("���");
		list.add("��");
		list.add("������");
		list.add("����");
		list.add("����");
		list.add("�ٳ���");
		
		System.out.println(list);
	}

}
