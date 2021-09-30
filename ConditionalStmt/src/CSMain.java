import java.util.Scanner;

// 마트 

// 가격 : 
// --------
// xxxx원어치 구매함
// 적립 포인트 : 

// 1%
// 10,000원 이상 구매 시 보너스로 포인트를 50점 더 준다. 

// 흐름제어
//		조건문
//		반복문

// 조건문 : 특정 조건때에만 흐름이 넘어오도록
//			if
//			switch

public class CSMain {
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);

		System.out.print("가격 : ");
		int price = k.nextInt();
		System.out.println("----------");
		System.out.printf("%d원어치 구매\n", price);

		int point = price / 100;

		if (price >= 10000) {
			point += 50;
		}
		
		// 20000원 < 가격 < 50000이면 100점 추가, 아니면 10점 추가
		// 포인트 100점 더 주기
		
		if ((price > 20000) && (price < 5000)) {
			point += 100;
		}else {
			point += 10;
		}
		
		System.out.printf("적립 포인트 : %d\n", point);
	}
}
