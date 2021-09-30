package classTest;

public class Test2 {
	public static void main(String[] args) {
		int oldArr[] = {10,20,30};
		
		int newArr[] = new int[4];
		
		// 기존 값 새로운 곳으로 복사   <- 직접 하는 방식
//		for(int i=0; i<oldArr.length; i++) {
//			newArr[i]=oldArr[i];
//		}
		
		// 자바 문법으로 복사하는 방식 (1차원 배열에서만 사용)
		System.arraycopy(oldArr, 0, newArr, 0, oldArr.length); 
		
		newArr[3] = 40;
		
		for(int i:newArr) {
			System.out.print(i+"  ");
		}
		
	}
}
