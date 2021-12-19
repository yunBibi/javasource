package lamda;

import java.io.File;
import java.util.stream.Stream;

public class StreamEx6 {
	public static void main(String[] args) {
		// �߰����� : �ڸ���(skip(), limit()), �ɷ�����(filter(), distinct()), �����ϱ�(sorted()), ��ȯ(map()), ��ȸ�ϱ�(peek())
		
		// File ��ü stream���� �����ϱ�
		Stream<File> stream = Stream.of(new File("file1.txt"), new File("file2.txt"), new File("file3.txt"),
				              new File("test.java"), new File("Ex1"), new File("ex2.bak"));
		
		// ������ Ȯ���� ����ϱ�
		// ��, �ߺ��� Ȯ���ڴ� ���� �� ����Ѵ�. 
		
		// ���ϸ� ������ -> Ȯ���ڰ� ���� �� ���� -> �ߺ����� -> ���
		stream.map(File::getName)
		      .filter(f -> f.lastIndexOf(".") > -1)
		      .map(f -> f.substring(f.lastIndexOf(".")+1))
		      .distinct()
		      .forEach(System.out::println);
	}
}
