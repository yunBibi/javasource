package Test;

import java.util.Scanner;

public class SwitchEx3 {
	public static void main(String[] args) {
		// String position = "����";
		
		Scanner k = new Scanner(System.in);
		
		System.out.print("����: ");
		String position = k.next();
		
		// position ���� 700����, ���� 500����, ������ 300����
		
		switch (position) {
		case "����":
			System.out.println("700����");
			break;
		case "����":
			System.out.println("500����");
			break;
		default:
			System.out.println("300����");
			break;
		}
	}
}
