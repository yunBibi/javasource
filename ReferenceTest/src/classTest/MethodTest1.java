package classTest;

public class MethodTest1 {
	// 리턴값이 t/f 리턴하는 메소드 생성  => boolean
	boolean isRedirect(){   // void를 제외한 타입이 오면 return이 반드시 와줘야 한다.
		return false;
	}
	
	// 리턴값이 int 타입인 메소드
	int sum() {
		return 0;
	}
	
	// 리턴값이 int, 두 개의 전달인자(int)를 받기
	int multiply(int num1, int num2){           // 두 개 다 앞에 타입 넣어주기
		return num1*num2;
	}
	
	// 리턴값: long, 두 개의 전달인자를 받기
	long add(long num1, long num2){
		return num1+num2;
	}
	
	// 리턴값: char
	char method() {
		return 'c';
	}
	
	void method1() {     // void: 넘기는 값 없음
		
	}
	
	// 리턴타입 : int형 1차원 배열
	// 전달인자 : int형 1차원 배열
	int[] print(int arr[]) {
		return arr;
	}
	
	// 리턴타입 : double, 매개변수 : 두 개의 double
	// 해야 할 일 : 받은 두 개의 매개변수를 나누기한 결과 리턴
	
	double divide(double a, double b){
		return a/b;
	}
	
}