package exception;
// ����� ���� Exception ����� ��
public class BalanceInsufficientException extends Exception {

	public BalanceInsufficientException() {
		super();
	}

	public BalanceInsufficientException(String message) {
		super(message);
	}
	
}
