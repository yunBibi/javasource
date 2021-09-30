package io;

import java.io.BufferedInputStream;
import java.io.BufferedOutputStream;
import java.io.FileInputStream;
import java.io.FileOutputStream;

public class BufferedInputStreamEx5 {
	public static void main(String[] args) {

		// FileInputStream만 사용하는 경우 + byte배열
		// FileOutpuStream

		try (FileInputStream fis = new FileInputStream("c:\\Temp\\Rolling.mp3");
				FileOutputStream fos = new FileOutputStream("c:\\Temp\\Rolling_copy4.mp3");
				) {
			
			byte data[] = new byte[1024];
			
			long start = System.currentTimeMillis();
			while (fis.read(data) != -1) {
				fos.write(data);
			}
			long end = System.currentTimeMillis();
			System.out.println("FileInputStream + byte + FileOutputStream 사용 시 " + (end - start));
		} catch (Exception e) {
			e.printStackTrace();
		}

		
		
		// FileInputStream + BufferedInputStream + byte배열 사용하는 경우
		// FileOutputStream + BufferedOutputSteam
		try (FileInputStream fis = new FileInputStream("c:\\Temp\\Rolling.mp3");
			FileOutputStream fos = new FileOutputStream("c:\\Temp\\Rolling_copy5.mp3");
			BufferedInputStream bis = new BufferedInputStream(fis);
			BufferedOutputStream bos = new BufferedOutputStream(fos)){
				
			byte data[] = new byte[1024];
			
			long start = System.currentTimeMillis();
			while (bis.read(data) != -1) {
				bos.write(data);
			}
			bos.flush();
			long end = System.currentTimeMillis();
			System.out.println("FileInputStream + BufferedInputStream+byte 사용 시 " + (end - start));
		} catch (Exception e) {
			e.printStackTrace();
		}

	}
	}


