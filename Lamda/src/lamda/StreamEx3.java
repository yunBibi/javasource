package lamda;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx3 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("�ٵ�","�ٳ���","����","����","����","������");
		
		// '��'�� �����ϴ� ���� ã�Ƽ� ���
		// filter : ���ǿ� �´� ��� ã��
		list.stream().filter(s -> s.startsWith("��")).forEach(System.out::println);
	}

}
