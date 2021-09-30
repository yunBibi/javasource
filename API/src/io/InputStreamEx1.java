package io;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamEx1 {

	public static void main(String[] args) {

		InputStream in = System.in; // InputStream <- �߻�Ŭ����, System.in <- Ű���� �Է�
		int input = 0;

		try {
			// int input = in.read(); // read �� �����δ� byte �ϳ��ۿ� �� ����
			// System.out.println(input); // a�� �о 97�� ��µ�

			while ((input = in.read()) != -1) {
				System.out.print((char)input);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
