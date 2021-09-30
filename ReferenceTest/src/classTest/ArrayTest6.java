package classTest;

public class ArrayTest6 {
	public static void main(String[] args) {
		// 이차원 배열
		int scores[][] = new int[2][3];
		
		// 초기화
		scores[0][0] = 15;
		scores[0][1] = 25;
		scores[0][2] = 35;
		
		scores[1][0] = 45;
		scores[1][1] = 55;
		scores[1][2] = 65;
		
		// 확인
		System.out.println("배열 길이(행) :"+scores.length);
		System.out.println("배열 길이(열) :"+scores[0].length);
		
		for(int i=0;i<scores.length;i++) {
			for(int j=0; j<scores[i].length; j++) {
				System.out.print(scores[i][j]+ " ");
			}
			System.out.println();
		}
				
		for(int a[]:scores) {
			for(int b:a) {
				System.out.print(b+"  ");
			}
			System.out.println();
		}
		
		int arr[][] = {
				{15,25},
				{65,85,95}
		};
		
		// 배열명 출력
		System.out.println(scores);  // [[I@2a139a55     <- 배열은 참조타입이기 때문에
		System.out.println(arr);     // [[I@15db9742        내용이 아닌 주소가 찍히는 것
	}
}
