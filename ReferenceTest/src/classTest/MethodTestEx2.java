package classTest;

public class MethodTestEx2 {
	public static void main(String[] args) {
		
		// 1. �ν��Ͻ� �����ϱ�
		MethodTest2 obj = new MethodTest2();
		
		// 2. ����ϰ� ���� �޼ҵ� �θ���
		obj.print99dan();

		// ���� ��� �ҷ�����
		// �޼ҵ带 ȣ���ϴ� �ʿ��� �Է°��� �־��ֱ�
		obj.sum(3, 5);
		
		byte b1 = 3;
		byte b2 = 5;
		
		obj.sum(b1, b2);
		// byte�� ����� ���� int�� ��� <- �ڵ�����ȯ�� ��
		// �ڵ�����ȯ: ���� Ÿ���� ū Ÿ�Կ� ����
		// ��������ȯ: ū Ÿ���� ���� Ÿ�Կ� ����  ()��ȣ�� ���
	}

}
