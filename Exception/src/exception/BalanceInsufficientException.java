package exception;
// 사용자 지정 Exception 만드는 법
public class BalanceInsufficientException extends Exception {

	public BalanceInsufficientException() {
		super();
	}

	public BalanceInsufficientException(String message) {
		super(message);
	}
	
}
