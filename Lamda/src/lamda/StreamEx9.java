package lamda;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class StreamEx9 {
	public static void main(String[] args) {
		// 최종연산 : forEach, collect, coutn, sum, average, max, min, findFirst ...
		IntStream stream = Arrays.stream(new int[] {1,2,3,4,5});
		
		// 짝수의 개수 출력
//		long count = stream.filter(i -> i%2 == 0).count();
//		System.out.println("짝수 개수 : "+count);
		
		// 2의 배수 합
//		long sum = stream.filter(i -> i%2 == 0).sum();
//		System.out.println("짝수 합 : "+sum);
		
		// 2의 배수 평균
//		OptionalDouble average = stream.filter(i -> i%2 == 0).average();
//		System.out.println("짝수 평균 : "+average);

//		OptionalInt max = stream.filter(i -> i%2 == 0).max();
//		System.out.println("짝수 최대값 : "+max);
		
		OptionalInt first = stream.filter(i -> i%2 == 0).findFirst();
		System.out.println("짝수의 첫번째 값 : "+first);


	}
}
