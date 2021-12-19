package lamda;

import java.util.Arrays;
import java.util.List;

public class StreamEx7 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("사과","딸기","바나나","사과","딸기","수박");
		
		list.stream()
		    .skip(2)     // 2개 건너뛰고 출력
		    .limit(3)    // 스트림의 요소는 최대 3개까지 출력
		    .forEach(System.out::println);
	}

}
