package Exam;

import java.util.Scanner;

public class BankApplication2 {

	private static Account accountArray[] = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("--------------------------------------------------------");
			System.out.println("1. ���»��� | 2. ���¸�� | 3. ���� | 4. ��� | 5. ����");
			System.out.println("--------------------------------------------------------");
			System.out.print("���� > ");
			
			int selectNo = scanner.nextInt();
			
			if (selectNo == 1) {
				// ���� �����۾�
				createAccount();
				
			}else if (selectNo ==2) {
				accountList();
				
			}else if(selectNo == 3) {
				deposit();
				
			}else if(selectNo == 4) {
				withdraw();
				
			}else if (selectNo == 5) {
				run = false;
			}
		}
			System.out.println("���α׷� ����");
	}
	
	// ���� �����ϱ�
	private static void createAccount() {
		// �迭���� ��� �ִ��� Ȯ��
		
		// ����ִٸ� ������� �Է°��� ������� ��ü ���� ����ִ� �迭�� ���
		// ���¹�ȣ, ������, �ܾ�
		System.out.println("-------------");
		System.out.println("���»���");
		System.out.println("--------------");
		
		System.out.print("���¹�ȣ: ");
		String ano = scanner.next();
		
		System.out.println();
		
		System.out.print("������: ");
		String owner = scanner.next();
		
		System.out.print("�ʱ� �Աݾ�: ");
		int balance = scanner.nextInt();
		
		System.out.println("���: ���°� �����Ǿ����ϴ�. ");
		
	}
	
	// ���¸�� ����
	private static void accountList() {

	}
	
	// �����ϱ�
	private static void deposit() {
	}
	
	// ����ϱ�
	private static void withdraw() {
		
	}
	
	// Account �迭���� ano�� ������ Account ��ü ã��
	// private static Account findAccount(String ano) {
		
//	}
}
