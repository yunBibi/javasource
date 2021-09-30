package classTest;

public class MethodTestEx2 {
	public static void main(String[] args) {
		
		// 1. 인스턴스 생성하기
		MethodTest2 obj = new MethodTest2();
		
		// 2. 사용하고 싶은 메소드 부르기
		obj.print99dan();

		// 덧셈 기능 불러오기
		// 메소드를 호출하는 쪽에서 입력값을 넣어주기
		obj.sum(3, 5);
		
		byte b1 = 3;
		byte b2 = 5;
		
		obj.sum(b1, b2);
		// byte로 선언된 것을 int에 담기 <- 자동형변환한 것
		// 자동형변환: 작은 타입을 큰 타입에 대입
		// 강제형변환: 큰 타입을 작은 타입에 대입  ()괄호를 사용
	}

}
