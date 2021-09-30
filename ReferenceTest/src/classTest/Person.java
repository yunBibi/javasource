package classTest;

// final : 수정 불가 / 초기화 꼭 해줘야 함
//       : 사용되는 곳: 클래스, 메서드, 멤버변수, 지역변수
// 클래스 + final -> 상속 불가
// 메소드 + final -> 오버라이딩 불가
// 멤버변수, 지역변수 +final -> 수정 불가


public class Person {
	final String nation = "Korea";
//	final String ssn;      <- The blank final field ssn may not have been initialized (초기화하지 않아서 에러)
	final String ssn;         // final 은 꼭 초기화해줘야 한다.
	String name;
	
	public Person(String ssn, String name) {
		super();
		this.ssn = ssn;
		this.name = name;
	}
}
