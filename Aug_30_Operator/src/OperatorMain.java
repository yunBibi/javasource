// << >> <<< (Shift 연산)
// 언제 사용하는가?
// 다중 선택문제에서 사용

public class OperatorMain {
	public static void main(String[] args) {
		int a = 3 << 2;
		System.out.println(a);
		
	// ex
	// 정렬
	//		왼쪽 : 1
	//		가운데 : 2
	//		오른쪽 : 3
	// 정렬 = 1   <- 하나만 선택
		
	
	//특성
	//		이탤릭 : 1 << 0
	// 		굵게 : 1 << 1
	// 		밑줄 : 1 << 2
	// 특성 = (1<<0) + (1<<1) = 이탤릭 + 굵게   <- 여러 개 다중 선택
	}
}
