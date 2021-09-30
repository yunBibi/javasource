package classTest;

public class MyMath {
	// 멤버변수 long 타입 2개
	
	long a;
	long b;
	
	// 메소드 : add, subtract, multiply  입력값은 없고, 출력값만 있다. 
	
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
