package object;

public class ObjectEx2 {

	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = new Object();
		
		//toString => 객체를 문자열로 표현
		System.out.println(obj1.toString());
		System.out.println(obj2.toString());
		
		// String 사용하는 toStringdms 오버라이딩 된 것을 알 수 있다. (객체가 가지고 있는 값을 출력하도록)
		String str1 = "홍길동";
		String str2 = "홍길동";
		System.out.println(str1.toString());
		System.out.println(str2.toString());
		
		Value value1 = new Value(10);
		Value value2 = new Value(10);
		// toString() => 10이라는 값을 출력하도록 오버라이딩 하기
		System.out.println(value1.toString());
		System.out.println(value2.toString());
	}

}
