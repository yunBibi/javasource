package exception;

public class LoginEx {

	public static void main(String[] args) {
		try {
			login("white", "12345");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

		try {
			login("blue", "54321");
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}

	}

	public static void login(String id, String password) throws NotExistIdException, WrongPasswordException {
		// id�� "blue"�� �ƴϸ� NotExistIdException �߻���Ŵ
		if (!id.equals("blue")) {
			throw new NotExistIdException("���̵� �������� �ʽ��ϴ�.");
		}
		// password�� "12345"�� �ƴϸ� WrongPasswordException �߻�
		if (!password.equals("12345")) {
			throw new WrongPasswordException("�н����尡 Ʋ���ϴ�.");
		}
	}
}
