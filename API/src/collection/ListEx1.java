package collection;

import java.util.ArrayList;
import java.util.List;

/* �÷��� �����ӿ�ũ
 * - ���� �����͵��� �����ϴ� Ŭ�������� ǥ��ȭ�� ������
 *  ���� Ÿ���� ��� ���� ǥ��ȭ ��Ų ���̴�.
 *   Collection -> List, Set
 *   Map
 * 
 *  List(�������̽�)
 *  1) ������ �ִ�
 *  2) �������� �ߺ��� �����ϴ�
 *  
 *  List�� �������̽��̱� ������ new�� �Ἥ �����ų �� ����. 
 *  Vector, ArrayList, LinkedList, Stack.. ���� ����Ͽ� �����Ѵ�.
 *  �迭�� ���� �����ε� ����Ų ����
 *  
 *  �迭�� ������
 *  - ������ �� �ִ� ��ü ���� �迭�� ������ �� �ܷ�
 *  ��Ư�� �ټ��� ��ü�� �����ϱ⿡�� ����
 *  - ��ü �������� �� �ش� �ε����� ��� ��. ���˺��� ������ ���� �迭
 *  ��ü�� �����Ϸ��� ��� ��� �ִ��� Ȯ���ؾ� �Ѵ�.
 *
 * E, T, K, V : ��ü Ÿ���� �����϶�� ��  ->  ���� ��ü Ÿ���� �����ض� 
 * List<E> list1 = new ArrayList<E>();
	ArrayList<E> list2 = new ArrayList<E>();
 *
 * �⺻ Ÿ��, int ��.. �״�� ��� �Ұ�. �׷��� �⺻Ÿ���� ��ü Ÿ������ �ٲ��� �� �ִ� 'Wrapper'Ŭ������ ���
 * int => Integer, float => Float, double => Double, char => Character, boolean => Boolean
 *
 */

// extends, implements ��ü ���� 2���� ���
// �θ� = new �ڽ�()
// �ڽ� = new �ڽ�()

public class ListEx1 {
	public static void main(String[] args) {
		// ��ü ����
		List<String> list1 = new ArrayList<String>();
		ArrayList<Integer> list2 = new ArrayList<Integer>();
		
		// ������ �߰� => add()
		list1.add("���");
		list1.add("��");
		list1.add("������");
		list1.add("����");
		list1.add("����");
		list1.add("�ٳ���");
		
		// ������ ��������
		for (String str:list1) {
			System.out.println(str);  
		}
		System.out.println();
		
		System.out.println(list1);   // [���, ��, ������, ����, ����, �ٳ���] toString()�� �������̵� �Ǿ����� 
		
		System.out.println();
		
		for (int i = 0; i < list1.size(); i++) {   // length()��� size()�� ���
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
		
		// �հ� ���ϱ�
		int sum = 0;
		for (Integer i:list2) {
			sum += i;
		}
 	}

}
