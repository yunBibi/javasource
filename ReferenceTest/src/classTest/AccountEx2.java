package classTest;
public class AccountEx2 {
public static void main(String[] args) {
	
	Account2 myAccount  = new Account2();
	
    // �����ڸ� ������� �ʰ� ������� �� �ʱ�ȭ	
	// ���¹�ȣ
	myAccount.setAccountNum("122-01-12222");
	// �̸�
	myAccount.setName("ȫ�浿");
	
	// �Ա�
	myAccount.acSave(100000);
	//System.out.println(myAccount.balance);
	System.out.println("�Ա� �� �ܾ�: " + myAccount.getBalance());
	
	// ���
	// myAccount.acWithdraw(50000);
	System.out.println(myAccount.acWithdraw(50000));
	
	
	
	// ������ ����
	Account2 account2 = new Account2("122-01-1333", "������");
	System.out.println("���� �ܾ� : " + account2.getBalance());
	
	// �ں��� ����
	Account2 account3 = new Account2("122-01-1333", 1000000, "�ں���");
	System.out.println("���� �ܾ� : " + account3.getBalance());
}
}
