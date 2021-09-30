package classTest;
public class AccountEx2 {
public static void main(String[] args) {
	
	Account2 myAccount  = new Account2();
	
    // 생설자를 사용하지 않고 멤버변수 값 초기화	
	// 계좌번호
	myAccount.setAccountNum("122-01-12222");
	// 이름
	myAccount.setName("홍길동");
	
	// 입금
	myAccount.acSave(100000);
	//System.out.println(myAccount.balance);
	System.out.println("입금 후 잔액: " + myAccount.getBalance());
	
	// 출금
	// myAccount.acWithdraw(50000);
	System.out.println(myAccount.acWithdraw(50000));
	
	
	
	// 성춘향 계좌
	Account2 account2 = new Account2("122-01-1333", "성춘향");
	System.out.println("현재 잔액 : " + account2.getBalance());
	
	// 박보검 계좌
	Account2 account3 = new Account2("122-01-1333", 1000000, "박보검");
	System.out.println("현재 잔액 : " + account3.getBalance());
}
}
