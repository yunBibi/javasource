package exception;

// Exception (���ܻ���)
// CheckedException  : compile �� ��Ÿ���� ����
// UnCheckedException : run Ÿ�� �� ��Ÿ���� ����

public class CheckedException {

	public static void main(String[] args) {
		// ClassNotFoundException
		try {
			Class.forName("java.lang.String");
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		}
	}
}
