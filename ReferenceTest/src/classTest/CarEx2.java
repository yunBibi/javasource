package classTest;

public class CarEx2 {
	public static void main(String[] args) {
		
		// 첫번째 차
		// 객체 생성 시 생성자가 자동 호출된다.
		Car2 car = new Car2();
		// 기본 속성값은 null, 0, false, 0.0
		
		
		// 두번째 차
		// 객체 생성 시 생성자가 자동 호출된다.
		Car2 car2 = new Car2("kona");
		
		// 세번째 차
		Car2 car3 = new Car2("kona","black");
		
		// 네 번째 차
		Car2 car4 = new Car2("현대", "kona", "black", 250);
				
	}

}
