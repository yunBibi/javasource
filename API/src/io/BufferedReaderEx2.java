package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferedReaderEx2 {

	public static void main(String[] args) {

		// BufferedInputStreamEx5 ������ �о ȭ�鿡 �ٹ�ȣ�� �Բ� ���
		// FileReader("src/io/BufferedInputStreamEx5.java")

		try (FileReader fr = new FileReader("src/io/BufferedInputStreamEx5.java");
				BufferedReader br = new BufferedReader(fr);) {

			String line = "";
			int i = 1;
			while ((line = br.readLine()) != null) {
				System.out.println(i + " " + line);
				i++;

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
