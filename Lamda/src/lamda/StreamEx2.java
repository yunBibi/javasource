package lamda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class StreamEx2 {
	public static void main(String[] args) {
		List<String> list = Arrays.asList("abc","def","apple","melon","text");
		
		// �빮�ڷ� ������ �� ����Ʈ�� ��� ����Ʈ ���
		List<String> upperList = new ArrayList<String>();
		for(String str:list) {
			upperList.add(str.toUpperCase());
		}
		for(String str:upperList) {
			System.out.println(str);
		}
		
		// ��Ʈ������ ����
		Stream<String> upper = list.stream().map(String::toUpperCase);
		upper.forEach(System.out::println);
		
	}
}
