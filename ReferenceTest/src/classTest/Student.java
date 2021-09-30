package classTest;

public class Student {
	// 속성 => 필드(멤버 변수, 프로퍼티)
	// 학번 학년 반 성명 전화번호 주소 성적 부모님... 
	// 선언 위치 중요. main이 아닌 class 열고 바로 선언
	
	String id;   // s19845..s19860 학번
	int grade;	 // 학년
	String name; // 이름
	String tel;  // 전화번호
	String addr; // 주소
	
	// 위와 같이클래스 안에 바로 선언한 변수들을 '필드'라고 부른다.
	
	
	// 동작 => 메소드
	// 먹는다 학교에 간다 집에 간다
	void go() {}    // 메소드
	
}
