package inheritance;

public class Account2 {
	private String accountNum;
	private int balance;
	private String name;
	
	public Account2() {
		super();
	}
	
	public Account2(String accountNum, int balance, String name) {
		super();
		this.accountNum = accountNum;
		this.balance = balance;
		this.name = name;
	}
	
	
//	public Account2(String accountNum, String name) {
//		super();
//		this.accountNum = accountNum;
//		this.name = name;
//	}
	
	
	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public int getBalance() {
		return balance;
	}

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
