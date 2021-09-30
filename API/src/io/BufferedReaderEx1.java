package io;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;

public class BufferedReaderEx1 {
	public static void main(String[] args) {

		// BufferedReader��� �� �� ������ �о���� ���� �����ϴ� (line. ���)

		try (FileReader fr = new FileReader("c:\\Temp\\file1.txt");
				BufferedReader br = new BufferedReader(fr);

				FileWriter fw = new FileWriter("c:\\Temp\\test5.txt");
				BufferedWriter bw = new BufferedWriter(fw)) {

			String line = "";

			while ((line = br.readLine()) != null) {
				bw.write(line);
				bw.newLine();

			}

		} catch (Exception e) {
			e.printStackTrace();
		}

	}

}
