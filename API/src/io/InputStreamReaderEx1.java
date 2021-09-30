package io;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.InputStreamReader;

// 보조 스트림
// 문자 변환 보조 스트림
// 바이트 기반 스트림 => Reader or Writer로 변환해서 사용
// ( 문자 단위로 읽고 쓰는 처리를 할 수 있다면 훨씬 편하기 때문에 사용한다. )
// 인코딩 방식을 지정할 수 있다.(utf-8, euc-kr, ms949, ascii...)

public class InputStreamReaderEx1 {
	public static void main(String[] args) {

		try (InputStreamReader reader = new InputStreamReader
				(new FileInputStream("c:\\Temp\\file1.txt"), "ms949");
			FileWriter writer = new FileWriter("c:\\Temp\\test3.txt")) {

			char cbuf[] = new char[100];
			
			while(reader.read(cbuf) != -1) {
				writer.write(cbuf);
			}
		}

		catch (Exception e) {
			e.printStackTrace();
		}

	}

}
