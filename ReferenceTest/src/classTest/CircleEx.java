package classTest;
public class CircleEx {

	public static void main(String[] args) {
		
		Circle circle1 = new Circle();
		circle1.r = 5;
		System.out.println("���� ���� : " + circle1.roundArea());
	
		Circle circle2 = new Circle();
		circle2.r = 3;
		System.out.println("���� ���� : " + circle2.roundArea());
	}

}
