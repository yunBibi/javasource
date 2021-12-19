package lamda;

import java.util.Arrays;
import java.util.OptionalDouble;
import java.util.OptionalInt;
import java.util.stream.IntStream;

public class StreamEx9 {
	public static void main(String[] args) {
		// �������� : forEach, collect, coutn, sum, average, max, min, findFirst ...
		IntStream stream = Arrays.stream(new int[] {1,2,3,4,5});
		
		// ¦���� ���� ���
//		long count = stream.filter(i -> i%2 == 0).count();
//		System.out.println("¦�� ���� : "+count);
		
		// 2�� ��� ��
//		long sum = stream.filter(i -> i%2 == 0).sum();
//		System.out.println("¦�� �� : "+sum);
		
		// 2�� ��� ���
//		OptionalDouble average = stream.filter(i -> i%2 == 0).average();
//		System.out.println("¦�� ��� : "+average);

//		OptionalInt max = stream.filter(i -> i%2 == 0).max();
//		System.out.println("¦�� �ִ밪 : "+max);
		
		OptionalInt first = stream.filter(i -> i%2 == 0).findFirst();
		System.out.println("¦���� ù��° �� : "+first);


	}
}
