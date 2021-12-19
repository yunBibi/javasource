package lamda;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public class FromDirectoryEx1 {
	public static void main(String[] args) {
		// 디렉토리 지정
		Path path = Paths.get("c:\\upload\\2021\\12\\16");
		
		try {
			Files.list(path).forEach(f -> System.out.println(f.getFileName()));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
