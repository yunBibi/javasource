package classTest;

public class ArrayTest3 {

	public static void main(String[] args) {
		// int 타입의 배열 5개 생성
		// 0 10 20 30 40 
		
		int score[] = {0,10,20,30,40};
		
		for(int i=0; i<score.length; i++) {
			System.out.print(score[i] + "\t");
		}
		
		
		System.out.println();
		
		// String 타입의 배열 5개 생성
		// 과일 이름으로 초기화
		
		String fruit[] = {"사과", "딸기", "포도", "배", "감"};
		
//		for(int i=0; i<fruit.length; i++) {
//			System.out.print(fruit[i]+"\t");
//		}
		
		// 향상된 for문   <- 배열 사용시 사용 가능
		// for(배열의 타입 맘대로변수:배열이름)
		// 다른 처리 없이 하나씩 꺼내서 사용하는 방식일 때 적합
		
		for(String f:fruit) {
			System.out.print(f+"\t");
		}
		
		System.out.println();
		
		for(int idx:score) {
			System.out.print(idx+"\t");
		}
	}

}
