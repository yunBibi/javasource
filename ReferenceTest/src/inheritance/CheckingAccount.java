package inheritance;

public class CheckingAccount extends Account2 {
	// ���¹�ȣ, ������, �ܾ�(�θ� ������ ����), ī���ȣ 
	
	private String cardNo;
	
	public CheckingAccount(String accountNo, int balance, String name, String cardNo) {
		super(accountNo, balance, name);
		this.cardNo = cardNo;
	}

	public String pay(String string, int i) {
		return null;
	}
	
	// �Ա��ϴ�, ����ϴ�(�θ� ������ ����), ī�尪�� �����ϴ�.
	// �Է°� : ī���ȣ, ���ݾ�
	// ��ȯ�� : ����int
	// ī�尪�� �����Ѵ�. (�Ѿ�� ī�� ��ȣ�� ���� �߱޵� ī���ȣ�� ������, 
	//                     ���ݾ��� ���� �ܾ׺��� ������ Ȯ���� ��) 
}
