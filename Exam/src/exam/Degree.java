package exam;

import java.util.Scanner;

public class Degree {
	public static void main(String[] args) {
		// ȭ���µ� => �����µ�
		
		// ����
		// ȭ���µ� �Է¹ޱ�(����)
		
		Scanner k = new Scanner(System.in);
		
		System.out.print("���� �µ�(ȭ��): ");
		double f = k.nextInt();
		
		// ���� ȭ���µ� => ���� �µ��� ��ȯ �� ����ϱ�
		// (ȭ���µ�-32)*5/9
		
		double c = (f-32)*5/9;
		
		System.out.printf("���� �µ�(����): %.3f", c );
	}
}
