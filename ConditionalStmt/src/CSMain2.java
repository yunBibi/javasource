import java.util.Scanner;

// �߰���� :
// �⸻��� :
// ---------
// ��� : (�Ҽ��� �� �ڸ���)

public class CSMain2{
	public static void main(String[] args) {
		Scanner k = new Scanner(System.in);
		 
		int mid = k.nextInt();
		System.out.println("�߰���� : ");
		
		int fin = k.nextInt();
		System.out.println("�⸻��� : ");
		
		System.out.println("----------");
		
		double ave = (mid + fin) / 2.0;
		System.out.printf("��� : %.1f��", ave);
		
		// ����� 90�� �̻��̸� ����� ���, �ƴϸ� ��!��� ���
		
		// ���� >= 90 : ��
		// 80 <= ���� < 90 :��
		// 70 <= ���� < 80 : ��
		// 60 <= ���� < 70 : ��
		// ���� < 60 :��
		
		// if(A) {
		//		A ������������ ����
		// }else if(B){
		//		A�� ��, B�� ������������
		// } else if (C){
		///		A, B ��, C�� ������������
		// } ...
		// } else {
		//		���� �ϳ��� �´°� ������
		// }
		
		if (ave >= 90) {
			System.out.println("��");
		} else if (ave >=80) {
			System.out.println("��");
		} else if (ave >= 70) {
			System.out.println("��");
		} else if (ave >= 60) {
			System.out.println("��");
		} else {
			System.out.println("��");
		}
	}
}