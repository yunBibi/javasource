package com.samsung.project;

public class AccountEx {
public static void main(String[] args) {
	
	Account myAccount  = new Account("122-01-12222", 200000, "À±¿¹¿ø");
	
//	myAccount.accountNum = "122-01-12222";
//	myAccount.balance = 200000;
//	myAccount.name = "À±¿¹¿ø";
	
	myAccount.acSave(100000);
	System.out.println(myAccount.balance);
	
	// myAccount.acWithdraw(50000);
	System.out.println(myAccount.acWithdraw(50000));
}
}
