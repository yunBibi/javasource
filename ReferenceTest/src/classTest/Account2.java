package classTest;
public class Account2 {
	// �Ӽ� : ���¹�ȣ(122-01-12222), �ܾ�, �̸�
	
	private String accountNum;
	private int balance;
	private String name;
	
	// ������	
	public Account2() {
		super();
	}
	
	public Account2(String accountNum, int balance, String name) {
		super();
		this.accountNum = accountNum;
		this.balance = balance;
		this.name = name;
	}
	
	
	public Account2(String accountNum, String name) {
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
	
	
	// ��������� ���� �����ϰ� �ʹٸ�?
	// get~���� �����ϱ�
	public int getBalance() {
		return balance;
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
