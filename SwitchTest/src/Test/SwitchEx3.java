package Test;

import java.util.Scanner;

public class SwitchEx3 {
	public static void main(String[] args) {
		// String position = "과장";
		
		Scanner k = new Scanner(System.in);
		
		System.out.print("직급: ");
		String position = k.next();
		
		// position 부장 700만원, 과장 500만원, 나머지 300만원
		
		switch (position) {
		case "부장":
			System.out.println("700만원");
			break;
		case "과장":
			System.out.println("500만원");
			break;
		default:
			System.out.println("300만원");
			break;
		}
	}
}
