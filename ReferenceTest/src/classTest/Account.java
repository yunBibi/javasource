package classTest;

public class Account {
	// �Ӽ� : ���¹�ȣ(122-01-12222), �ܾ�, �̸�
	
	String accountNum;
	int balance;
	String name;
	
	// �⺻ ������
	Account(){
		
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
