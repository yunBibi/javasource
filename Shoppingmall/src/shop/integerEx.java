package shop;

import java.util.Scanner;

public class integerEx {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("���ڸ� �Է��� �ּ���");
		String input = sc.next();
		System.out.println(input+5);
		
		int num = Integer.parseInt(input);
		System.out.println(num+5);
		
	}

}
