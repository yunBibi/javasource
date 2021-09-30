package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedInputStreamEx1 {
	public static void main(String[] args) {
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			
			fis = new FileInputStream("c:\\Temp\\file1.txt");
			bis = new BufferedInputStream(fis);
			fos = new FileOutputStream("c:\\Temp\\test4.txt");
			bos = new BufferedOutputStream(fos);
			
			int data;
			while((data=bis.read()) != -1) {
				bos.write(data);
				
			}
			bos.flush();  // 버퍼 비우기
			
		} catch (Exception e) {
			e.printStackTrace();
		} finally {
			try {
				
				bis.close();
				fis.close();
				bos.close();
				fos.close();
				
			} catch (Exception e2) {
				e2.printStackTrace();			
				
			}
		}
		
	}

}
