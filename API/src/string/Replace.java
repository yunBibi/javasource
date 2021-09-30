package string;

// String클래스 <= Immutable(변하지 않는다)

public class Replace {

	public static void main(String[] args) {
		String str1 = "자바는 객체지향 언어입니다. 자바는 풍부한 API를 제공합니다.";

		// 자바 => Java
		System.out.println(str1.replace("자바", "Java"));

		System.out.println(str1);    // String클래스는 Immutable이기 때문에 바뀌지 않는다.
		str1 = str1.replace("자바", "Java");  // str1을 바꿔줄 수 있게 새로운 값을 한 번 다시 담아줘야 한다.

		System.out.println(str1);
		
		str1 = str1.replaceFirst("자바", "Java");
		System.out.println(str1);
	}

}
