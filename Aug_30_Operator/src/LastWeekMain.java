import java.util.Scanner;

public class LastWeekMain {
	public static void main(String[] args) {
		// ����1
		// Ű���� �Է¹��� �غ��ؼ� k�� ������
		Scanner k = new Scanner(System.in);

		System.out.println("---������ �ù�---");

		System.out.print("���� : ");
		double karo = k.nextDouble();

		System.out.print("���� : ");
		double sero = k.nextDouble();

		System.out.print("���� : ");
		double height = k.nextDouble();

		System.out.print("���� : ");
		double weight = k.nextDouble();

		System.out.println("---------------");

		// ������ �ڵ�
		double v = karo * sero * height;
		System.out.printf("���� : %.1f\n", v);
		System.out.printf("���� : %.1f\n", weight);

		// �� �ڵ�
		System.out.println("����(��*��*��) : " + karo * sero * height);
		System.out.println("���� : " + weight);

		// ����2
		// ���ǰ� 10�̻��̰�, ���԰� 1000�̻��̸� a�̿� ����
		boolean a = v >= 10 && weight >= 1000;
		System.out.println(a);

		// ���ǰ� 10�̸��̰ų�, ���԰� 1�� �̸��̸� b�̿� ����
		boolean b = v < 10 || weight < 1000;
		System.out.println(b);

		// ���԰� 20�̻��̰�, ���԰� 30�̻��̸�
		boolean c = weight >= 20 && weight >= 30;
		System.out.println(c);

		// &&�� ||�� �� ������ �ᵵ ����� �������� �� ���� ���� ���� ����.
		// &&, || : �� �׿��� ����� ������ ���� ����
		// &, | : �� �׿��� ����� ���͵� �� �ױ��� ����

		// ���� ������ ��������ַ��� �� ������ Ȱ���ϸ� ����.
		/*
		 * &&�� ����ϸ鼭 true�� Ȯ���� ���� ���� ������ ������ �� �� �˻��� ���� �� ���� �˻��ϸ� �ȴ�. ����������, ||�� ����� ��
		 * true�� Ȯ���� ���� ���� ������ ������ ������ ������ �� �ִ�.
		 */

		// ���� ���� ���� ��� �� �װ� �� ���� ������ �ٲ��ָ� ����.

		// ���ǰ� 10�̸��̵���, ���԰� 1000�̸��̵��� �ϳ���
		// XOR(eXclusive OR) - ��Ÿ�� or
		// ^ <- �̰� ^^ �� �� �����ڰ� ���� �� ����.
		// exclusive or�� �����Ϸ��� ������ �� ���� ��� �����ؾ� �ϱ� ����
		boolean d = (v < 10) ^ ( weight < 1000);
		System.out.println(d);

	}
}