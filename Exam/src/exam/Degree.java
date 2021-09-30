package exam;

import java.util.Scanner;

public class Degree {
	public static void main(String[] args) {
		// 화씨온도 => 섭씨온도
		
		// 조건
		// 화씨온도 입력받기(정수)
		
		Scanner k = new Scanner(System.in);
		
		System.out.print("현재 온도(화씨): ");
		double f = k.nextInt();
		
		// 받은 화씨온도 => 섭씨 온도로 변환 후 출력하기
		// (화씨온도-32)*5/9
		
		double c = (f-32)*5/9;
		
		System.out.printf("현재 온도(섭씨): %.3f", c );
	}
}
