import java.util.Scanner;

// ��κ� 2�� ����
//		a > 2
// 		1 + 2

// 1��(����) ����
//		!d

// 3�� ����
// 		���ǽ� ? O�� �� �� : X�� �� ��

public class OperatorMain_2 {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		
		System.out.print("�̸� : ");
		String name = k.next();
		
		System.out.print("���� : ");
		int age = k.nextInt();
		
		// ���̰� ¦���� ¦, Ȧ���� Ȧ
		String jakhole = (age % 2 == 0) ? "¦" : "Ȧ";
		System.out.println(jakhole);
		
		// ���̰� 20�� �̻��̸� �ȳ��ϼ���, �ƴϸ� ����
		String say = (age >= 20) ? "�ȳ��ϼ���" : "����";
		System.out.println(say);
		
		// if�� ����� ������ �ҽ��� ª������ ȿ����.
		
		// �̸��� ȫ�浿�̸� ��...��, �ƴϸ� �������
		// String say2 = (name == "ȫ�浿") ? "��...��" : "�������";
		// System.out.println(say2);
		// �� �ҽ��� �� �� �Ǵ°�?
		
		// �����ڶ�� �͵��� stack������ ����̴�. 
		// �޸� ���� �߿��� stack����, heap������ �ִ�. �׷��� 'String'�� ������, 
		// String ��� �� heap������ ����ǰ�, stack�������� '������'�� ����ȴ�. 
		// ���� == �����ڸ� ����� �� ���� ���̴�. 
		
		// ���ڰ� �Ȱ����� �ƴ��� �Ǵ��Ϸ���
		String say2 = (name.equals("ȫ�浿")) ? "��? ��!" : "�������.";
		System.out.println(say2);
	
		
} 
}