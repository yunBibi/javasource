package io;

import java.io.FileReader;
import java.io.Reader;

/* ó���� ������ ���ڶ�� Reader, Writer�� ���ϴ�
 * 
 * byte�� �ƴ� char ���·� ó���� �� �ֱ� ����
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
