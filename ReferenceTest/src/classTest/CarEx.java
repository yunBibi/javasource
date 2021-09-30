package classTest;

public class CarEx {
	public static void main(String[] args) {
		
		Car car = new Car();   // 얘는 생성자 없이 어떻게 사용됐을까?
		
		car.company = "현대";
		car.model = "KONA";
		car.color = "red";
		car.maxSpeed = 200;
		
	// Car(){} => 기본생성자(default)
	// 클래스 내에 선언된 생성자가 하나도 없으면
	// 컴파일러가 자동으로 기본 생성자를 만들어준다. 
		
		car.forward();  // 메소드 호출
		
	}

}
