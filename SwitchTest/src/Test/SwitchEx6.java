package Test;

import java.util.Scanner;

public class SwitchEx6 {
	public static void main(String[] args) {
		// ����(1), ����(2), ��(3)

		// ���� - ��ǻ��
		// �������� 1~3 ���

		// ���� ���� �κ��� �Է¹ޱ�

		// ��¹��� ���� ���������ϱ� ����� �����ϴ�. ����� �̰���ϴ�. �����ϴ�.
		
		Scanner k = new Scanner(System.in);
		System.out.print("����(1), ����(2), ��(3) �� �ϳ��� �Է��ϼ��� : ");
		int me = k.nextInt();

		int num = (int) (Math.random() * 3) +1;

		System.out.println("�� : " + me + ", ��ǻ�� : " + num);
		
		switch (num - me) {
		case 0:
			System.out.println("�����ϴ�.");
			break;
			
		case -1:
		case 2:
			System.out.println("����� �����ϴ�.");
			break;
		
		case -2:
		case 1:
			System.out.println("����� �̰���ϴ�.");
			break;
			
		default:
			break;
		}

	}
}
