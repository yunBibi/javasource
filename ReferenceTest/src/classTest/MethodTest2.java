package classTest;

public class MethodTest2 {
	
	// �������� �� ���� ���ڸ� �޾Ƽ� ���� ����� �����ֱ�\
	// �������� �� ���� ����: �Է°�
	int sum(int num1, int num2) {
		int result = num1 + num2;
		
		return result;   // ��°�(��ȯ��)
		// return num1 + num2;
	} 
	
	
	// ������ 2��~9�� ����ϱ�  (����� ������ ���� �ƴ�)
	// �Է°�: ����, ��ȯ��: ����
	void print99dan() {
		for(int i=2; i<10; i++) {
			for(int j=1; j<10; j++) {
				System.out.printf("%d * %d = %d\n", i, j, i*j);
			}
		}
	}
	
	// �� ���� ������ �޾Ƽ�(�Է°�) ���ϱ��� ����� return�ϱ�
	int multiply(int x,int y){
		return x*y;
	}
	
	
}
