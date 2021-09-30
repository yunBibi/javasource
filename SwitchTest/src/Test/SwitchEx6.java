package Test;

import java.util.Scanner;

public class SwitchEx6 {
	public static void main(String[] args) {
		// 가위(1), 바위(2), 보(3)

		// 상대방 - 컴퓨터
		// 랜덤으로 1~3 출력

		// 내가 내는 부분은 입력받기

		// 출력문은 나를 기준으로하기 당신이 졌습니다. 당신이 이겼습니다. 비겼습니다.
		
		Scanner k = new Scanner(System.in);
		System.out.print("가위(1), 바위(2), 보(3) 중 하나를 입력하세요 : ");
		int me = k.nextInt();

		int num = (int) (Math.random() * 3) +1;

		System.out.println("나 : " + me + ", 컴퓨터 : " + num);
		
		switch (num - me) {
		case 0:
			System.out.println("비겼습니다.");
			break;
			
		case -1:
		case 2:
			System.out.println("당신이 졌습니다.");
			break;
		
		case -2:
		case 1:
			System.out.println("당신이 이겼습니다.");
			break;
			
		default:
			break;
		}

	}
}
