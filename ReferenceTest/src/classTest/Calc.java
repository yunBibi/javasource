package classTest;

// 같은 클래스 내에 다른 메소드 호출
public class Calc {
	// 덧셈
	int plus(int x, int y) {
		return x+y;
	}
	
	// 평균
	double avg(int x, int y) {
		
		// return plus(x,y)/2;
		int sum = plus(x,y);
		return sum/2;
	}
	
	void execute() {
		// 평균 메소드 호출
		double result = avg(7,10);
		// 프린트 메소드 호출
		println("실행결과" + result);
	}
	
	void println(String msg) {
		System.out.println(msg);
	}
	
}
