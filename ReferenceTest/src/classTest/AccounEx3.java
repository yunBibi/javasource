package classTest;
public class AccounEx3 {

	public static void main(String[] args) {
		// Account3 ��ü 5���� �����ϰ� �ʹ�
		Account3 account1 = new Account3("122-12", 2500000, "ȫ�浿");
		Account3 account2 = new Account3("122-13", 2600000, "��浿");
		Account3 account3 = new Account3("122-14", 2700000, "��浿");
		Account3 account4 = new Account3("122-15", 2800000, "�ֱ浿");
		Account3 account5 = new Account3("122-16", 2900000, "�̱浿");
		
		// ������ Ÿ������ ��ü ������ ȿ������ �����Ѵٸ�?
		// �迭

		Account3 accArr[] = new Account3[5];
		// System.out.println(accArr[0]);  // null�� �ʱ�ȭ�ȴ�.
		
		accArr[0] = new Account3("122-12", 2500000, "ȫ�浿");
		accArr[1] = new Account3("122-13", 2600000, "��浿");
		accArr[2] = new Account3("122-14", 2700000, "��浿");
		accArr[3] = new Account3("122-15", 2800000, "�ֱ浿");
		accArr[4] = new Account3("122-16", 2900000, "�̱浿");
				
		
		// Ÿ�� - 1) �⺻Ÿ��  2) ����Ÿ��
		// ����Ÿ�� : null�� �ʱ�ȭ�ȴ�. (�迭, Ŭ����)
		// Ŭ���� => �빮�ڷ� ������
		
//		for (int i = 0; i < accArr.length; i++) {
//			System.out.print(accArr[i].getName()+"\t");
//			System.out.print(accArr[i].getAccountNum()+"\t");
//			System.out.println(accArr[i].getBalance());
//		}
		
		accountPrint(accArr);
		
		System.out.println();
		
		for (int i = 0; i < accArr.length; i++) {
			Account3 account = accArr[i];
			
			// �Ա�
			account.acSave(10000); 
			accountPrint(account);
			
//			System.out.print(account.getName()+"\t");
//			System.out.print(account.getAccountNum()+"\t");
//			System.out.println(account.getBalance());
		}
		
	}
	
	// �׳� �ٸ� �޼ҵ� ����ϴ� ���İ� ����!
	// void print(Ÿ��:Account3 �̸�:arr[]) {}
	
	static void accountPrint(Account3 accArr[]) {
		for (int i = 0; i < accArr.length; i++) {
			System.out.print(accArr[i].getName()+"\t");
			System.out.print(accArr[i].getAccountNum()+"\t");
			System.out.println(accArr[i].getBalance());
		}
	}
	
	static void accountPrint(Account3 account) {
		System.out.print(account.getName()+"\t");
		System.out.print(account.getAccountNum()+"\t");
		System.out.println(account.getBalance());
	}
	
	// ������ �����ε� : �ϳ��� Ŭ������ ������ �̸����� �����ڰ� ����(��, ��ȣ ���� �ٸ��� �ؾ� ��)
	// �޼ҵ� �����ε� : �ϳ��� Ŭ������ ������ �̸����� �޼ҵ尡 ����(��, ��ȣ ���� �ٸ��� �ؾ� ��)
	// ���� �̸��� ���� �� �޼ҵ� ���� �����ε��� �ϰ� �ִٰ� ���� �ȴ�. 
	// �����ε� vs �������̵�
	
}
