package Test;

import java.util.Random;

public class SwitchEx {
	public static void main(String[] args) {
		// 8 : ����� �մϴ�. 
		// 9 : ȸ�Ǹ� �մϴ�. 
		// 10 : ������ ���ϴ�. 
		// ������ : �ܱ��� �����ϴ�. 
		
		// 8~11������ ���ڰ� �������� �ۼ�
		// int num = (int) (Math.random()*6);  <- 0���� 5�� ��µ�. 
		
		int time = (int) (Math.random()*4) + 8;   // 6�� �����ִ� 0~5�� �����ϱ�, 4�� �����ش�.
		
		switch (time) {
		case 8:
			System.out.println("����� �մϴ�.");
			break;
		case 9:
			System.out.println("ȸ�Ǹ� �մϴ�.");
			break;
		case 10:
			System.out.println("������ ���ϴ�. ");
			break;
		default:
			System.out.println("�ܱ��� �����ϴ�.");
			break;
		} 
		
	}
}
