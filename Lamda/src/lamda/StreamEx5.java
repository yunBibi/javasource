package lamda;

import java.util.Arrays;
import java.util.List;

public class StreamEx5 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("���","����","�ٳ���","���","����","����");
		
		// distinc : �ߺ�����
		list.stream().distinct().forEach(System.out::println);
	}

}
