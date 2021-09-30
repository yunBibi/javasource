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
		// id가 "blue"가 아니면 NotExistIdException 발생시킴
		if (!id.equals("blue")) {
			throw new NotExistIdException("아이디가 존재하지 않습니다.");
		}
		// password가 "12345"가 아니면 WrongPasswordException 발생
		if (!password.equals("12345")) {
			throw new WrongPasswordException("패스워드가 틀립니다.");
		}
	}
}
