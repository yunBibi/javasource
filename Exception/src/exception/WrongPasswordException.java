package exception;

public class WrongPasswordException extends Exception {
	// ������ 2��(default, String)

	public WrongPasswordException() {
		super();
	}

	public WrongPasswordException(String message) {
		super(message);
	}
	
}
