package inheritance;

// extends 부모 클래스명
// 생성자와 초기화블럭은 상속되지 않음
// private 멤버변수는 접근이 제한됨
// 이 외에는 상속 가능

public class Child extends Parent {   
	
	public Child(int age) {
		super(age);
	}
	
	// Implicit super constructor Parent() is undefined for default constructor. Must define an explicit constructor
	// 모든 생성자에는 super가 숨겨져 있다. 
	//	public Child() {
	//		super(); // 부모클래스(Parent)의 기본 생성자 호출
	//	}

	void play() {
		System.out.println("놀자");
		
	}

}
 