package io;

import java.io.IOException;
import java.io.InputStream;

public class InputStreamEx1 {

	public static void main(String[] args) {

		InputStream in = System.in; // InputStream <- 추상클래스, System.in <- 키보드 입력
		int input = 0;

		try {
			// int input = in.read(); // read 한 번으로는 byte 하나밖에 못 읽음
			// System.out.println(input); // a만 읽어서 97이 출력됨

			while ((input = in.read()) != -1) {
				System.out.print((char)input);
			}

		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
