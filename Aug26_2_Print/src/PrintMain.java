// 1�� �ٰ� 5���ٿ� ���� �ʴ´�. 3�� �ٿ� ��� �Ѵ�. 
public class PrintMain {
	// ��� �ڵ�� �� ������
	public static void main(String[] args) {
		// ���� �� �͸� �����

		////////// �ڹ��� ��� 3�� ��Ʈ

		// .print : �ֿܼ� ��� <- �ѱ���� ����. �̸� Java�� �����ϸ�
		System.out.print("������ �������� ��� ����?");
		System.out.print("���� �� ����");

		// .println : �ֿܼ� ��� ��, �� �ٲޱ��� ����
		System.out.println("������ �������� ��� ����?");
		System.out.println("���� �� ����");

		// .printf : ������ �����ϸ鼭 �ܼ�â�� ���
		// ("����", ������) �Ҽ��� �� �ڸ��� ǥ���ϴ� ����
		System.out.printf("%.1f", 45.123);
		System.out.println(); // �� �ٲٱ� ���� �����
		
		
		////////// \ �� ������ Ư��
		
		// �п� �� �� �� Ÿ�� �Դ��� ���
		//  \�� Ư���� ���ó�� �ְ�, �� �ܿ� ����ϸ� ������.
		// Ư������ �� \n <- �� �ٲ�
		//		\n - new line
		//		\r - carriage return : �� �ٲٰ� Ŀ���� �� ������
		// tabŰ�� ����� �ܼ��� ���Ⱑ �ƴ϶� ������ tab Ű ����Ʈ�� ���� ���� ���̴�.
		//		\r\n - �ϼ��� �ٹٲ�
		//		\t - tab
		//		\b - backspace (1byte �����) java������ ���� �ϳ��� ǥ���ϴ� ���� 2byte�� �����
		// �������� \\ -> ���� �ϳ� \�� ���ش�.
		// �������� ����ǥ = ����ǥ �ϳ�
		
		System.out.println("���� ���� ��� ���Դϴ�.");
		System.out.println("\2000");
		System.out.println("����\n����");
		System.out.println("����\r����");
		System.out.println("��\t��");
		System.out.println("������\b");
		System.out.println("\\2000");
		System.out.println("\"");
		
	}
}
