package Arrays;

import java.util.Arrays;

// 검색
public class ArraysEx3 {
	public static void main(String[] args) {
		int arr3[]= {37,21,56,99,88,58,62,15,39,78};
		
		// 58이라는 숫자가 몇 번째에 있는지 조회
		// 순차 검색 (vs 이진 검색)
		for (int i = 0; i < arr3.length; i++) {
			if (arr3[i] == 58) {
				System.out.println(i+1+"번째");
				break;
			} 
		}
		
		System.out.println();
		
		// binarySearch : 이진검색  <- 속도가 가장 빠르다
		//                정렬을 먼저 한 후 검색해야 함
		
		// int pos = Arrays.binarySearch(arr3, 58);
		// System.out.println(pos+1+"번째 찾았음");   // -3번째 찾았음   (<- 결과)
		
		Arrays.sort(arr3);
		int pos = Arrays.binarySearch(arr3, 58);
		System.out.println(pos+1+"번째 찾았음");
		
	}

}
