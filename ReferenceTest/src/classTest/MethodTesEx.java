package classTest;

public class MethodTesEx {

	public static void main(String[] args) {
		MethodTest1 obj = new MethodTest1();    // ��ü ����� �غ��ϱ�
		
		// �޼ҵ� ȣ�� �� ���ϵǴ� ���� �ִ� ���
		// ó�� ��1 - print()
		System.out.println(obj.isRedirect());
		// ó�� ��2 - ���� ���� ���ϵǴ� �� �ޱ�
		boolean result = obj.isRedirect();
		// result�� �̿��ؼ� �ڵ� �ۼ� ����
		
		obj.sum();
		System.out.println(obj.sum());
		
		int var1 = obj.sum();
		
		System.out.println(obj.add(25, 35));
		
		
	}

}
