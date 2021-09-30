package classTest;

public final class FinalTest {
	final int MAX_SIZE = 10; // 원래 변수는 소문자로 만드는 것이 규칙 그러나 변하지 않는 상수의 경우 대문자를 사용한다.
	
	final void getMaxSize() {
		final int LV = MAX_SIZE;   // 지역변수에 파이널 붙는 경우
		
	}
}
