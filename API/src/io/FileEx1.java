package io;

import java.io.File;

/*
 * File
 * ������ �ٷ�� ���� Ŭ����
 * 
 * ����(���丮)�� ǥ���ϴ� ��ȣ : /, \ 
 * �׷��� �̹� �ڹٿ��� /, \�� �ǹ̸� ������ �ִ�. (ex \t, \n, \b)
 * �׷��� �� ���� �ߺ��ؼ� ������ش�.
 */

public class FileEx1 {

	public static void main(String[] args) {
		File file1 = new File("c:\\temp\\test1.txt");
		File file2 = new File("c:\\temp", "test1.txt");
		
		File file3 = new File("c:\\temp");
		File file4 = new File(file3, "test1.txt");
		
		// File file4 = new File(new File("c:\\temp"), "test1.txt");
	}

}
