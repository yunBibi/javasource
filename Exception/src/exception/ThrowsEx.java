package exception;

public class ThrowsEx {
	// main ���� throws �� �ǹ� 
	// throws ClassNotFoundException : JVM ���� �������ٴ� �ǹ� (����ȭ���� ��µȴ�.)
	public static void main(String[] args) /*throws ClassNotFoundException*/ {
		
		try {
			findClass();
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}

	// ���⿡�� �߻��� ���ܸ� �� �޼ҵ带 ȣ���ϴ� ������ �����ڴٴ� �ǹ�(throws)
	public static void findClass() throws ClassNotFoundException {
		Class.forName("");
	}
}
