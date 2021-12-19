package lamda;

import java.util.Arrays;
import java.util.List;

public class StreamEx7 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("���","����","�ٳ���","���","����","����");
		
		list.stream()
		    .skip(2)     // 2�� �ǳʶٰ� ���
		    .limit(3)    // ��Ʈ���� ��Ҵ� �ִ� 3������ ���
		    .forEach(System.out::println);
	}

}
