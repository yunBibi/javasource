package io;

import java.io.File;

public class FileEx2 {
	public static void main(String[] args) {
		File file = new File("c:\\temp\\Hello.java");
		
		// ���� �̸�
		String fileName = file.getName();
		
		// . ��ġ
		int pos = fileName.lastIndexOf("."); 
		
		System.out.println("���ϸ� : "+fileName);
		System.out.println("Ȯ���ڸ� ������ ���ϸ� : "+fileName.substring(0, pos));
		System.out.println("Ȯ���� : "+fileName.substring(pos+1));
		
		System.out.println("��θ� ������ ���ϸ� :"+file.getPath());
		System.out.println("������ ���� �ִ� ������ :"+file.getPath());
		
		
	}

}
