package classTest;

public class MethodTest1 {
	// ���ϰ��� t/f �����ϴ� �޼ҵ� ����  => boolean
	boolean isRedirect(){   // void�� ������ Ÿ���� ���� return�� �ݵ�� ����� �Ѵ�.
		return false;
	}
	
	// ���ϰ��� int Ÿ���� �޼ҵ�
	int sum() {
		return 0;
	}
	
	// ���ϰ��� int, �� ���� ��������(int)�� �ޱ�
	int multiply(int num1, int num2){           // �� �� �� �տ� Ÿ�� �־��ֱ�
		return num1*num2;
	}
	
	// ���ϰ�: long, �� ���� �������ڸ� �ޱ�
	long add(long num1, long num2){
		return num1+num2;
	}
	
	// ���ϰ�: char
	char method() {
		return 'c';
	}
	
	void method1() {     // void: �ѱ�� �� ����
		
	}
	
	// ����Ÿ�� : int�� 1���� �迭
	// �������� : int�� 1���� �迭
	int[] print(int arr[]) {
		return arr;
	}
	
	// ����Ÿ�� : double, �Ű����� : �� ���� double
	// �ؾ� �� �� : ���� �� ���� �Ű������� �������� ��� ����
	
	double divide(double a, double b){
		return a/b;
	}
	
}