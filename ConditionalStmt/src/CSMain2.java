import java.util.Scanner;

// 중간고사 :
// 기말고사 :
// ---------
// 평균 : (소수점 한 자리만)

public class CSMain2{
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		 
		int mid = k.nextInt();
		System.out.println("중간고사 : ");
		
		int fin = k.nextInt();
		System.out.println("기말고사 : ");
		
		System.out.println("----------");
		
		double ave = (mid + fin) / 2.0;
		System.out.printf("평균 : %.1f점", ave);
		
		// 평균이 90점 이상이면 수라고 출력, 아니면 야!라고 출력
		
		// 점수 >= 90 : 수
		// 80 <= 점수 < 90 :우
		// 70 <= 점수 < 80 : 미
		// 60 <= 점수 < 70 : 양
		// 점수 < 60 :가
		
		// if(A) {
		//		A 만족시켰으면 실행
		// }else if(B){
		//		A는 떙, B를 만족시켰으면
		// } else if (C){
		///		A, B 땡, C를 만족시켰으면
		// } ...
		// } else {
		//		위에 하나도 맞는거 없으면
		// }
		
		if (ave >= 90) {
			System.out.println("수");
		} else if (ave >=80) {
			System.out.println("우");
		} else if (ave >= 70) {
			System.out.println("미");
		} else if (ave >= 60) {
			System.out.println("양");
		} else {
			System.out.println("가");
		}
	}
}