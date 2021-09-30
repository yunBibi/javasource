package Test;

import java.util.Scanner;

public class SwitchEx5 {
	public static void main(String[] args) {
		// 사용자한테 숫자 2개 입력받기
		// 연산자 입력받기 ( + - * / % )

		// switch(연산자)
		// 연산 후 계산 결과 출력
		

		Scanner k = new Scanner(System.in);

		System.out.print("숫자를 입력하세요: ");
		int a = k.nextInt();

		System.out.print("숫자를 입력하세요: ");
		int b = k.nextInt();

		System.out.print("연산자를 입력하세요: ");
		String c = k.next();

		int result = 0;
		
		switch (c) {
		case "+":
			result = a + b;
			// System.out.print(a + c + b + "=" + (a+b));
			break;
		case "-":
			result = a - b;
			// System.out.print(a + c + b + "=" + (a-b));
			break;
		case "*":
			result = a * b;
			// System.out.print(a + c + b + "=" + (a*b));
			break;
		case "/":
			result = a / b;
			// System.out.print(a + c + b + "=" + (a/b));
			break;
		case "%":
			result = a % b;
			// System.out.print(a + c + b + "=" + (a%b));
			break;
		// default:
			// System.out.print("연산자를 확인해주세요.");
			// break;
		}
		System.out.printf("%d %s %d = %d", a, c, b, result);
	}
}
