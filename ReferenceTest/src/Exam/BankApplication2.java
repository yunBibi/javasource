package Exam;

import java.util.Scanner;

public class BankApplication2 {

	private static Account accountArray[] = new Account[100];
	private static Scanner scanner = new Scanner(System.in);
	
	public static void main(String[] args) {
		boolean run = true;
		while(run) {
			System.out.println("--------------------------------------------------------");
			System.out.println("1. 계좌생성 | 2. 계좌목록 | 3. 예금 | 4. 출금 | 5. 종료");
			System.out.println("--------------------------------------------------------");
			System.out.print("선택 > ");
			
			int selectNo = scanner.nextInt();
			
			if (selectNo == 1) {
				// 계좌 생성작업
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
			System.out.println("프로그램 종료");
	}
	
	// 계좌 생성하기
	private static void createAccount() {
		// 배열에서 비어 있는지 확인
		
		// 비어있다면 사용자의 입력값을 기반으로 객체 생성 비어있는 배열에 담기
		// 계좌번호, 계좌주, 잔액
		System.out.println("-------------");
		System.out.println("계좌생성");
		System.out.println("--------------");
		
		System.out.print("계좌번호: ");
		String ano = scanner.next();
		
		System.out.println();
		
		System.out.print("계좌주: ");
		String owner = scanner.next();
		
		System.out.print("초기 입금액: ");
		int balance = scanner.nextInt();
		
		System.out.println("결과: 계좌가 생성되었습니다. ");
		
	}
	
	// 계좌목록 보기
	private static void accountList() {

	}
	
	// 예금하기
	private static void deposit() {
	}
	
	// 출금하기
	private static void withdraw() {
		
	}
	
	// Account 배열에서 ano와 동일한 Account 객체 찾기
	// private static Account findAccount(String ano) {
		
//	}
}
