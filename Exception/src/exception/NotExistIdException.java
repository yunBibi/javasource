package exception;

public class NotExistIdException extends Exception {
	// ������ 2��(default, String)

	public NotExistIdException() {
		super();
	}

	public NotExistIdException(String message) {
		super(message);
	}
	
}
