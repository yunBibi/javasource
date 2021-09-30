package io;

import java.io.FileInputStream;
import java.io.InputStream;
import java.io.OutputStream;

public class FileInputStreamEx1 {
	public static void main(String[] args) {
//		InputStream in = null;
//		java.io.OutputStream out = System.out;
//
//		byte[] datas = new byte[100];
//
//		try {
//			in = new FileInputStream("c:\\temp\\file1.txt");
//
//			while (in.read(datas) != -1) {
//				out.write(datas);
//			}

//		} catch (FileNotFoundException e) {
//			e.printStackTrace();
//		} catch (IOException e) {
//			e.printStackTrace();
//		} finally {
//			try {
//				in.close();
//				out.close();
//			} catch (IOException e) {
//				e.printStackTrace();
//			}
		
		// try-with resources(JDK 7) :  �ڵ����� �ڿ� ����
		try(InputStream in = new FileInputStream("c:\\temp\\file1.txt");
				OutputStream out = System.out;) {
			
			byte[] datas = new byte[100];
			
			while (in.read(datas) != -1) {
				out.write(datas);
			}
		} catch (Exception e) {
			e.printStackTrace();
		}
		
	
		}
	}


