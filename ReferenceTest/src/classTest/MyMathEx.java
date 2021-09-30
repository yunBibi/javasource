package classTest;

public class MyMathEx {
	public static void main(String[] args) {
		// static 메소드(클래스 메소드) 호출 => 객체 생성 없이 
		System.out.println(MyMath.add(200L, 100L));		
		System.out.println(MyMath.subtract(200L, 100L));		
		System.out.println(MyMath.multiply(200L, 100L));		
		System.out.println(MyMath.divide(200, 100));
		
		// 멤버메소드 호출
		
		MyMath mm = new MyMath();
		
		mm.a = 200L;
		mm.b = 100L;
		
		System.out.println(mm.add());
		System.out.println(mm.subtract());
		System.out.println(mm.multiply());
		System.out.println(mm.divide());
		
	}
}
