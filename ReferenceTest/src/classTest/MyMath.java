package classTest;

public class MyMath {
	// ������� long Ÿ�� 2��
	
	long a;
	long b;
	
	// �޼ҵ� : add, subtract, multiply  �Է°��� ����, ��°��� �ִ�. 
	
	long add() {
		return a + b;
	}
	
	long subtract() {
		if (a > b) {
			return a - b;
		} return b - a;
	}
	long multiply() {
		return a * b;
	}
	double divide() {
		return a / b;
	}
	
	
	
	static long add(long a, long b) {
		return a + b;
	}
	
	static long subtract(long a, long b) {
		if (a > b) {
			return a - b;
		} return b - a;
	}
	static long multiply(long a, long b) {
		return a * b;
	}
	static double divide(double a, double b) {
		return a / b;
	}
}
