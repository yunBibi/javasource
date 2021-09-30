package classTest;
public class Account3 {
	// 속성 : 계좌번호(122-01-12222), 잔액, 이름
	
	private String accountNum;
	private int balance;
	private String name;
	
	// 생성자	
	public Account3() {
		super();
	}
	
	public Account3(String accountNum, int balance, String name) {
		super();
		this.accountNum = accountNum;
		this.balance = balance;
		this.name = name;
	}
	
	
	public Account3(String accountNum, String name) {
		super();
		this.accountNum = accountNum;
		this.name = name;
	}
	
	
	// 외부로부터 값을 받아서 멤버변수의 값을 변경하는 작업 시
	// set~으로 시작하는 메소드를 작성한다. 
	
	// 멤버변수 : 계좌번호를 변경하고 싶다면?
	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}
	
	// 이름을 변경하고 싶다면?
	public void setName(String name) {
		this.name = name;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	// 멤버변수의 값을 리턴하고 싶다면?
	// get~으로 시작하기
	public int getBalance() {
		return balance;
	}
	
	public String getName() {
		return name;
	}
	
	public String getAccountNum() {
		return accountNum;
	}
	 
	
	
	// 기능 : 입금하다(입력값 : 입금액, 출력값 : 없음)  출금하다(입력값 : 출금액, 출력값 : 현재 잔액)
	void acSave(int x) {
		balance += x;
	}
	
	int acWithdraw (int x) {
		if (balance > x) {
			return balance -= x;
		}
		return balance;
	}
	
}
