package Test;

import java.util.Scanner;

public class SwitchEx5 {
	public static void main(String[] args) {
		// ��������� ���� 2�� �Է¹ޱ�
		// ������ �Է¹ޱ� ( + - * / % )

		// switch(������)
		// ���� �� ��� ��� ���
		

		Scanner k = new Scanner(System.in);

		System.out.print("���ڸ� �Է��ϼ���: ");
		int a = k.nextInt();

		System.out.print("���ڸ� �Է��ϼ���: ");
		int b = k.nextInt();

		System.out.print("�����ڸ� �Է��ϼ���: ");
		String c = k.next();

		int result = 0;
		
		switch (c) {
		case "+":
			result = a + b;
			// System.out.print(a + c + b + "=" + (a+b));
			break;
		case "-":
			result = a - b;
			// System.out.print(a + c + b + "=" + (a-b));
			break;
		case "*":
			result = a * b;
			// System.out.print(a + c + b + "=" + (a*b));
			break;
		case "/":
			result = a / b;
			// System.out.print(a + c + b + "=" + (a/b));
			break;
		case "%":
			result = a % b;
			// System.out.print(a + c + b + "=" + (a%b));
			break;
		// default:
			// System.out.print("�����ڸ� Ȯ�����ּ���.");
			// break;
		}
		System.out.printf("%d %s %d = %d", a, c, b, result);
	}
}
