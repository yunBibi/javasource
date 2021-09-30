
public class ForTest5 {
	public static void main(String[] args) {
		// **********
		// **********
		// **********
		// **********
		// **********
		// 행과 열을 가진 2차원 행렬을 for로 돌리기
		
		
		// 이중 for 실행 순서
		// (1) int i=0;
		// (2) i <3;
		// (3) 안쪽 for문의 int j=0;
		// (4) j<3;
		// (5) System.out.print("*");   => *
		// (6) j++ => j=1
		// (7) j<3;
		// (8) System.out.print("*");   => **
		// (9) j++  => j=2
		// (10) j<3;
		// (11) System.out.print("*");  => ***
		// (12) j++  => j=3
		// (13) j<3;  => 안쪽 for문 종료
		// (14) System.out.println();
		
		// (1) i++l i=2
		// (2) i<3;
		// (3) 안쪽 for문의 int j=0; ~~~ (14) 실행
		// ***
		// ***
		
		// (1) i++, i=3
		// (2) i<3;  => 바깥 for문 종료
		
		
		for(int i=0; i<3; i++) {
			for(int j=0; j<3; j++) {
			System.out.print("*");
			}
			System.out.println();  
		}
		
		
		for(int i=0; i<6; i++) {
			for (int j=0; j<11; j++) {
				System.out.print("*");
			}
			System.out.println();
		}
	}
}