package classTest;

public class Car {
	// 속성 : 제조회사, 모델명, 색상, 최대속도...
	String company;
	String model;
	String color;
	int maxSpeed;
	
	// 동작 : 전진하다, 후진하다
	void forward() {
		System.out.println("전진하다");
	}
	void backword() {
		System.out.println("후진하다");
	}
}
