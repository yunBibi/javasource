package io;

import java.io.File;
import java.io.FileWriter;

public class FileWriterEx1 {

	public static void main(String[] args) {
                                                                                 // boolean new file append
		try(FileWriter writer = new FileWriter(new File("c:\\Temp\\test2.txt"), true)) {
			writer.write("FileWriter�� ���ڿ��� �ٷ�\r\n");
			writer.write("����� �� �ִ�\r\n");      // enter : \r\n
			
		} catch (Exception e) {
		}
		
	}

}
