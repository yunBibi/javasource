package com.samsung.project;

public class Account {
	// �Ӽ� : ���¹�ȣ(122-01-12222), �ܾ�, �̸�
	
	String accountNum;
	int balance;
	String name;
	
	// �⺻ ������
	
	
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
	
	// ��� : �Ա��ϴ�(�Է°� : �Աݾ�, ��°� : ����)  ����ϴ�(�Է°� : ��ݾ�, ��°� : ���� �ܾ�)
	public void acSave(int x) {
		balance += x;
	}
}
