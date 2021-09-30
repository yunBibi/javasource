package io;

import java.io.FileReader;
import java.io.Reader;

/* 처리할 파일이 문자라면 Reader, Writer가 편하다
 * 
 * byte가 아닌 char 형태로 처리할 수 있기 때문
 * 
 */

public class FileReaderEx1 {

	public static void main(String[] args) {
		try (Reader reader = new FileReader("c:\\Temp\\file1.txt")) {

			char[] cbuf = new char[100];

			int readcharNo;

			while ((readcharNo = reader.read(cbuf)) != -1) {
				System.out.println(cbuf);
			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
