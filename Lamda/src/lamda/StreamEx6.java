package lamda;

import java.io.File;
import java.util.stream.Stream;

public class StreamEx6 {
	public static void main(String[] args) {
		// 중간연산 : 자르기(skip(), limit()), 걸러내기(filter(), distinct()), 정렬하기(sorted()), 변환(map()), 조회하기(peek())
		
		// File 객체 stream으로 생성하기
		Stream<File> stream = Stream.of(new File("file1.txt"), new File("file2.txt"), new File("file3.txt"),
				              new File("test.java"), new File("Ex1"), new File("ex2.bak"));
		
		// 파일의 확장자 출력하기
		// 단, 중복된 확장자는 제거 후 출력한다. 
		
		// 파일명 모으기 -> 확장자가 없는 건 제외 -> 중복제거 -> 출력
		stream.map(File::getName)
		      .filter(f -> f.lastIndexOf(".") > -1)
		      .map(f -> f.substring(f.lastIndexOf(".")+1))
		      .distinct()
		      .forEach(System.out::println);
	}
}
