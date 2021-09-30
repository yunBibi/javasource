package classTest;

public class Card {
	// ��� ����
	private String kind;   // ī�� ��� ����
	private int number;   // ī�� ���� ����
	
//	int width;
//	int height;
	
	// ī���� ���̿� ���̴� ������ �Ӽ��̴�.
	// static(����) : Ŭ������ ������ �����
	//    			  ��ü�� �������� �ʰ� �����
	//                Ŭ������ �޸𸮿� �ε�� �� ����
	
	// Ŭ���� ���� (static~ )
	static int width = 10;
	static int height = 7;
	
	public Card(String kind, int number) {
		super();
		this.kind = kind;
		this.number = number;
	}
	
	public String getKind() {
		return kind;
	}
	public int getNumber() {
		return number;
	}
	
	
	// static�޼ҵ� : ��ü�� �������� �ʰ� ���
	//              : Ŭ������ �޸𸮿� �ε�� �� ����
	//              : static �޼��� �ȿ��� �ν��Ͻ� ��� ��� �Ұ�
	// static�� ���Ǵ� �� : �������, �޼���, �ʱ�ȭ��
	
	public static int getWidth() {
		// kind = "";   - �Ұ���
		// getNumber(); - �Ұ���
		
		//getHeight();  - ����
		return width;
	}
	public static int getHeight() {
		return height;
	}
	
	
	
}
