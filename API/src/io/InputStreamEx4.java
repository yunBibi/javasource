package io;

import java.io.InputStream;
import java.io.OutputStream;

public class InputStreamEx4 {

	public static void main(String[] args) {
		InputStream in = System.in;
		OutputStream out = System.out;
		
		byte[] datas = new byte[100];
		
		// 사용자로부터 이름과 하고 싶은 말을 입력받은 후에
		// String 객체로 변환
		
		System.out.print("이름 : ");
		try {
			int nameBytes = in.read(datas); // 홍길동 + 엔터
			// Enter : carriage return => 13번, line feed :10번 2개의 바이트로 구성이 되어 있기 때문에 -2를 해준다
			String name = new String(datas, 0, nameBytes-2);
			
			System.out.print("하고 싶은말 : ");
			int commentsBytes = in.read(datas);
			String comment = new String(datas,0,commentsBytes-2);
			
			System.out.println("입력한 이름 : "+name);
			System.out.println("입력한 하고 싶은 말 : "+comment);
			
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				in.close();
				out.close();
				
			} catch(Exception e2) {
				e2.printStackTrace();
			}
		}
	}

}
