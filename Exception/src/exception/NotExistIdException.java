package exception;

public class NotExistIdException extends Exception {
	// 생성자 2개(default, String)

	public NotExistIdException() {
		super();
	}

	public NotExistIdException(String message) {
		super(message);
	}
	
}
