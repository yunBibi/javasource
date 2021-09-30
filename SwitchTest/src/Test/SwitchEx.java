package Test;

import java.util.Random;

public class SwitchEx {
	public static void main(String[] args) {
		// 8 : 출근을 합니다. 
		// 9 : 회의를 합니다. 
		// 10 : 업무를 봅니다. 
		// 나머지 : 외근을 나갑니다. 
		
		// 8~11사이의 숫자가 나오도록 작성
		// int num = (int) (Math.random()*6);  <- 0에서 5가 출력됨. 
		
		int time = (int) (Math.random()*4) + 8;   // 6을 곱해주니 0~5가 나오니까, 4를 곱해준다.
		
		switch (time) {
		case 8:
			System.out.println("출근을 합니다.");
			break;
		case 9:
			System.out.println("회의를 합니다.");
			break;
		case 10:
			System.out.println("업무를 봅니다. ");
			break;
		default:
			System.out.println("외근을 나갑니다.");
			break;
		} 
		
	}
}
