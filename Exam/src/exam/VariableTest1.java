package exam;

/* ������ ��ȿ����(������)
 * (1) ����� ��� �ȿ����� ����� �����ϴ�. 
 * �ϴ��� num1�� VariableTest1 ������ ��� ����
 * 		  num2�� main �ȿ��� ��� ���� (main�� �ۿ����� ����� �Ұ����ϴ�.)
 * (2) ����(����)������ �ݵ�� �ʱ�ȭ �ؾ� ��. ���� ������ �޼ҵ� �ȿ��� ����� ����
 * 
 */

public class VariableTest1 {

	// ����
	private int num1;

	// �޼ҵ�
	public static void main(String[] args) {
		int num2 = 0;     // ���ú���. �ʱ�ȭ�ϱ�
		
		if (num2 < 10) {
			System.out.println(num2);
		}
		
		for(int i=0; i<10; i++) {
			System.out.println(i+"     ");
		}
		
		// System.out.println(i);    <- for ������ ������� i�� �ٽ� ����� �� ����. 
		
	}

	public void print() {
		System.out.println();
	}

}
