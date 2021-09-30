package inheritance;

public class CheckingAccount extends Account2 {
	// 계좌번호, 계좌주, 잔액(부모가 가지고 있음), 카드번호 
	
	private String cardNo;
	
	public CheckingAccount(String accountNo, int balance, String name, String cardNo) {
		super(accountNo, balance, name);
		this.cardNo = cardNo;
	}

	public String pay(String string, int i) {
		return null;
	}
	
	// 입금하다, 출금하다(부모가 가지고 있음), 카드값을 지불하다.
	// 입력값 : 카드번호, 사용금액
	// 반환값 : 정수int
	// 카드값을 지불한다. (넘어온 카드 번호와 실제 발급된 카드번호가 같은지, 
	//                     사용금액은 현재 잔액보다 작은지 확인한 후) 
}
