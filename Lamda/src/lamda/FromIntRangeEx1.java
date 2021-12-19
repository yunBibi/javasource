package lamda;

import java.util.stream.IntStream;

public class FromIntRangeEx1 {
	
	static int sum = 0;
	
	public static void main(String[] args) {
		// 1~100 ÇÕ°è
		IntStream.rangeClosed(1, 100).forEach(i -> sum+=i);
		System.out.println(sum);
	}

}
