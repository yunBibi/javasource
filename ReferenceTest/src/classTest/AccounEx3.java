package classTest;
public class AccounEx3 {

	public static void main(String[] args) {
		// Account3 객체 5개를 생성하고 싶다
		Account3 account1 = new Account3("122-12", 2500000, "홍길동");
		Account3 account2 = new Account3("122-13", 2600000, "장길동");
		Account3 account3 = new Account3("122-14", 2700000, "김길동");
		Account3 account4 = new Account3("122-15", 2800000, "최길동");
		Account3 account5 = new Account3("122-16", 2900000, "이길동");
		
		// 동일한 타입으로 객체 생성시 효율성을 적용한다면?
		// 배열

		Account3 accArr[] = new Account3[5];
		// System.out.println(accArr[0]);  // null로 초기화된다.
		
		accArr[0] = new Account3("122-12", 2500000, "홍길동");
		accArr[1] = new Account3("122-13", 2600000, "장길동");
		accArr[2] = new Account3("122-14", 2700000, "김길동");
		accArr[3] = new Account3("122-15", 2800000, "최길동");
		accArr[4] = new Account3("122-16", 2900000, "이길동");
				
		
		// 타입 - 1) 기본타입  2) 참조타입
		// 참조타입 : null로 초기화된다. (배열, 클래스)
		// 클래스 => 대문자로 시작함
		
//		for (int i = 0; i < accArr.length; i++) {
//			System.out.print(accArr[i].getName()+"\t");
//			System.out.print(accArr[i].getAccountNum()+"\t");
//			System.out.println(accArr[i].getBalance());
//		}
		
		accountPrint(accArr);
		
		System.out.println();
		
		for (int i = 0; i < accArr.length; i++) {
			Account3 account = accArr[i];
			
			// 입금
			account.acSave(10000); 
			accountPrint(account);
			
//			System.out.print(account.getName()+"\t");
//			System.out.print(account.getAccountNum()+"\t");
//			System.out.println(account.getBalance());
		}
		
	}
	
	// 그냥 다른 메소드 사용하는 공식과 같다!
	// void print(타입:Account3 이름:arr[]) {}
	
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
	
	// 생성자 오버로딩 : 하나의 클래스에 동일한 이름으로 생성자가 존재(단, 괄호 안을 다르게 해야 함)
	// 메소드 오버로딩 : 하나의 클래스에 동일한 이름으로 메소드가 존재(단, 괄호 안을 다르게 해야 함)
	// 위의 이름이 같은 두 메소드 역시 오버로딩을 하고 있다고 보면 된다. 
	// 오버로딩 vs 오버라이딩
	
}
