package Math;

// java.lang 패키지는 기본적으로 import가 되어 있음

// 하나의 클래스에 모든 메소드가 static 메로드로 구성되어 있다면
// import static을 만들어서 사용 가능

import static java.lang.Math.*;    // <- 모든 메소드가 static이기 때문에 가능

public class MathEx3 {
	public static void main(String[] args) {
		double val = 90.7552;
		
		// MathEx1과 달리 앞에 Math.을 붙이지 않아도 사용 가능하다.
		System.out.println("round() "+round(val));
		System.out.println("ceil() "+ceil(1.1));
		System.out.println("floor() "+floor(1.5));
		System.out.println("max() "+max(1.5, 1.2));
		System.out.println("min() "+min(1.5, 1.2));
	}

}
