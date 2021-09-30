package com.samsung.project;

public class Account {
	// 속성 : 계좌번호(122-01-12222), 잔액, 이름
	
	String accountNum;
	int balance;
	String name;
	
	// 기본 생성자
	
	
	public Account(String accountNum, int balance, String name) {
		super();
		this.accountNum = accountNum;
		this.balance = balance;
		this.name = name;
	}
	int acWithdraw (int x) {
		if (balance > x) {
			return balance -= x;
		}
		return balance;
	}
	
	// 기능 : 입금하다(입력값 : 입금액, 출력값 : 없음)  출금하다(입력값 : 출금액, 출력값 : 현재 잔액)
	public void acSave(int x) {
		balance += x;
	}
}
