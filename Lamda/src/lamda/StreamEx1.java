package lamda;

import java.io.File;
import java.util.stream.Stream;

public class StreamEx1 {
	public static void main(String[] args) {
		// �߰����� : �ڸ���(skip(), limit()), �ɷ�����(filter(), distinct()), �����ϱ�(sorted()), ��ȯ(map()), ��ȸ�ϱ�(peek())
		
		// File ��ü stream���� �����ϱ�
		Stream<File> stream = Stream.of(new File("file1.txt"), new File("file2.txt"), new File("file3.txt"),
				              new File("file4.txt"));
		
//		File f = new File("file1.txt");
//		f.getName();
	
		// map : ��Ʈ���� ��ҿ� ����� �� �߿��� ���ϴ� �ʵ常 �����ϰų� Ư�� ���·� ��ȯ�� ���
		Stream<String> fileNames = stream.map(File::getName);
		fileNames.forEach(f -> System.out.println(f));
	}
}
