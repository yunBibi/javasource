package inheritance;

/* ���
 * ������ Ŭ������ �����Ͽ� ���ο� Ŭ������ �ۼ�
 * 
 * ����
 * ���� ���� �ڵ�� ���ο� �ڵ带 �ۼ��� �� ����
 * ���������� �����ϱ� ������ �ڵ��� �߰� �� ������ ������
 * �ڵ��� �ߺ� ���� => ���α׷� ���꼺�� �������� ������
 * 
 * ���� Ŭ���� : �θ�, ����, super
 * �ڼ� Ŭ���� : �ڽ�, ����, sub
 */

public class Parent {
	private int age;

	public Parent(int age) {
		super();     // super(); <- �θ� Ŭ����(object)�� �⺻ ������ ȣ��
		this.age = age;
	}
	
	public int getAge() {
		return age;
	}
	
}
