package exam;

/* 변수의 유효범위(스코프)
 * (1) 선언된 블록 안에서만 사용이 가능하다. 
 * 하단의 num1은 VariableTest1 내에서 사용 가능
 * 		  num2는 main 안에서 사용 가능 (main의 밖에서는 사용이 불가능하다.)
 * (2) 로컬(지역)변수는 반드시 초기화 해야 함. 로컬 변수는 메소드 안에서 선언된 변수
 * 
 */

public class VariableTest1 {

	// 변수
	private int num1;

	// 메소드
	public static void main(String[] args) {
		int num2 = 0;     // 로컬변수. 초기화하기
		
		if (num2 < 10) {
			System.out.println(num2);
		}
		
		for(int i=0; i<10; i++) {
			System.out.println(i+"     ");
		}
		
		// System.out.println(i);    <- for 영역을 벗어나서는 i를 다시 사용할 수 없다. 
		
	}

	public void print() {
		System.out.println();
	}

}
