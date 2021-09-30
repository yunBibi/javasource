package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedInputStreamEx4 {
	public static void main(String[] args) {

		// FileInputStream�� ����ϴ� ��� + byte�迭

		try (FileInputStream fis = new FileInputStream("c:\\Temp\\picture.jpg")) {
			
			byte data[] = new byte[1024];
			
			long start = System.currentTimeMillis();
			while (fis.read(data) != -1) {
			}
			long end = System.currentTimeMillis();
			System.out.println("FileInputStream + byte ��� �� " + (end - start));
		} catch (Exception e) {
			e.printStackTrace();
		}

		// FileInputStream + BufferedInputStream ����ϴ� ��� + byte�迭

		try (FileInputStream fis = new FileInputStream("c:\\Temp\\picture.jpg");
				BufferedInputStream bis = new BufferedInputStream(fis)) {
			
			byte data[] = new byte[1024];
			
			long start = System.currentTimeMillis();
			while (bis.read(data) != -1) {
			}
			long end = System.currentTimeMillis();
			System.out.println("FileInputStream + BufferedInputStream ��� �� " + (end - start));
		} catch (Exception e) {
			e.printStackTrace();
		}

//		FileInputStream�� ��� �� 101
//		FileInputStream + BufferedInputStream ��� �� 36


		
		
		
		
		FileInputStream fis = null;
		BufferedInputStream bis = null;
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;

		try {
//			fis = new FileInputStream("c:\\Temp\\picture.jpg");
			fis = new FileInputStream("c:\\Temp\\Rolling.mp3");
			bis = new BufferedInputStream(fis);
//			fos = new FileOutputStream("c:\\Temp\\picture_copy2.jpg");
			fos = new FileOutputStream("c:\\Temp\\Rolling_copy2.mp3");
			bos = new BufferedOutputStream(fos);

			int data;
			while ((data = bis.read()) != -1) {
				bos.write(data);

			}
			bos.flush(); // ���� ����

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
