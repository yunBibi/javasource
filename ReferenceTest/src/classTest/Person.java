package classTest;

// final : ���� �Ұ� / �ʱ�ȭ �� ����� ��
//       : ���Ǵ� ��: Ŭ����, �޼���, �������, ��������
// Ŭ���� + final -> ��� �Ұ�
// �޼ҵ� + final -> �������̵� �Ұ�
// �������, �������� +final -> ���� �Ұ�


public class Person {
	final String nation = "Korea";
//	final String ssn;      <- The blank final field ssn may not have been initialized (�ʱ�ȭ���� �ʾƼ� ����)
	final String ssn;         // final �� �� �ʱ�ȭ����� �Ѵ�.
	String name;
	
	public Person(String ssn, String name) {
		super();
		this.ssn = ssn;
		this.name = name;
	}
}
