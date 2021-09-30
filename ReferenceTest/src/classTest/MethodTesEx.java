package classTest;

public class MethodTesEx {

	public static void main(String[] args) {
		MethodTest1 obj = new MethodTest1();    // 객체 사용할 준비하기
		
		// 메소드 호출 시 리턴되는 값이 있는 경우
		// 처리 법1 - print()
		System.out.println(obj.isRedirect());
		// 처리 법2 - 변수 만들어서 리턴되는 값 받기
		boolean result = obj.isRedirect();
		// result를 이용해서 코드 작성 가능
		
		obj.sum();
		System.out.println(obj.sum());
		
		int var1 = obj.sum();
		
		System.out.println(obj.add(25, 35));
		
		
	}

}
