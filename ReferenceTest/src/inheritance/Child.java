package inheritance;

// extends �θ� Ŭ������
// �����ڿ� �ʱ�ȭ���� ��ӵ��� ����
// private ��������� ������ ���ѵ�
// �� �ܿ��� ��� ����

public class Child extends Parent {   
	
	public Child(int age) {
		super(age);
	}
	
	// Implicit super constructor Parent() is undefined for default constructor. Must define an explicit constructor
	// ��� �����ڿ��� super�� ������ �ִ�. 
	//	public Child() {
	//		super(); // �θ�Ŭ����(Parent)�� �⺻ ������ ȣ��
	//	}

	void play() {
		System.out.println("����");
		
	}

}
 