package io;

import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;

public class InputStreamEx3 {

	public static void main(String[] args) {
		InputStream in = System.in;
		OutputStream out = System.out;

		try {
			int input = in.read();
			out.write(input);

		} catch (Exception e) {
			e.printStackTrace();
		} finally {   // ������ ����(Exception�� �߻��ϴ� �߻����� �ʴ�)

			try {
				in.close();
				out.close();
			} catch (IOException e) {
				e.printStackTrace();
			}
		}
	}

}
