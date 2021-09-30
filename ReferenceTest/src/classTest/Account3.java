package classTest;
public class Account3 {
	// �Ӽ� : ���¹�ȣ(122-01-12222), �ܾ�, �̸�
	
	private String accountNum;
	private int balance;
	private String name;
	
	// ������	
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
	
	
	// �ܺηκ��� ���� �޾Ƽ� ��������� ���� �����ϴ� �۾� ��
	// set~���� �����ϴ� �޼ҵ带 �ۼ��Ѵ�. 
	
	// ������� : ���¹�ȣ�� �����ϰ� �ʹٸ�?
	public void setAccountNum(String accountNum) {
		this.accountNum = accountNum;
	}
	
	// �̸��� �����ϰ� �ʹٸ�?
	public void setName(String name) {
		this.name = name;
	}
	
	public void setBalance(int balance) {
		this.balance = balance;
	}
	
	// ��������� ���� �����ϰ� �ʹٸ�?
	// get~���� �����ϱ�
	public int getBalance() {
		return balance;
	}
	
	public String getName() {
		return name;
	}
	
	public String getAccountNum() {
		return accountNum;
	}
	 
	
	
	// ��� : �Ա��ϴ�(�Է°� : �Աݾ�, ��°� : ����)  ����ϴ�(�Է°� : ��ݾ�, ��°� : ���� �ܾ�)
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
