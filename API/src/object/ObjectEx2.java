package object;

public class ObjectEx2 {

	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = new Object();
		
		//toString => ��ü�� ���ڿ��� ǥ��
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
		
		// String ����ϴ� toStringdms �������̵� �� ���� �� �� �ִ�. (��ü�� ������ �ִ� ���� ����ϵ���)
		String str1 = "ȫ�浿";
		String str2 = "ȫ�浿";
		System.out.println(str1.toString());
		System.out.println(str2.toString());
		
		Value value1 = new Value(10);
		Value value2 = new Value(10);
		// toString() => 10�̶�� ���� ����ϵ��� �������̵� �ϱ�
		System.out.println(value1.toString());
		System.out.println(value2.toString());
	}

}
