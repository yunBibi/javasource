package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedInputStreamEx3 {
	public static void main(String[] args) {

		// FileInputStream�� ����ϴ� ���

		try (FileInputStream fis = new FileInputStream("c:\\Temp\\picture.jpg")) {
			long start = System.currentTimeMillis();
			while (fis.read() != -1) {
			}
			long end = System.currentTimeMillis();
			System.out.println("FileInputStream�� ��� �� " + (end - start));
		} catch (Exception e) {
			e.printStackTrace();
		}

		// FileInputStream + BufferedInputStream ����ϴ� ���

		try (FileInputStream fis = new FileInputStream("c:\\Temp\\picture.jpg");
				BufferedInputStream bis = new BufferedInputStream(fis)) {
			long start = System.currentTimeMillis();
			while (bis.read() != -1) {
			}
			long end = System.currentTimeMillis();
			System.out.println("FileInputStream + BufferedInputStream ��� �� " + (end - start));
		} catch (Exception e) {
			e.printStackTrace();
		}

//		FileInputStream�� ��� �� 59341
//		FileInputStream + BufferedInputStream ��� �� 47

		
		
		
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
