package Arrays;

import java.util.Arrays;

// �˻�
public class ArraysEx3 {
	public static void main(String[] args) {
		int arr3[]= {37,21,56,99,88,58,62,15,39,78};
		
		// 58�̶�� ���ڰ� �� ��°�� �ִ��� ��ȸ
		// ���� �˻� (vs ���� �˻�)
		for (int i = 0; i < arr3.length; i++) {
			if (arr3[i] == 58) {
				System.out.println(i+1+"��°");
				break;
			} 
		}
		
		System.out.println();
		
		// binarySearch : �����˻�  <- �ӵ��� ���� ������
		//                ������ ���� �� �� �˻��ؾ� ��
		
		// int pos = Arrays.binarySearch(arr3, 58);
		// System.out.println(pos+1+"��° ã����");   // -3��° ã����   (<- ���)
		
		Arrays.sort(arr3);
		int pos = Arrays.binarySearch(arr3, 58);
		System.out.println(pos+1+"��° ã����");
		
	}

}
