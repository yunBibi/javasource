package exception;

public class AccountEx {

	public static void main(String[] args) {
		Account account = new Account();
		
		try {
			account.withdraw(10000);
		} catch (Exception e) {
//			e.printStackTrace();  // ������ ��� ������ �����ؼ� �������
			System.out.println(e.getMessage());
		}
		
		// try ������ �ܵ����δ� �� �� ����
		try {} 
	 	finally {}
		
		try {}
		catch (Exception e) {}
	}

}
