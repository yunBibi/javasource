package object;

public class ObjectEx1 {

	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = new Object();
		
		//equals (�ּҺ�) => false
		System.out.println(obj1.equals(obj2));
		
		// ���� ���ó�� Object���� ����ϴ� equals�� �ּҺ񱳿��µ�, String������ ���ڿ��񱳰� �Ǿ��� ������
		// String ����ϴ� equals�� �������̵� �� ���� �� �� �ִ�.
		String str1 = "ȫ�浿";
		String str2 = "ȫ�浿";
		System.out.println(str1.equals(str2));
		
		Value value1 = new Value(10);
		Value value2 = new Value(10);
		System.out.println(value1.equals(value2));
	}

}
