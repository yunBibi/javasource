package object;

public class ObjectEx1 {

	public static void main(String[] args) {
		Object obj1 = new Object();
		Object obj2 = new Object();
		
		//equals (주소비교) => false
		System.out.println(obj1.equals(obj2));
		
		// 위의 경우처럼 Object에서 사용하는 equals는 주소비교였는데, String에서는 문자열비교가 되었기 때문에
		// String 사용하는 equals는 오버라이딩 된 것을 알 수 있다.
		String str1 = "홍길동";
		String str2 = "홍길동";
		System.out.println(str1.equals(str2));
		
		Value value1 = new Value(10);
		Value value2 = new Value(10);
		System.out.println(value1.equals(value2));
	}

}
